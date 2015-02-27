package Words;
import java.util.ArrayList;


public class FirstSecondAdjective extends Adjective{
	private String masculine;
	private String feminine;
	private String neuter;
	
	public FirstSecondAdjective(String masculine, String feminine, String neuter, int chapter, ArrayList<String> definitions) {
		super(feminine.substring(0, feminine.length()), chapter, definitions);
		this.masculine = masculine;
		this.feminine = feminine;
		this.neuter = neuter;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConjugatedAdjective decline(int Case, int number, int gender) {
		if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_MASCULINE){
			return new ConjugatedAdjective(this, masculine, number, Case, gender);
		}
		else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_FEMININE){
			return new ConjugatedAdjective(this, feminine, number, Case, gender);
		}
		else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_NEUTER){
			return new ConjugatedAdjective(this, neuter, number, Case, gender);
		}
		else if (Case == Values.CASE_ACCUSATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_NEUTER){
			return new ConjugatedAdjective(this, neuter, number, Case, gender);
		}
		else{
			return new ConjugatedAdjective(this, stem.concat(Values.DECLENSION_ADJECTIVES_THIRD[gender][number][Case]), number, Case, gender);
		}
	}

}
