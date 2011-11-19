
package interpreter;

import semantics.*;

public class IntValue
        extends Value {

    private int value;

    public IntValue(
            int value) {

        this.value = value;
    }

    public int getValue() {

        return this.value;
    }

    @Override
    public Type getType() {

        return Type.INT;
    }

    @Override
    public String toString() {

        return "" + this.value;
    }
}
