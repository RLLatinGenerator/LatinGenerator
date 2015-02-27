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
	public ConjugatedAdjective decline(int Case, int number, int gender) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
