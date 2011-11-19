
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

    // le jeton sert à localiser l'erreur
    public boolean get(
            int i,
            Token token) {

        try {
            return this.value[i];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new InterpreterException("accès hors bornes", token);
        }
    }

    // le jeton sert à localiser l'erreur
    public void set(
            int i,
            boolean value,
            Token token) {

        try {
            this.value[i] = value;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new InterpreterException("accès hors bornes", token);
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
