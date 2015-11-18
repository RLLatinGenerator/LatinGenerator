package Clauses;

import Words.ConjugatedWord;
import GrammaticalConstructions.GrammaticalConstruction;

public class Clause{
	GrammaticalConstruction construction;
	ConjugatedWord[] words;
	public Clause(ConjugatedWord[] words, GrammaticalConstruction construction){
		this.construction = construction;
		this.words = words;
	}
	
	public String toString(){
		if(words.length == 1){
			return words[0].toString();
		}
		String string = words[0].toString();
		for(ConjugatedWord word : words){
			string = string + " " + word.toString();
		}
		return string;
	}
	
	public GrammaticalConstruction getConstruction(){
		return construction;
	}

}
