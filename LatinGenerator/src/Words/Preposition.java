package Words;
import java.util.ArrayList;


public class Preposition extends Word{
	String preposition;
	int caseTaken;
	
	public Preposition(String pronoun, int caseTaken, int chapter, ArrayList<String> definitions) {
		super(chapter, definitions);
		this.preposition = pronoun;
		this.caseTaken = caseTaken;
	}

	@Override
	public String toString() {
		return preposition + " + " + Values.CASE_NAMES_BY_INDEX[caseTaken];
	}
	
	public ConjugatedPreposition getConjugated(int purpose){
		return new ConjugatedPreposition(this, purpose);
	}
}
