package primerproyecto;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        System.out.println("Hello World!");

        CharStream input = CharStreams.fromFileName("input/codigo.txt");

        // create a lexer that feeds off of input CharStream
        EjemploLexer lexer = new EjemploLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Populate the tokens from the lexer
        tokens.fill();
        
        // Iterate over all tokens
        for (Token token : tokens.getTokens()) {
            String tokenType = EjemploLexer.VOCABULARY.getSymbolicName(token.getType());
            System.out.println("Linea " + token.getLine() + ": Tipo de token = " + tokenType + ", Token = " + token.getText());
        }

        EjemploParser parser = new EjemploParser(tokens);
        
        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("Parsing completed successfully!");
        } else {
            System.out.println("Parsing completed with errors.");
        }
    }
}
