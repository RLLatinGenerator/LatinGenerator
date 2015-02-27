import java.util.ArrayList;


public class TwoTerminationAdjective extends Adjective{
	private String mascFem; //masculine/femenine 
	private String neuter;
	public TwoTerminationAdjective(String mascFem, String neuter, int declension, int chapter, ArrayList<String> definitions) {
		super(mascFem.substring(0, mascFem.length() - 1), declension, chapter, definitions);
		this.mascFem = mascFem;
		this.neuter = neuter;
	}

}
