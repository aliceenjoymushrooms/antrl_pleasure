package compiler.parser;

import compiler.SymbolTable;

public class Visitor extends GrammarBaseVisitor {
  @Override
  public Object visitWriteStr(GrammarParser.WriteStrContext ctx) {
    String text = ctx.STR().getText();
    text = text.replace("\"", "");
    System.out.println(text);
    return null;
  }

  @Override
  public Object visitWriteExpr(GrammarParser.WriteExprContext ctx) {
    Object ret;
    ret = visit(ctx.expr());

    System.out.println(ret);
    return ret;
  }

  @Override
  public Object visitFactNum(GrammarParser.FactNumContext ctx) {
    double ret = Double.parseDouble(ctx.NUM().getText());
    return ret;
  }

  @Override
  public Object visitFactExpr(GrammarParser.FactExprContext ctx) {
    double val = (double) visit(ctx.val);
    return val;
  }

  @Override
  public Object visitExprSum(GrammarParser.ExprSumContext ctx) {
    double a = (double) visit(ctx.term());
    double b = (double) visit(ctx.expr());

    return a + b;
  }

  @Override
  public Object visitExprMinus(GrammarParser.ExprMinusContext ctx) {
    double a = (double) visit(ctx.term());
    double b = (double) visit(ctx.expr());

    return a - b;
  }

  @Override
  public Object visitTermMul(GrammarParser.TermMulContext ctx) {
    double a = (double) visit(ctx.fact());
    double b = (double) visit(ctx.term());

    return a * b;
  }

  @Override
  public Object visitTermDiv(GrammarParser.TermDivContext ctx) {
    double a = (double) visit(ctx.left);
    double b = (double) visit(ctx.term());

    return a / b;
  }

  @Override
  public Object visitTermMod(GrammarParser.TermModContext ctx) {
    double a = (double) visit(ctx.left);
    double b = (double) visit(ctx.term());

    return a % b;
  }

  @Override
  public Object visitAtr(GrammarParser.AtrContext ctx) {
    Double ret = (double) visit(ctx.expr());
    SymbolTable.getInstance().put(ctx.VAR().getText(), ret);
    return visitChildren(ctx);
  }

  @Override
  public Object visitFactVar(GrammarParser.FactVarContext ctx) {
    return SymbolTable.getInstance().get(ctx.VAR().getText());
    // return visitChildren(ctx);
  }

  @Override
  public Object visitBoolFact(GrammarParser.BoolFactContext ctx) {
    Double ret = (double) visit(ctx.fact());
    return (ret != 0) ? true : false;
  }

  @Override
  public Object visitNegBoolExpr(GrammarParser.NegBoolExprContext ctx) {
    Double ret = (double) visit(ctx.boolExpr());
    return (ret == 0) ? false : true;
  }

  @Override
  public Object visitRelop(GrammarParser.RelopContext ctx) {
    return ctx.op.getText();
  }

  @Override
  public Object visitBoolRelop(GrammarParser.BoolRelopContext ctx) {
    Double a = (double) visit(ctx.left);
    Double b = (double) visit(ctx.right);
    String op = (String) visit(ctx.relop());
    // System.out.println("leftop: "+a);
    // System.out.println("rightop: "+b);
    // System.out.println("op: "+op);
    switch (op) {
    case ">":
      return a > b;
    case "<":
      return a < b;
    case "==":
      return a.equals(b);
    case ">=":
      return a > b || a.equals(b);
    case "<=":
      return a < b || a.equals(b);
    case "!=":
      return !a.equals(b);
    }
    return null;
  }

  @Override
  public Object visitIfStm(GrammarParser.IfStmContext ctx) {
    if ((boolean) visit(ctx.boolExpr())) {
      visit(ctx.block());
    } else {
      System.out.println("False");
    }
    return null;
    // return visitChildren(ctx);
  }

  @Override
  public Object visitIfElseStm(GrammarParser.IfElseStmContext ctx) {
    if ((boolean) visit(ctx.boolExpr())) {
      visit(ctx.b1);
    } else {
      visit(ctx.b2);
    }
    return null;
    //return visitChildren(ctx);
  }

}
