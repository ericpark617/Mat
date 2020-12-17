package java;

import java.util.ArrayList;
import java.util.List;

import gen.MatBaseVisitor;
import gen.MatParser;

public class MatrixVisitor extends MatBaseVisitor<List<List<Integer>>>{
    //@Override
    public List<List<Integer>> visitMatrixAction(MatParser.MatrixContext ctx) {
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        

        return matrix;
    }
}
