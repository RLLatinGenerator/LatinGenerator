
public class ConjugatedNoun extends ConjugatedWord{
	int number;
	int Case;
	int gender;
	
	public ConjugatedNoun(String noun, int number, int Case, int gender){
		super(noun);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
	}
	

}
