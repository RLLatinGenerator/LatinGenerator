package Words;
import java.util.ArrayList;
import java.util.Random;


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
	public String firstPP(){
		return firstPP;
	}
	public ConjugatedVerb presentSysConjugate(int purpose, int conjugation, int tense, int number, int person){
		String root = secondPP.substring(0, secondPP.length() - 3);
		return new ConjugatedVerb(this, root + Values.CONJUGATION_VERBS[tense][conjugation][number][person], purpose, tense, number, person);
	}
	
	public ConjugatedVerb presentPassiveSysConjugate(int conjugation, int purpose, int tense, int number, int person){
		String root = secondPP.substring(0, secondPP.length() - 3);
		return new ConjugatedVerb(this, root + Values.PASSIVE_CONJUGATION[tense][conjugation][number][person], purpose, tense, number, person);
	}
	
	/*public ConjugatedVerb perfectPassiveSysConjugate(int purpose, int tense, int number, int person, int gender){
		Adjective participle = getParticiple(tense);
		ConjugatedAdjective conjugatedParticiple = participle.decline(Values.CASE_NOMINATIVE, number, gender, purpose);
		return new ConjugatedVerb(this, participle + " " + Values.SUM_CONJUGATION[tense][number][person], purpose, tense, number, person);
	}*/

	public ConjugatedVerb perfectSysConjugate(int purpose, int tense, int number, int person){
		String root = thirdPP.substring(0, thirdPP.length() - 1);
		return new ConjugatedVerb(this, root + Values.CONJUGATION_VERBS[tense][0][number][person], purpose, tense, number, person);
	}
	
	public ConjugatedVerb conjugate(int purpose, int tense, int number, int person){
		ConjugatedVerb conjugated;
		if (tense <= 2){
			conjugated = presentSysConjugate(purpose, conjugation, tense, number, person);
		}
		else if (tense >= 3){
			conjugated = perfectSysConjugate(purpose, tense, number, person);
		}
		else{
			conjugated = new ConjugatedVerb(null, "Error", -1, -1, -1, -1);
			System.err.println("ERROR");
		}
		return conjugated;
	}
	
	public static Verb getRandomVerb(int maxChapter){
		Random r = new Random();
		return (Verb) FileParser.getVerbsToChapter(maxChapter).toArray()[r.nextInt(FileParser.getVerbsToChapter(maxChapter).size())];
	}
	
	
	public static ConjugatedVerb getAgreeingVerb(ConjugatedNoun noun, Verb verb , int tense){
		ConjugatedVerb conjugated;
		if (noun.number == Values.NUMBER_SINGULAR){
			conjugated = verb.conjugate(Purpose.VERB_MAIN, tense,0, 2);
		}
		else if (noun.number == Values.NUMBER_PLURAL){
			conjugated = verb.conjugate(Purpose.VERB_MAIN, tense, 1, 2);
		}
		else{
			conjugated = new ConjugatedVerb(null, "Error", -1, -1, -1, -1);
		}
		return conjugated;
	}
	
	public Adjective getParticiple(int tense){
		if(tense == Values.INDEX_PARTICIPLE_PRESENT){
			return new FirstSecondAdjective(fourthPP, (fourthPP.substring(0, fourthPP.length() - 1) + "a"), (fourthPP.substring(0, fourthPP.length() -2) + "um"), chapter, definitions);
		}
		else if(tense == Values.INDEX_PARTICIPLE_FUTURE){
			return new FirstSecondAdjective(fourthPP, (fourthPP.substring(0, fourthPP.length() - 1) + "ura"), (fourthPP.substring(0, fourthPP.length() -2) + "urum"), chapter, definitions);
		}
		else{
			return new OneTerminationAdjective((secondPP.substring(0, secondPP.length() - 3) + "ns"), (secondPP.substring(0, secondPP.length() - 3) + "ns"), chapter, definitions);
		}

	}

}

