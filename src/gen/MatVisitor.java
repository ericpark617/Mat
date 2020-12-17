package gen;

// Generated from c:\Users\Main PC\Documents\Mat\src\Mat.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MatVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MatParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MatParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisplayAction}
	 * labeled alternative in {@link MatParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayAction(MatParser.DisplayActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignAction}
	 * labeled alternative in {@link MatParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAction(MatParser.AssignActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateAction}
	 * labeled alternative in {@link MatParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAction(MatParser.CreateActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(MatParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atm}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtm(MatParser.AtmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(MatParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plusminus}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusminus(MatParser.PlusminusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multdiv}
	 * labeled alternative in {@link MatParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultdiv(MatParser.MultdivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MatParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(MatParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MatParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Matr}
	 * labeled alternative in {@link MatParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatr(MatParser.MatrContext ctx);
}