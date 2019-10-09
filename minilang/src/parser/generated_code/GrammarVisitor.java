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
	 * Visit a parse tree produced by {@link GrammarParser#ifstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstm(GrammarParser.IfstmContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(GrammarParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(GrammarParser.BoolExprContext ctx);
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