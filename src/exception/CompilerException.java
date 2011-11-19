
package exception;

import tp2.*;

public class CompilerException
        extends RuntimeException {

    public CompilerException(
            String message,
            Token token) {

        super(message + " ˆ la ligne " + token.getLine() + " position "
                + token.getPos());
    }
}
