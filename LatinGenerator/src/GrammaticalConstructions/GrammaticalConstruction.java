package GrammaticalConstructions;

import java.util.ArrayList;

import Words.Clause;
import Words.ConjugatedWord;
import Words.Util;
import Words.Word;

public abstract class GrammaticalConstruction {
	int chapter;
	int[] typesModified;
	ArrayList<ConjugatedWord> words;
	
	public GrammaticalConstruction(int chapter, int[] typesModified, ArrayList<ConjugatedWord> words){
		this.chapter = chapter;
		this.typesModified = Util.copyArray(typesModified);
		this.words = new ArrayList<ConjugatedWord>(words);
	}
	
	public abstract Clause generateGrammaticalConstruction(Word modified);
	
}
