package parse.syntaxtree.nodes;

import generation.walkers.TreeWalker;
import parse.parsetree.nodes.Identifier;
import parse.syntaxtree.NodeAST;

public class DescriptionAST extends NodeAST {
	private IdentifierAST identifier;
	private TypeAST type;
	
	public void setIdentifier(IdentifierAST identifier) {
		this.identifier = identifier;
		addSuccessor(identifier);
	}


	public void setType(TypeAST type) {
		this.type = type;
		addSuccessor(type);
	}


	public IdentifierAST getIdentifier() {
		return identifier;
	}


	public TypeAST getType() {
		return type;
	}


	@Override
	public void accept(TreeWalker walker) {
		walker.accept(this);

	}

}
