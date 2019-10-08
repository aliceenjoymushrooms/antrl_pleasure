/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

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

/**
 *
 * @author wellington
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CharStream fileStream = new ANTLRFileStream("example.in");


        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()){
            String input = s.nextLine();
            Integer r = parse(input);
            System.out.println(">>> " + r);
        }
    }

    private static Integer parse(String text) throws RecognitionException {
        CharStream input = new ANTLRInputStream(text+"\n");
        GrammarLexer lexer = new GrammarLexer(input);
        TokenStream tokens = new BufferedTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        GrammarParser.LangContext lang = parser.lang();
        return lang.value;
    }

      private static void showParseTreeFrame(ParseTree tree, GrammarParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(3);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
