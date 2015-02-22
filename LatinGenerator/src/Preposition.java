import java.util.ArrayList;


public class Preposition extends Word{
	String pronoun;
	int caseTaken;
	
	public Preposition(String pronoun, int caseTaken, int chapter, ArrayList<String> definitions) {
		super(chapter, definitions);
		this.pronoun = pronoun;
		this.caseTaken = caseTaken;
	}

	@Override
	public String toString() {
		return pronoun + " + " + Values.CASE_NAMES_BY_INDEX[caseTaken];
	}
}
