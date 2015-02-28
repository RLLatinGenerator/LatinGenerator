package Words;

public class ConjugatedPronoun extends ConjugatedWord{
	private int number;
	private int gender;
	private int Case;

	public ConjugatedPronoun(Word unConjugated, String conjugatedWord, int purpose) {
		super(unConjugated, conjugatedWord, purpose);
	}

}
