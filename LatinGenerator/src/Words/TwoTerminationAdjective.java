package Words;
import java.util.ArrayList;


public class TwoTerminationAdjective extends Adjective{
	private String mascFem; //masculine/femenine 
	private String neuter;
	public TwoTerminationAdjective(String mascFem, String neuter, int chapter, ArrayList<String> definitions) {
		super(mascFem.substring(0, mascFem.length() - 1), chapter, definitions);
		this.mascFem = mascFem;
		this.neuter = neuter;
	}
	
	@Override
	public ConjugatedAdjective decline(int purpose, int Case, int number, int gender) {
		if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_MASCULINE){
			return new ConjugatedAdjective(this, mascFem, purpose, number, Case, gender);
		}
		else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_FEMININE){
			return new ConjugatedAdjective(this, mascFem, purpose, number, Case, gender);
		}
		else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_NEUTER){
			return new ConjugatedAdjective(this, neuter, purpose, number, Case, gender);
		}
		else if (Case == Values.CASE_ACCUSATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_NEUTER){
			return new ConjugatedAdjective(this, neuter, purpose, number, Case, gender);
		}
		else{
			return new ConjugatedAdjective(this, stem.concat(Values.DECLENSION_ADJECTIVES_THIRD[gender][Case][number]), purpose, number, Case, gender);
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
