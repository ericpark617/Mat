import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import gen.MatBaseVisitor;
import gen.MatLexer;
import gen.MatParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mat {
    public static void main(String[] args) throws Exception {
        // the if statements were taken from somewhere and prob needs to be replaced
        File inputFile = new File("C:/Users/Main PC/Documents/Mat/src/test.txt");
        InputStream is = null;
        org.antlr.v4.runtime.CharStream input = null;
        if (inputFile.exists()) {
            try {
                is = new FileInputStream(inputFile);
                input = CharStreams.fromStream(is);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally{
                try{
                    is.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        MatLexer lexer = new MatLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MatParser parser = new MatParser(tokens);

        Value value = new EvalVisitor().visit(parser.prog());
        System.out.println("\n" + value);
    }
}

class Value {
    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}

class EvalVisitor extends MatBaseVisitor<Value> {
    Map<String, List<Value>> memory;

    public EvalVisitor() {
        memory = new HashMap<String, List<Value>>();
    }

    @Override
    public Value visitCreateAction(MatParser.CreateActionContext ctx) {
        List<Value> values = new ArrayList<>();
        int m = Integer.parseInt(ctx.INT(0).getText());
        int n = Integer.parseInt(ctx.INT(1).getText());
        values.add(new Value(Integer.valueOf(ctx.INT(0).getText())));
        values.add(new Value(Integer.valueOf(ctx.INT(1).getText())));
        int counter = 0;
        for (TerminalNode tokenNode : ctx.matrix().INT()) {
            values.add(new Value(Integer.valueOf(tokenNode.getText())));
            counter++;
        }
        if (m * n != counter) {
            try {
                throw new Exception("Matrix size does not match specification");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }

        String id = ctx.ID().getText();
        memory.put(id, values);

        return new Value(values);
    }

    @Override
    public Value visitPlusminus(MatParser.PlusminusContext ctx) {
        List<Value> values = new ArrayList<>();
        String operator = ctx.getChild(1).getText();
        int m1 = Integer.valueOf(ctx.matrix(0).INT(0).getText());
        int n1 = Integer.valueOf(ctx.matrix(0).INT(1).getText());
        int m2 = Integer.valueOf(ctx.matrix(1).INT(0).getText());
        int n2 = Integer.valueOf(ctx.matrix(1).INT(1).getText());
        
        if (m1 != m2 || n1 != n2) {
            try {
                throw new Exception("Matrix dimensions are not equal");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
        values.add(new Value(m1));
        values.add(new Value(n1));
        if (operator.equals("+")) {
            int i = 2;
            while (ctx.matrix(0).INT(i) != null) {
                while (ctx.matrix(1).INT(i) != null) {
                    int temp = Integer.valueOf(ctx.matrix(0).INT(i).getText());
                    int temp2 = Integer.valueOf(ctx.matrix(1).INT(i).getText());
                    values.add(new Value(temp+temp2));
                    i++;
                }
            }
        } else {
            int i = 2;
            while (ctx.matrix(0).INT(i) != null) {
                while (ctx.matrix(1).INT(i) != null) {
                    int temp = Integer.valueOf(ctx.matrix(0).INT(i).getText());
                    int temp2 = Integer.valueOf(ctx.matrix(1).INT(i).getText());
                    values.add(new Value(temp-temp2));
                    i++;
                }
            }
        }
        return new Value(values);
    }

    // @Override
    // public Value visitMultdiv(MatParser.MultdivContext ctx) {
    //     List<Value> values = new ArrayList<>();
    //     String operator = ctx.getChild(1).getText();
    //     int m1 = Integer.valueOf(ctx.matrix(0).INT(0).getText());
    //     int n1 = Integer.valueOf(ctx.matrix(0).INT(1).getText());
    //     int m2 = Integer.valueOf(ctx.matrix(1).INT(0).getText());
    //     int n2 = Integer.valueOf(ctx.matrix(1).INT(1).getText());
    //     if (n1 != m2) {
    //         try {
    //             throw new Exception("Number of columns in the first matrix is not equal to the number of rows in the second matrix");
    //         } catch (Exception e) {
    //             e.printStackTrace();
    //             System.exit(1);
    //         }
    //     }
    //     if (operator.equals("*")) {
    //         int newdim1 = Integer.valueOf(ctx.matrix(0).INT(0).getText());
    //         int newdim2 = Integer.valueOf(ctx.matrix(1).INT(1).getText());

    //         values.add(new Value(newdim1));
    //         values.add(new Value(newdim2));

    //         int i = 2;
    //         int j = 2;
    //         int arraycount = 0;
    //         int columncount = 0;
    //         int rowcount = 0;
    //         int addtemp = 0;

    //         while (ctx.matrix(0).INT(i) != null) {
    //             while (ctx.matrix(1).INT(j) != null) {
    //                 //while (columncount < n1)
    //                 //{
    //                 rowcount = 0;
    //                 columncount = 0;
    //                 addtemp=0;
    //                 //i=2;
    //                 //j=2;
    //                     while (rowcount < m2 && columncount < n1)
    //                     {
    //                         int temp = Integer.valueOf(ctx.matrix(0).INT(i).getText());
    //                         int temp2 = Integer.valueOf(ctx.matrix(1).INT(j).getText());

    //                         //int mtemp = temp*temp2;

    //                         addtemp+=temp*temp2;
                            
    //                         rowcount++;
    //                         columncount++;
    //                         i++;
    //                         j++;
    //                     }

    //                     values.add(new Value(addtemp));

    //                     if(ctx.matrix(1).INT(j) != null)
    //                     {
    //                     i = i-columncount;
    //                     rowcount = 0;
    //                     addtemp=0;
    //                     columncount = 0;
    //                     System.out.println(i);
    //                     System.out.println(j);
    //                     }

    //                     // if (ctx.matrix(1).INT(j) != null)
    //                     // {
    //                     //     rowcount = 0;
    //                     //     columncount = 0;

    //                     //     int temp = Integer.valueOf(ctx.matrix(0).INT(i-n1).getText());
    //                     //     int temp2 = Integer.valueOf(ctx.matrix(1).INT(i).getText());
    //                     // }
    //                 //}
    //             }
    //         }
    //     }
    //     return new Value(values);
    // }
}