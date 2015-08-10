package Words;
import java.util.ArrayList;


public class Conjunction extends Word{
	
	String conjunction;
	
	public Conjunction(String conjunction, int chapter, ArrayList<String> definitions) {
		super(chapter, definitions);
		this.conjunction = conjunction;
	}

	@Override
	public String toString() {
		return "Conjunction [conjunction=" + conjunction + "]";
	}

}
