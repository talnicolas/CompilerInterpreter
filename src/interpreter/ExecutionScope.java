
package interpreter;

import java.util.*;

import tp2.*;
import exception.*;

public class ExecutionScope {

    private Map<String, Value> variables = new HashMap<String, Value>();

    private ExecutionScope parent;

    public ExecutionScope(
            ExecutionScope parent) {

        this.parent = parent;
    }

    public void declareVar(
            NId var,
            Value value) {

        String varName = var.getText();

        if (this.variables.containsKey(varName)) {
            throw new InternalException("la variable " + varName
                    + " est déjà déclarée");
        }

        this.variables.put(varName, value);
    }

    public Value getValue(
            NId var) {

        String varName = var.getText();

        if (this.variables.containsKey(varName)) {
            return this.variables.get(varName);
        }
        else if (this.parent != null) {
            return this.parent.getValue(var);
        }
        else {
            throw new InternalException("la variable " + varName
                    + " est manquante");
        }
    }

    public void setValue(
            NId var,
            Value value) {

        String varName = var.getText();

        if (this.variables.containsKey(varName)) {
            this.variables.put(varName, value);
        }
        else if (this.parent != null) {
            this.parent.setValue(var, value);
        }
        else {
            throw new InternalException("la variable " + varName
                    + " est manquante");
        }
    }

    // special method to declare the implicit args variable
    public void declareArgs(
            String[] commandLineArguments) {

        int size = commandLineArguments.length;
        StringArrayValue args = new StringArrayValue(size);
        for (int i = 0; i < size; i++) {
            args.set(i, commandLineArguments[i], null);
        }
        this.variables.put("args", args);
    }

}
