
public class ConjugatedAdjective extends ConjugatedWord{

	int number;
	int Case;
	int gender;
	
	public ConjugatedAdjective(Adjective unConjugated, String conjugatedWord, int number, int Case, int gender) {
		super(unConjugated, conjugatedWord);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
	}

}
