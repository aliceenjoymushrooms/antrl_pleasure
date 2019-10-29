// Generated from ./src/parser/grammar/Grammar.g4 by ANTLR 4.7.2

package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#progr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgr(GrammarParser.ProgrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineRead}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineRead(GrammarParser.LineReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineWrite}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineWrite(GrammarParser.LineWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineAtr}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineAtr(GrammarParser.LineAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineIfStm}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineIfStm(GrammarParser.LineIfStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(GrammarParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeStr}
	 * labeled alternative in {@link GrammarParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStr(GrammarParser.WriteStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link GrammarParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteExpr(GrammarParser.WriteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtr(GrammarParser.AtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStm}
	 * labeled alternative in {@link GrammarParser#ifstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStm(GrammarParser.IfElseStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStm}
	 * labeled alternative in {@link GrammarParser#ifstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStm(GrammarParser.IfStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSum}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSum(GrammarParser.ExprSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(GrammarParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSingle}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSingle(GrammarParser.ExprSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMul}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMul(GrammarParser.TermMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDiv(GrammarParser.TermDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMod(GrammarParser.TermModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termSingle}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermSingle(GrammarParser.TermSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factVar}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactVar(GrammarParser.FactVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factNum}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactNum(GrammarParser.FactNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactExpr(GrammarParser.FactExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolFact}
	 * labeled alternative in {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFact(GrammarParser.BoolFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negBoolExpr}
	 * labeled alternative in {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegBoolExpr(GrammarParser.NegBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolRelop}
	 * labeled alternative in {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolRelop(GrammarParser.BoolRelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(GrammarParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
}