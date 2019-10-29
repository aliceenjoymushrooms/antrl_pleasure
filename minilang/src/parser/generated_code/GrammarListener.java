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
	 * Enter a parse tree produced by the {@code ifElseStm}
	 * labeled alternative in {@link GrammarParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStm(GrammarParser.IfElseStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStm}
	 * labeled alternative in {@link GrammarParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStm(GrammarParser.IfElseStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStm}
	 * labeled alternative in {@link GrammarParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIfStm(GrammarParser.IfStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStm}
	 * labeled alternative in {@link GrammarParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIfStm(GrammarParser.IfStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSum}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSum(GrammarParser.ExprSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSum}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSum(GrammarParser.ExprSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(GrammarParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(GrammarParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSingle}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSingle(GrammarParser.ExprSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSingle}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSingle(GrammarParser.ExprSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termMul}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMul(GrammarParser.TermMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termMul}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMul(GrammarParser.TermMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermDiv(GrammarParser.TermDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermDiv(GrammarParser.TermDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMod(GrammarParser.TermModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMod(GrammarParser.TermModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termSingle}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermSingle(GrammarParser.TermSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termSingle}
	 * labeled alternative in {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermSingle(GrammarParser.TermSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factVar}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactVar(GrammarParser.FactVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factVar}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactVar(GrammarParser.FactVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factNum}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactNum(GrammarParser.FactNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factNum}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactNum(GrammarParser.FactNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactExpr(GrammarParser.FactExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactExpr(GrammarParser.FactExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolFact}
	 * labeled alternative in {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolFact(GrammarParser.BoolFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolFact}
	 * labeled alternative in {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolFact(GrammarParser.BoolFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negBoolExpr}
	 * labeled alternative in {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegBoolExpr(GrammarParser.NegBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negBoolExpr}
	 * labeled alternative in {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegBoolExpr(GrammarParser.NegBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolRelop}
	 * labeled alternative in {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolRelop(GrammarParser.BoolRelopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolRelop}
	 * labeled alternative in {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolRelop(GrammarParser.BoolRelopContext ctx);
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