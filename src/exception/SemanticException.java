
package exception;

import tp2.*;

public class SemanticException
        extends RuntimeException {

    public SemanticException(
            String message,
            Token token) {

        super(message + " � la ligne " + token.getLine() + " position "
                + token.getPos());
    }
}
