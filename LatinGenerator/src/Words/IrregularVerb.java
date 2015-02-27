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
			return new ConjugatedVerb(this, declension[tense][number][person], tense, number, person);
		}
		else if(irregularPerfect && tense >= 3){
			return new ConjugatedVerb(this, declension[tense][number][person], tense, number, person);
		}
		if (tense <= 2){
			return presentSysConjugate(conjugation, tense, number, person);
		}
		else if (tense >= 3){
			return perfectSysConjugate(tense, number, person);
		}
		else{
			return new ConjugatedVerb(null, "Error", -1, -1, -1);
		}
	}
}
