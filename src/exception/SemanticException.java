
package exception;

import tp2.*;

public class SemanticException
        extends RuntimeException {

    public SemanticException(
            String message,
            Token token) {

        super(message + " ˆ la ligne " + token.getLine() + " position "
                + token.getPos());
    }
}
