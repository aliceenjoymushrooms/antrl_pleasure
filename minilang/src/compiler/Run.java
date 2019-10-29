/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import compiler.parser.GrammarLexer;
import compiler.parser.GrammarParser;
import compiler.parser.Visitor;
import compiler.SymbolTable;

/**
 *
 * @author wellington + me
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // CharStream fileStream = new ANTLRFileStream("example.in");

        // repl
        // Scanner s = new Scanner(System.in);
        /*
         * while (s.hasNextLine()) { String input = s.nextLine(); Integer r =
         * parse(input); }
         */

        // file input
        System.out.println("Going to exec: " + args[0]);
        File file = new File(args[0]);
        Scanner s = new Scanner(file);
        String input = "";
        while (s.hasNextLine()) {
            input = input + s.nextLine();
        }
        Integer r = parse(input);
    }

    private static Integer parse(String text) throws RecognitionException {
        CharStream input = new ANTLRInputStream(text + "\n");
        GrammarLexer lexer = new GrammarLexer(input);
        TokenStream tokens = new BufferedTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        // GrammarParser.ProgrContext progr = parser.progr();
        ParseTree tree = parser.progr();
        Visitor visitor = new Visitor();
        visitor.visit(tree);

        // Exibir a arvore
         showParseTreeFrame(tree, parser);

        return 1;// prog.value;
    }

    /*
     * private static void showParseTreeFrame(ParseTree tree, GrammarParser parser)
     * throws HeadlessException { JFrame frame = new JFrame("SRC: " +
     * tree.getText()); JPanel panel = new JPanel(); TreeViewer viewr = new
     * TreeViewer(Arrays.asList(parser.getRuleNames()), tree); viewr.setScale(3);
     * panel.add(viewr); frame.add(panel); frame.setSize(1000, 600);
     * frame.setState(JFrame.MAXIMIZED_HORIZ);
     * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true);
     * }
     */
    private static void showParseTreeFrame(ParseTree tree, GrammarParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewr.setScale(1);
        JPanel panel = new JPanel();
        panel.add(viewr);
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setAutoscrolls(true);
        frame.add(scroll);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panelToImagem(panel);
    }

    private static void panelToImagem(JPanel panel) {
        BufferedImage image = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.createGraphics();
        panel.paint(g);
        g.dispose();
        try {
            ImageIO.write(image, "png", new File("CST.png"));
        } catch (Exception e) {
        }
    }
}
