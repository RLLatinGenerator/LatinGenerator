
public class ConjugatedVerb extends ConjugatedWord{
	int number;
	int person;
	int tense;
	
	public ConjugatedVerb(String conjugatedVerb, int tense, int number, int person){
		super(conjugatedVerb);
		this.number = number;
		this.person = person;
		this.tense = tense;
	}
}
