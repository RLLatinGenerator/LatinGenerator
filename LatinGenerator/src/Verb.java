
public class Verb extends Word{
	private String firstPP;
	//First principal part
	private String secondPP;
	//Second principal part
	private String thirdPP;
	//Third principal part
	private String fourthPP;
	//Fourth principal part
	
	public Verb(String firstPP, String secondPP, String thirdPP, String fourthPP){
		this.firstPP = firstPP;
		this.secondPP = secondPP;
		this.thirdPP = thirdPP;
		this.fourthPP = fourthPP;
	}
	
	//temporary statix
	public static String presentConjugate(String secondPP, int conjugation, int number, int person){
		String root = secondPP.substring(0, secondPP.length() - 3);
		String conjugatedPresent = root + Values.CONJUGATION_VERBS[Values.INDEX_TENSE_PRESENT][conjugation][number][person];
		return conjugatedPresent;
	}
	
	public static String futureConjugate(String secondPP, int conjugation, int number, int person){
		String root  = secondPP.substring(0, secondPP.length() - 3);
		String conjugatedFuture = root + Values.CONJUGATION_VERBS[Values.INDEX_TENSE_FUTURE][conjugation][number][person];
		return conjugatedFuture;
	}
	
	public static String imperfectConjugate(String secondPP, int conjugation, int number, int person){
		String root  = secondPP.substring(0, secondPP.length() - 3);
		String conjugatedImperfect = root + Values.CONJUGATION_VERBS[Values.INDEX_TENSE_IMPERFECT][conjugation][number][person];
		return conjugatedImperfect;
	}
	
	public static String perfectConjugate(String thirdPP, int number, int person){
		String root = thirdPP.substring(0, thirdPP.length() - 1);
		String conjugatedPerfect = root + Values.CONJUGATION_VERBS[Values.INDEX_TENSE_PERFECT][0][number][person]; //0 because conjugation doesn't matter
		return conjugatedPerfect;
	}
	
	public static String pluperfectConjugate(String thirdPP, int number, int person){
		String root = thirdPP.substring(0, thirdPP.length() - 1);
		String conjugatedPluperfect = root + Values.CONJUGATION_VERBS[Values.INDEX_TENSE_PLUPERFECT][0][number][person]; //0 because conjugation doesn't matter
		return conjugatedPluperfect;
	}
	
	public static String futurePerfectConjugate(String thirdPP, int number, int person){
		String root = thirdPP.substring(0, thirdPP.length() - 1);
		String conjugatedFuturePerfect = root + Values.CONJUGATION_VERBS[Values.INDEX_TENSE_FUTURE_PERFECT][0][number][person]; //0 because conjugation doesn't matter
		return conjugatedFuturePerfect;
	}

	public static String presentSysConjugate(int tense, String secondPP, int conjugation, int number, int person){
		//Present system (present, future, and imperfect
		if (tense == Values.INDEX_TENSE_PRESENT){
			String conjugatedPresent  = presentConjugate(secondPP, conjugation, number, person);
			return conjugatedPresent;
		}
		if (tense == Values.INDEX_TENSE_FUTURE){
			String conjugatedFuture = futureConjugate(secondPP, conjugation, number, person);
			return conjugatedFuture;
		}
		if (tense == Values.INDEX_TENSE_IMPERFECT){
			String conjugatedImperfect = imperfectConjugate(secondPP, conjugation, number, person);
			return conjugatedImperfect;
		}
		else{return "Error. Tense doesn't exist";}
	}
	
	public static String perfectSysConjugate(int tense, String thirdPP, int number, int person){
		if (tense == Values.INDEX_TENSE_PERFECT){
			String conjugatedPerfect = perfectConjugate(thirdPP, number, person);
			return conjugatedPerfect;
		}
		if (tense == Values.INDEX_TENSE_PLUPERFECT){
			String conjugatedPluperfect = pluperfectConjugate(thirdPP, number, person);
			return conjugatedPluperfect;
		}
		if (tense == Values.INDEX_TENSE_FUTURE_PERFECT){
			String conjugatedFuturePerfect = futurePerfectConjugate(thirdPP, number, person);
			return conjugatedFuturePerfect;
		}
		else{return "Error. Tense doesn't exist";}
	}
	
	public static String conjugate(int tense, String secondPP, String thirdPP, int conjugation, int number, int person)	{
		if (tense < 3){
			String conjugated  = presentSysConjugate(tense, secondPP, conjugation, number, person);
			return conjugated;
		}
		if (tense > 2 && tense < 6){
			String conjugated = perfectSysConjugate(tense, thirdPP, number, person);
			return conjugated;
		}
		else{return "Error. Tense doesn't exist";}
	}
}
