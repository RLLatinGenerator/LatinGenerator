
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
	
	public String presentConjugate(String secondPP, int conjugation, int number, int person){
		String presentRoot = secondPP.substring(0, secondPP.length() - 3);
		String conjugatedPresent = presentRoot + Values.CONJUGATION_VERBS[0][conjugation][number][person];
		return conjugatedPresent;
	}
	public String perfectConjugate(String thirdPP, int number, int person){
		String perfectRoot = thirdPP.substring(0, thirdPP.length() - 3);
		String conjugatedPerfect = perfectRoot + Values.CONJUGATION_VERBS[1][0][number][person];
		return conjugatedPerfect;
	}

}
