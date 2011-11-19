
package interpreter;

import semantics.*;

public class BoolValue
        extends Value {

    private boolean value;

    public static final BoolValue FALSE = new BoolValue(false);

    public static final BoolValue TRUE = new BoolValue(true);

    private BoolValue(
            boolean value) {

        this.value = value;
    }

    public boolean getValue() {

        return this.value;
    }

    @Override
    public Type getType() {

        return Type.BOOL;
    }

    public static BoolValue get(
            boolean value) {

        if (value) {
            return TRUE;
        }
        return FALSE;
    }

    @Override
    public String toString() {

        return "" + this.value;
    }
}
