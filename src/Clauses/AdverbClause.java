package Clauses;

import GrammaticalConstructions.GrammaticalConstruction;
import Words.ConjugatedWord;

public class AdverbClause extends Clause{
	//needs to be linked to ConjugatedAdverb
	public AdverbClause(ConjugatedWord[] words, GrammaticalConstruction construction){
		super(words, construction);
	}
}
