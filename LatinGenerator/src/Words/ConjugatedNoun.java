package Words;

public class ConjugatedNoun extends ConjugatedWord{
	int number;
	int Case;
	int gender;
	
	public ConjugatedNoun(Noun unConjugated, String noun, int purpose, int number, int Case, int gender){
		super(unConjugated, noun, purpose);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
	}
	

}
