
public class ConjugatedVerb extends ConjugatedWord{
	int number;
	int person;
	int tense;
	
	public ConjugatedVerb(Verb unConjugated, String conjugatedVerb, int tense, int number, int person){
		super(unConjugated, conjugatedVerb);
		this.number = number;
		this.person = person;
		this.tense = tense;
	}
}
