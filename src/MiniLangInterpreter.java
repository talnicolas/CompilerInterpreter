import interpreter.*;

import java.io.*;

import semantics.*;
import tp2.*;
import exception.*;

public class MiniLangInterpreter {

    public static void main(
            String[] args) {

        try {
            if (args.length == 0) {
                System.out.println("usage:");
                System.out
                        .println(" Java MiniLangInterpreter fichiersource arg...");
                System.exit(0);
            }

            Reader in = new FileReader(args[0]);

            Node syntaxTree = new Parser(in).parse();

            Functions functions = FunctionFinder.findFunctions(syntaxTree);

            new SemanticVerifier(functions).walk(syntaxTree);

            String[] arguments = new String[args.length - 1];
            System.arraycopy(args, 1, arguments, 0, args.length - 1);
            new Interpreter(functions, arguments).walk(syntaxTree);
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
            System.err.println("Erreur sémantique : " + e.getMessage());
            System.exit(1);
        }
        catch (InterpreterException e) {
            System.out.flush();
            System.err.println("Erreur d'exécution : " + e.getMessage());
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
            System.err.println("Bogue non-anticipé : " + e.getMessage());
            System.exit(1);
        }
    }
}
