
public class ConjugatedAdjective extends ConjugatedWord{

	int Case;
	int number;
	int gender;
	
	public ConjugatedAdjective(String conjugatedWord, int Case, int number, int gender) {
		super(conjugatedWord);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
	}

}
