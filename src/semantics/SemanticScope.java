
package semantics;

import java.util.*;

import tp2.*;
import exception.*;

public class SemanticScope {

    private Map<String, Type> variables = new HashMap<String, Type>();

    private SemanticScope parent;

    public SemanticScope(
            SemanticScope parent) {

        this.parent = parent;
    }

    public void declareVar(
            NId var,
            Type type) {

        String varName = var.getText();

        if (getTypeOrNull(var) != null) {
            throw new SemanticException("redéfinition de la variable "
                    + varName, var);
        }

        this.variables.put(varName, type);
    }

    public Type getType(
            NId var) {

        Type type = getTypeOrNull(var);

        if (type == null) {
            throw new SemanticException("variable " + var.getText()
                    + " non déclarée", var);
        }

        return type;
    }

    private Type getTypeOrNull(
            NId var) {

        String varName = var.getText();

        if (this.variables.containsKey(varName)) {
            return this.variables.get(varName);
        }
        else if (this.parent != null) {
            return this.parent.getTypeOrNull(var);
        }
        else {
            return null;
        }
    }

    // fonction pour déclarer la variable implicite args
    public void declareArgs() {

        this.variables.put("args", Type.STRING_ARRAY);
    }
}
