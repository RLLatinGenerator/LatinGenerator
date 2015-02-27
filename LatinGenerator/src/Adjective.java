import java.util.ArrayList;

public class Adjective extends Word{
	String stem;
	int declension;
	
	public Adjective(String stem, int declension, int chapter, ArrayList<String> definitions) {
		super(chapter, definitions);
		this.declension = declension;
		this.stem = stem;
	}
	
	@Override
	public String toString() {
		return "Adjective ";
	}



}
