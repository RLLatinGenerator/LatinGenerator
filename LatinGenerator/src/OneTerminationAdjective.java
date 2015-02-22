import java.util.ArrayList;


public class OneTerminationAdjective extends Adjective{
	private String nominative;
	private String genetive;
	public OneTerminationAdjective(String nominative, String genetive, int declension, int chapter, ArrayList<String> definitions) {
		super(genetive.substring(0, genetive.length() - 1), declension, chapter, definitions);
		this.nominative = nominative;
		this.genetive = genetive;
	}

}
