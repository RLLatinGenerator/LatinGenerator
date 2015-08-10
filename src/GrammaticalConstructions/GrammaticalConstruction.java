package GrammaticalConstructions;

import java.util.HashMap;
import java.util.HashSet;

import Words.Clause;
import Words.ConjugatedWord;
import Words.Util;

public abstract class GrammaticalConstruction { //MAKE SURE TO ADD ANY NEW GRAMMATICAL CONSTRUCTIONS TO VALUES.GRAMMATICALCONSTRUCTIONS! These are factories.
	private int chapter;
	private int[] typesModified;
	//private Clause construction;
	private HashMap<Integer, HashSet<String>> purposeTranslations; /* maps a purpose to a list of viable translations. 
	IMPORTANT: 
	[Null : This word and purpose can be ommitted completely], 
	[Blank string included : Only normal word required], 
	[Given string has nothing but a purpose : The purpose alone is a sufficient translation. No normal definition is needed.] (Ex. ut + purpose clause. we don't want a random 'as' required.)
	[Given string ends with a '+' : A normal definition must be added in addition to the purpose translation]
	
	*/
	public GrammaticalConstruction(int chapter, int[] typesModified, HashMap<Integer, HashSet<String>> purposeTranslations){ 
		this.chapter = chapter;
		this.typesModified = Util.copyArray(typesModified);
		//this.construction = new Clause();
		this.purposeTranslations = purposeTranslations;
	}
	
	public GrammaticalConstruction(){
		
	}
	
	public GrammaticalConstruction(int chapter, int[] typesModified){ 
		this(chapter, typesModified, new HashMap<Integer, HashSet<String>>());
	}
	
	/*
	public Clause appendToClause(Clause input){
		return Clause.concatenateClauses(new Clause[]{input, construction});
	}
	*/
	
	public abstract Clause generateRandomGrammaticalConstruction(ConjugatedWord modified, int maxChapter);
	
	public int getChapter() {
		return chapter;
	}

	public int[] getTypesModified() {
		return typesModified;
	}


	
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public void setTypesModified(int[] typesModified) {
		this.typesModified = typesModified;
	}

	/*
	public void setConstruction(Clause construction) {
		this.construction = construction;
	}
	
	public Clause getConstruction() {
		return construction;
	}
*/
	
	public HashMap<Integer, HashSet<String>> getPurposeTranslations() {
		return purposeTranslations;
	}

	public void setPurposeTranslations(HashMap<Integer, HashSet<String>> purposeTranslations) {
		this.purposeTranslations = purposeTranslations;
	}
}

