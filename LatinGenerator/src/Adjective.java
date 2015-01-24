import java.util.ArrayList;

public class Adjective extends Word{

	String masculine;
	String feminine;
	String neuter;
	
	public Adjective(String masculine, String feminine, String neuter, int chapter, ArrayList<String> definitions) {
		super(chapter, definitions);
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
