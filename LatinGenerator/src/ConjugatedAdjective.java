
public class ConjugatedAdjective extends ConjugatedWord{

	int plurality;
	int Case;
	int gender;
	
	public ConjugatedAdjective(String conjugatedWord, int plurality, int Case, int gender) {
		super(conjugatedWord);
		this.plurality = plurality;
		this.Case = Case;
		this.gender = gender;
	}

}
