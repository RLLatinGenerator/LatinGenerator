package GrammaticalConstructions;


import Clauses.Clause;
import Words.Adjective;
import Words.ConjugatedWord;
import Words.FullNoun;
import Words.Purpose;
import Words.Values;

public class AblativeAbsolute extends GrammaticalConstruction{
	FullNoun noun;
	Adjective adjective;
	int number;
	public AblativeAbsolute(FullNoun noun, Adjective adjective, int number){
		//kinda needs participles
		super(51);
		this.noun = noun;
		this.adjective = adjective;
		this.number = number;
	}
	
	public Clause makeClause() {
		return new Clause(new ConjugatedWord[]{noun.decline(Purpose.NOUN_ABLATIVE_ABSOLUTE_SUBJECT, Values.CASE_ABLATIVE, number), adjective.decline(Values.CASE_ABLATIVE, number, noun.getGender(), Purpose.ADJECTIVE_ABLATIVE_ABSOLUTE_PREDICATE)}, this);
	}
	
	
}
