
package semantics;

import java.util.*;

import tp2.*;

public class FunctionFinder
        extends Walker {

    private Functions functions = new Functions();

    private ArrayList<NParam> currentParamList;

    @Override
    public void caseFun(
            NFun node) {

        // collect parameter list
        this.currentParamList = new ArrayList<NParam>();
        walk(node.get_Params());
        this.functions.addFunction(node, this.currentParamList);
    }

    @Override
    public void caseParam(
            NParam node) {

        this.currentParamList.add(node);
    }

    public static Functions findFunctions(
            Node syntaxTree) {

        FunctionFinder finder = new FunctionFinder();
        finder.walk(syntaxTree);
        return finder.functions;
    }

}
