package Words;
import java.util.ArrayList;

public class ThreeTerminationAdjective extends Adjective {
	private String masculine;
	private String feminine;
	private String neuter;

	public ThreeTerminationAdjective(String masculine, String feminine, String neuter, int chapter, ArrayList<String> definitions) {
		super(feminine.substring(0, feminine.length() - 1), chapter, definitions);
		this.masculine = masculine;
		this.feminine = feminine;
		this.neuter = neuter;
	}

	public ConjugatedAdjective decline(int Case, int number, int gender, int purpose){
			if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_MASCULINE){
				return new ConjugatedAdjective(this, masculine, purpose, number, Case, gender);
			}
			else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_FEMININE){
				return new ConjugatedAdjective(this, feminine, purpose, number, Case, gender);
			}
			else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_NEUTER){
				return new ConjugatedAdjective(this, neuter, purpose, number, Case, gender);
			}
			else if (Case == Values.CASE_ACCUSATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_NEUTER){
				return new ConjugatedAdjective(this, neuter, purpose, number, Case, gender);
			}
			else{
				return new ConjugatedAdjective(this, stem.concat(Values.DECLENSION_ADJECTIVES_SECOND[gender][number][Case]), purpose, number, Case, gender);
			}

	}

	@Override
	public String toString() {
		return masculine + ", " + feminine + ", " + neuter;
	}

}
