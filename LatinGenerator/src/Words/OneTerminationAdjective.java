package Words;
import java.util.ArrayList;


public class OneTerminationAdjective extends Adjective{
	private String nominative;
	private String genitive;
	public OneTerminationAdjective(String nominative, String genitive, int chapter, ArrayList<String> definitions) {
		super(genitive.substring(0, genitive.length() - 1), chapter, definitions);
		this.nominative = nominative;
		this.genitive = genitive;
	}

	@Override
	public String toString() {
		return nominative + ", " + genitive;
	}

	@Override
	public ConjugatedAdjective decline(int Case, int number, int gender, int purpose) {
		if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_MASCULINE){
			return new ConjugatedAdjective(this, nominative, purpose, number, Case, gender);
		}
		else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_FEMININE){
			return new ConjugatedAdjective(this, nominative, purpose, number, Case, gender);
		}
		else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_NEUTER){
			return new ConjugatedAdjective(this, nominative, purpose, number, Case, gender);
		}
		else if (Case == Values.CASE_ACCUSATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_NEUTER){
			return new ConjugatedAdjective(this, nominative, purpose, number, Case, gender);
		}
		else{
			return new ConjugatedAdjective(this, stem.concat(Values.DECLENSION_ADJECTIVES_THIRD[gender][number][Case]), purpose, number, Case, gender);
		}
	}

}
