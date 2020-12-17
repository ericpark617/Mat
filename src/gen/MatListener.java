package gen;

// Generated from C:/Users/Main PC/Documents/untitled\Mat.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatParser}.
 */
public interface MatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MatParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MatParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MatParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(MatParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(MatParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatParser#displayAction}.
	 * @param ctx the parse tree
	 */
	void enterDisplayAction(MatParser.DisplayActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatParser#displayAction}.
	 * @param ctx the parse tree
	 */
	void exitDisplayAction(MatParser.DisplayActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatParser#assignAction}.
	 * @param ctx the parse tree
	 */
	void enterAssignAction(MatParser.AssignActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatParser#assignAction}.
	 * @param ctx the parse tree
	 */
	void exitAssignAction(MatParser.AssignActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatParser#createAction}.
	 * @param ctx the parse tree
	 */
	void enterCreateAction(MatParser.CreateActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatParser#createAction}.
	 * @param ctx the parse tree
	 */
	void exitCreateAction(MatParser.CreateActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(MatParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(MatParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atm}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtm(MatParser.AtmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atm}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtm(MatParser.AtmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(MatParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(MatParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusminus(MatParser.PlusminusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plusminus}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusminus(MatParser.PlusminusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multdiv}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(MatParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multdiv}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(MatParser.MultdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MatParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MatParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDouble(MatParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDouble(MatParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MatParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MatParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Matr}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterMatr(MatParser.MatrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Matr}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitMatr(MatParser.MatrContext ctx);
}