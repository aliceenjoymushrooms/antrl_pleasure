// Generated from ./src/parser/grammar/Grammar.g4 by ANTLR 4.7.2

package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lang}.
	 * @param ctx the parse tree
	 */
	void enterLang(GrammarParser.LangContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lang}.
	 * @param ctx the parse tree
	 */
	void exitLang(GrammarParser.LangContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GrammarParser.FactorContext ctx);
}