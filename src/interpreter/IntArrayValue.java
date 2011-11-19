
package interpreter;

import semantics.*;
import tp2.*;
import exception.*;

public class IntArrayValue
        extends Value {

    private int[] value;

    public IntArrayValue(
            int size) {

        this.value = new int[size];
    }

    // le jeton sert à localiser l'erreur
    public int get(
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
            int value,
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

        return Type.INT_ARRAY;
    }
}
