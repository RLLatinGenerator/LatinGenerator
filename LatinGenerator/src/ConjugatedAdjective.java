
public class ConjugatedAdjective extends ConjugatedWord{

	int number;
	int Case;
	int gender;
	
	public ConjugatedAdjective(String conjugatedWord, int number, int Case, int gender) {
		super(conjugatedWord);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
	}

}
