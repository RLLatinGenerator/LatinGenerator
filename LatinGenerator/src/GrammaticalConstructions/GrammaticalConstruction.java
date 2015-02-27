package GrammaticalConstructions;

import java.util.ArrayList;

import Words.Clause;
import Words.ConjugatedWord;
import Words.Util;

public abstract class GrammaticalConstruction {
	private int chapter;
	private int[] typesModified;
	private Clause construction;
	
	public GrammaticalConstruction(int chapter, int[] typesModified, Clause construction){
		this.chapter = chapter;
		this.typesModified = Util.copyArray(typesModified);
		this.construction = new Clause(construction);
	}
	
	public Clause appendToClause(Clause input){
		return Clause.appendClauses(new Clause[]{input, construction});
	}
	
	public abstract Clause generateRandomGrammaticalConstruction(ConjugatedWord modified, int maxChapter);
	
	public int getChapter() {
		return chapter;
	}

	public int[] getTypesModified() {
		return typesModified;
	}

	public Clause getConstruction() {
		return construction;
	}
	
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public void setTypesModified(int[] typesModified) {
		this.typesModified = typesModified;
	}

	public void setConstruction(Clause construction) {
		this.construction = construction;
	}
}
