package io.com.lucas.campominado.model;

import java.util.ArrayList;
import java.util.List;

public class Field {
	private final int line;
	private final int column;
	
	private boolean mined = false;
	private boolean open = false;
	private boolean marked = false;
	
	private List<Field> neighbors = new ArrayList<Field>();
	
	
	Field(int line, int column){
		this.line = line;
		this.column = column;
	}
	
	boolean addNeighbor(Field neighbor) {
		
		boolean differentLine = this.line != neighbor.line;
		boolean differentColumn = this.column != neighbor.column;
		boolean diagonal = differentLine & differentColumn;
		
		int deltaLine = Math.abs(this.line - neighbor.line);
		int deltaColumn = Math.abs(this.column - neighbor.column);
		int deltaGeral = deltaColumn + deltaLine;
		
		if(deltaGeral == 1 & !diagonal) {
			neighbors.add(neighbor);
			return true;
		} else if (deltaGeral == 2 & diagonal) {
			neighbors.add(neighbor);
			return true;
		} else {
			return false;
		}
		
	}
	
}
