package GrammaticalConstructions;

import java.util.HashMap;
import java.util.HashSet;

import Words.Clause;
import Words.ConjugatedWord;
import Words.Util;

public abstract class GrammaticalConstruction { //MAKE SURE TO ADD ANY NEW GRAMMATICAL CONSTRUCTIONS TO VALUES.GRAMMATICALCONSTRUCTIONS!
	private int chapter;
	private int[] typesModified;
	private Clause construction;
	private HashMap<Integer, HashSet<String>> purposeTranslations; //maps a purpose to a list of viable translations.
	
	public GrammaticalConstruction(int chapter, int[] typesModified, HashMap<Integer, HashSet<String>> purposeTranslations){ 
		this.chapter = chapter;
		this.typesModified = Util.copyArray(typesModified);
		this.construction = new Clause();
		this.purposeTranslations = purposeTranslations;
	}
	
	public GrammaticalConstruction(int chapter, int[] typesModified){ 
		this(chapter, typesModified, new HashMap<Integer, HashSet<String>>());
	}
	
	public Clause appendToClause(Clause input){
		return Clause.concatenateClauses(new Clause[]{input, construction});
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

	public HashMap<Integer, HashSet<String>> getPurposeTranslations() {
		return purposeTranslations;
	}

	public void setPurposeTranslations(HashMap<Integer, HashSet<String>> purposeTranslations) {
		this.purposeTranslations = purposeTranslations;
	}
}

