import java.util.ArrayList;

public class ThreeTerminationAdjective extends Adjective {
	private String masculine;
	private String feminine;
	private String neuter;
	private int declension; //0 first/second 1 for third

	public ThreeTerminationAdjective(String masculine, String feminine, String neuter, int declension, int chapter, ArrayList<String> definitions) {
		super(feminine.substring(0, feminine.length() - 1), declension, chapter, definitions);
		this.masculine = masculine;
		this.feminine = feminine;
		this.neuter = neuter;
	}

	public ConjugatedAdjective decline(int Case, int number, int gender){
			if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_MASCULINE){
				return new ConjugatedAdjective(masculine, Case, number, gender);
			}
			else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_FEMININE){
				return new ConjugatedAdjective(feminine, Case, number, gender);
			}
			else if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR && gender == Values.GENDER_NEUTER){
				return new ConjugatedAdjective(neuter, Case, number, gender);
			}
			else{
				return new ConjugatedAdjective(stem.concat(Values.DECLENSION_ADJECTIVES[declension][gender][number][Case]), Case, number, gender);
			}

	}

}
