package Clauses;

import GrammaticalConstructions.GrammaticalConstruction;
import Words.ConjugatedWord;

public class IndependentClause extends Clause{
	AdverbClause[] adverbs;
	AdjectiveClause[] adjectives;
	public IndependentClause(ConjugatedWord[] words, GrammaticalConstruction construction){
		super(words, construction);
	}
	public IndependentClause(ConjugatedWord[] words, GrammaticalConstruction construction, AdverbClause[] adverbs){
		super(words, construction);
		this.adverbs = adverbs;
	}
	public IndependentClause(ConjugatedWord[] words, GrammaticalConstruction construction, AdjectiveClause[] adjectives){
		super(words, construction);
		this.adjectives = adjectives;
	}
	public IndependentClause(ConjugatedWord[] words, GrammaticalConstruction construction, AdjectiveClause[] adjectives, AdverbClause[] adverbs){
		super(words, construction);
		this.adjectives = adjectives;
		this.adverbs = adverbs;
	}
	
}
