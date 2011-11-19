
package exception;

import interpreter.*;

public class ReturnException
        extends RuntimeException {

    private Value returnValue;

    public ReturnException(
            Value returnValue) {

        this.returnValue = returnValue;
    }

    public Value getReturnValue() {

        return this.returnValue;
    }

}
