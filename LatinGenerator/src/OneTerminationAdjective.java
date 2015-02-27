import java.util.ArrayList;


public class OneTerminationAdjective extends Adjective{
	private String nominative;
	private String genetive;
	public OneTerminationAdjective(String nominative, String genetive, int chapter, ArrayList<String> definitions) {
		super(genetive.substring(0, genetive.length() - 1), chapter, definitions);
		this.nominative = nominative;
		this.genetive = genetive;
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
