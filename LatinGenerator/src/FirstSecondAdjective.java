import java.util.ArrayList;


public class FirstSecondAdjective extends Adjective{
	private String genitive;
	private String nominative;
	
	public FirstSecondAdjective(String nominative, String genitive, int chapter, ArrayList<String> definitions) {
		super(genitive.substring(0, genitive.length()), chapter, definitions);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConjugatedAdjective decline(int Case, int number, int gender) {
		// TODO Auto-generated method stub
		return null;
	}

}
