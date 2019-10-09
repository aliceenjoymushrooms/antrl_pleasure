// Generated from ./src/parser/grammar/Grammar.g4 by ANTLR 4.7.2

package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#progr}.
	 * @param ctx the parse tree
	 */
	void enterProgr(GrammarParser.ProgrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#progr}.
	 * @param ctx the parse tree
	 */
	void exitProgr(GrammarParser.ProgrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineRead}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineRead(GrammarParser.LineReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineRead}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineRead(GrammarParser.LineReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineWrite}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineWrite(GrammarParser.LineWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineWrite}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineWrite(GrammarParser.LineWriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineAtr}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineAtr(GrammarParser.LineAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineAtr}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineAtr(GrammarParser.LineAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineIfStm}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineIfStm(GrammarParser.LineIfStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineIfStm}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineIfStm(GrammarParser.LineIfStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(GrammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(GrammarParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeStr}
	 * labeled alternative in {@link GrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWriteStr(GrammarParser.WriteStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeStr}
	 * labeled alternative in {@link GrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWriteStr(GrammarParser.WriteStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link GrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWriteExpr(GrammarParser.WriteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link GrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWriteExpr(GrammarParser.WriteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(GrammarParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(GrammarParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIfstm(GrammarParser.IfstmContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIfstm(GrammarParser.IfstmContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(GrammarParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(GrammarParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(GrammarParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(GrammarParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(GrammarParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(GrammarParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
}