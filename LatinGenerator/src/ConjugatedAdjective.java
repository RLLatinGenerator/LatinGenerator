
public class ConjugatedAdjective extends ConjugatedWord{

	int Case;
	int number;
	int gender;
<<<<<<< HEAD
=======
	
>>>>>>> b419da21517490f738165d585fa87cc7422fd7b4
	public ConjugatedAdjective(Adjective unConjugated, String conjugatedWord, int number, int Case, int gender) {
		super(unConjugated, conjugatedWord);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
	}

}
