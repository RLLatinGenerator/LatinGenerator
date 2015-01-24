import java.util.ArrayList;


public class Verb extends Word{
	private String firstPP;
	//First principal part
	private String secondPP;
	//Second principal part
	private String thirdPP;
	//Third principal part
	private String fourthPP;
	//Fourth principal part
	int conjugation; 
	
	public Verb(String firstPP, String secondPP, String thirdPP, String fourthPP, int conjugation, int chapter, ArrayList<String> definition){
		super(chapter, definition);
		this.conjugation = conjugation;
		this.firstPP = firstPP;
		this.secondPP = secondPP;
		this.thirdPP = thirdPP;
		this.fourthPP = fourthPP;
		this.definitions = definition;
	}
	
	public String toString(){
		return firstPP + ", " + secondPP + ", " + thirdPP + ", " + fourthPP + ": " + definitions;
	}
	
	public ConjugatedVerb presentSysConjugate(int conjugation, int tense, int number, int person){
		String root = secondPP.substring(0, secondPP.length() - 3);
		return new ConjugatedVerb(root + Values.CONJUGATION_VERBS[tense][conjugation][number][person], tense, number, person);
	}

	public ConjugatedVerb perfectSysConjugate(int tense, int number, int person){
		String root = thirdPP.substring(0, thirdPP.length() - 1);
		return new ConjugatedVerb(root + Values.CONJUGATION_VERBS[tense][0][number][person], tense, number, person);
	}
	
	public ConjugatedVerb conjugate(int conjugation, int tense, int number, int person){
		ConjugatedVerb conjugated;
		if (tense < 3){
			conjugated = presentSysConjugate(conjugation, tense, number, person);
		}
		else if (tense > 2){
			conjugated = perfectSysConjugate(tense, number, person);
		}
		else{
			conjugated = new ConjugatedVerb("Error", -1, -1, -1);
		}
		return conjugated;
	}

}

