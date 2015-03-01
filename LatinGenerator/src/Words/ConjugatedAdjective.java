package Words;

public class ConjugatedAdjective extends ConjugatedWord{

	int Case;
	int number;
	int gender;
	static String word;
	public ConjugatedAdjective(Adjective unConjugated, String conjugatedWord, int purpose, int number, int Case, int gender) {
		super(unConjugated, conjugatedWord, purpose);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
		this.word = conjugatedWord;
	}
	public static String getconjugatedWord(){
		return word;
	}

}
