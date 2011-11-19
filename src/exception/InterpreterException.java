
package exception;

import tp2.*;

public class InterpreterException
        extends RuntimeException {

    public InterpreterException(
            String message,
            Token token) {

        super(message + " at line " + token.getLine() + " position "
                + token.getPos());
    }

}
