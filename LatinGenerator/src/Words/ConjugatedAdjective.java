package Words;

public class ConjugatedAdjective extends ConjugatedWord{

	int Case;
	int number;
	int gender;

	public ConjugatedAdjective(Adjective unConjugated, String conjugatedWord, int purpose, int number, int Case, int gender) {
		super(unConjugated, conjugatedWord, purpose);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
	}

}
