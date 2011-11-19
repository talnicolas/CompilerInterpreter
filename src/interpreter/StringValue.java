
package interpreter;

import semantics.*;
import exception.*;

public class StringValue
        extends Value {

    private String value;

    public StringValue(
            String value) {

        if (value == null) {
            throw new InternalException("null n'est pas permis");
        }

        this.value = value;
    }

    public String getValue() {

        return this.value;
    }

    @Override
    public Type getType() {

        return Type.STRING;
    }

    @Override
    public String toString() {

        return this.value;
    }
}
