import exception.*;
import generation.*;

import java.io.*;

import semantics.*;
import tp2.*;


public class MiniLangCompiler {

    public static void main(
            String[] args) {

        try {
            if (args.length != 1) {
                System.out.println("usage:");
                System.out.println(" Java MiniLangCompiler fichiersource");
                System.exit(0);
            }

            Reader in = new FileReader(args[0]);

            Node syntaxTree = new Parser(in).parse();

            Functions functions = FunctionFinder.findFunctions(syntaxTree);

            new SemanticVerifier(functions).walk(syntaxTree);
            new CodeGenerator(functions).walk(syntaxTree);
        }
        catch (LexerException e) {
            System.out.flush();
            System.err.println("Erreur lexicale : " + e.getMessage());
            System.exit(1);
        }
        catch (ParserException e) {
            System.out.flush();
            System.err.println("Erreur syntaxique : " + e.getMessage());
            System.exit(1);
        }
        catch (SemanticException e) {
            System.out.flush();
            System.err.println("Erreur s�mantique : " + e.getMessage());
            System.exit(1);
        }
        catch (CompilerException e) {
            System.out.flush();
            System.err.println("Restriction (temporaire) du compilateur : "
                    + e.getMessage());
            System.exit(1);
        }
        catch (IOException e) {
            System.out.flush();
            System.err.println("Erreur d'E/S : " + e.getMessage());
            System.exit(1);
        }
        catch (InternalException e) {
            System.out.flush();
            e.printStackTrace();
            System.err.println("Bogue : " + e.getMessage());
            System.exit(1);
        }
        catch (Exception e) {
            System.out.flush();
            e.printStackTrace();
            System.err.println("Bogue non-anticip� : " + e.getMessage());
            System.exit(1);
        }
    }

}
