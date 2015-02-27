package Words;
import java.util.ArrayList;


public class IrregularVerb extends Verb{
	boolean irregularPresent;
	boolean irregularPerfect;
	String[][][] declension;
	
	public IrregularVerb(String firstPP, String secondPP, String thirdPP, String fourthPP, String[][][] declension, boolean irregularPresent, boolean irregularPerfect, int conjugation, int chapter, ArrayList<String> definition) {
		super(firstPP, secondPP, thirdPP, fourthPP, conjugation, chapter, definition);
		this.irregularPresent = irregularPresent;
		this.irregularPerfect = irregularPerfect;
		this.declension = declension;
	}
	
	@Override
	public ConjugatedVerb conjugate(int tense, int number, int person){
		if(irregularPresent && tense <= 2){
			return null;
		}
		else{
			return null;
		}
	}
}
