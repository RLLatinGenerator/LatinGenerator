package GrammaticalConstructions;

import Clauses.Clause;

public abstract class GrammaticalConstruction {
	int chapter;
	
	public GrammaticalConstruction(int chapter){
		this.chapter = chapter;
	}
	
	public int getChapter() {
		return chapter;
	}
	
	public abstract Clause makeClause();
	
}
