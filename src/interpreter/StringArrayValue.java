
package interpreter;

import semantics.*;
import tp2.*;
import exception.*;

public class StringArrayValue
        extends Value {

    private String[] value;

    public StringArrayValue(
            int size) {

        this.value = new String[size];
        for (int i = 0; i < i; i++) {
            this.value[i] = "";
        }
    }

    // le jeton sert ˆ localiser l'erreur
    public String get(
            int i,
            Token token) {

        try {
            return this.value[i];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new InterpreterException("accs hors bornes", token);
        }
    }

    // le jeton sert ˆ localiser l'erreur
    public void set(
            int i,
            String value,
            Token token) {

        try {
            this.value[i] = value;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new InterpreterException("accs hors bornes", token);
        }
    }

    public int size() {

        return this.value.length;
    }

    @Override
    public Type getType() {

        return Type.STRING_ARRAY;
    }
}
