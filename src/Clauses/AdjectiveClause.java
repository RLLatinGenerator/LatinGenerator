package Clauses;

import GrammaticalConstructions.GrammaticalConstruction;
import Words.ConjugatedWord;

public class AdjectiveClause extends Clause{
	//Conjugated1Adjectives need to convert to AdjectiveClause
	public AdjectiveClause(ConjugatedWord[] words, GrammaticalConstruction construction){
		super(words, construction);
	}
}
