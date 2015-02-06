
public class ConjugatedNoun {
	String conjugatedNoun; //for example, would hold "amici".
	int plurality;
	int Case;
	int gender;
	public ConjugatedNoun(String noun, int plurality, int Case, int gender){
		this.conjugatedNoun = noun;
		this.plurality = plurality;
		this.Case = Case;
		this.gender = gender;
	}
}
