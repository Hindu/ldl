package parse.parsetree.nodes;

import parse.parsetree.Node;
import parse.syntaxtree.NodeAST;
import parse.syntaxtree.nodes.NumberAST;

public class Number extends Node {
	private Double number;

	public Number(Double number) {
		this.number = number;
	}

	public Double getNumber() {
		return number;
	}

	@Override
	public NodeAST getConvertedSubtree() {
		return new NumberAST(getNumber());
	}
	
}
