import java.util.ArrayList;


public class Adverb extends Word{

	String adverb;
	
	public Adverb(String adverb, int chapter, ArrayList<String> definitions) {
		super(chapter, definitions);
		this.adverb = adverb;
	}

	@Override
	public String toString() {
		return "Adverb [adverb=" + adverb + "]";
	}

}
