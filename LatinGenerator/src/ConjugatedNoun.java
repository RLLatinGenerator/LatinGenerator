
public class ConjugatedNoun extends ConjugatedWord{
	int plurality;
	int Case;
	int gender;
	
	public ConjugatedNoun(String noun, int plurality, int Case, int gender){
		super(noun);
		this.plurality = plurality;
		this.Case = Case;
		this.gender = gender;
	}
	

}
