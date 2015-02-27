package Words;

public class ConjugatedNoun extends ConjugatedWord{
	int number;
	int Case;
	int gender;
	
	public ConjugatedNoun(Noun unConjugated, String noun, int number, int Case, int gender){
		super((Word) unConjugated, noun);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
	}
	

}
