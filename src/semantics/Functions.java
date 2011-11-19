
package semantics;

import java.util.*;

import tp2.*;
import exception.*;

public class Functions {

    private Map<String, NFun> functions = new HashMap<String, NFun>();

    private Map<String, ArrayList<NParam>> paramLists = new HashMap<String, ArrayList<NParam>>();

    public void addFunction(
            NFun node,
            ArrayList<NParam> paramList) {

        String funName = node.get_Name().getText();

        if (this.functions.containsKey(funName)) {
            throw new SemanticException("redéfinition de la fonction "
                    + funName, node.get_Name());
        }

        this.functions.put(funName, node);
        this.paramLists.put(funName, paramList);
    }

    public NFun getFunction(
            NId id) {

        String funName = id.getText();

        if (!this.functions.containsKey(funName)) {
            throw new SemanticException("la fonction " + funName
                    + " n'est pas définie", id);
        }

        return this.functions.get(funName);
    }

    public ArrayList<NParam> getParamList(
            NId id) {

        String funName = id.getText();

        if (!this.functions.containsKey(funName)) {
            throw new SemanticException("la fonction " + funName
                    + " n'est pas définie", id);
        }

        return this.paramLists.get(funName);
    }
}
