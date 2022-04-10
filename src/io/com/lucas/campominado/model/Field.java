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
		return true;
	}
	
}
