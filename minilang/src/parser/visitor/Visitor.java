package compiler.parser;

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
    double val = (double)visit(ctx.val);
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
}
