package parse.syntaxtree.nodes;

import generation.walkers.TreeWalker;
import parse.syntaxtree.NodeAST;

public class FormalParamsAST extends NodeAST implements Cloneable {

    @Override
    public void accept(TreeWalker walker) {
	walker.accept(this);

    }

    public FormalParamsAST clone() {
	FormalParamsAST copy = new FormalParamsAST();
	
	return copy;
    }

}
