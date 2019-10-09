package compiler.parser;

public class Visitor extends GrammarBaseVisitor {
  @Override public Object visitWriteStr(GrammarParser.WriteStrContext ctx) {
    String text = ctx.STR().getText();
    text = text.replace("\"", "");
    System.out.println(text);
    return super.visitChildren(ctx);
  }
}
