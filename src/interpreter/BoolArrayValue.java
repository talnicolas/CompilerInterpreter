
package interpreter;

import semantics.*;
import tp2.*;
import exception.*;

public class BoolArrayValue
        extends Value {

    private boolean[] value;

    public BoolArrayValue(
            int size) {

        this.value = new boolean[size];
    }

    // le jeton sert � localiser l'erreur
    public boolean get(
            int i,
            Token token) {

        try {
            return this.value[i];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new InterpreterException("acc�s hors bornes", token);
        }
    }

    // le jeton sert � localiser l'erreur
    public void set(
            int i,
            boolean value,
            Token token) {

        try {
            this.value[i] = value;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new InterpreterException("acc�s hors bornes", token);
        }
    }

    public int size() {

        return this.value.length;
    }

    @Override
    public Type getType() {

        return Type.BOOL_ARRAY;
    }
}
