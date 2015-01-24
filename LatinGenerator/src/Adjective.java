import java.util.ArrayList;

public class Adjective extends Word{

	String masculine;
	String feminine;
	String neuter;
	int declension; //first& second, or third.
	
	public Adjective(String masculine, String feminine, String neuter, int chapter, int declension, ArrayList<String> definitions) {
		super(chapter, definitions);
		this.declension = declension;
		this.masculine = masculine;
		this.feminine = feminine;
		this.neuter = neuter;
	}

	@Override
	public String toString() {
		return "Adjective [masculine=" + masculine + ", feminine=" + feminine
				+ ", neuter=" + neuter + "]";
	}

}
