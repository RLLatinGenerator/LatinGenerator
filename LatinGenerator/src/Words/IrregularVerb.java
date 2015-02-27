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
	public ConjugatedVerb conjugate(int tense, int number, int person, int purpose){
		if(irregularPresent && tense <= 2){
			return new ConjugatedVerb(this, declension[tense][number][person], purpose, tense, number, person);
		}
		else if(irregularPerfect && tense >= 3){
			return new ConjugatedVerb(this, declension[tense][number][person], purpose, tense, number, person);
		}
		if (tense <= 2){
			return presentSysConjugate(conjugation, purpose, tense, number, person);
		}
		else if (tense >= 3){
			return perfectSysConjugate(tense, purpose, number, person);
		}
		else{
			return new ConjugatedVerb(null, "Error", -1, -1, -1, -1); //This should really be an exception.
		}
	}
}
