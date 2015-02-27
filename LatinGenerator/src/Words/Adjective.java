package Words;
import java.util.ArrayList;

public abstract class Adjective extends Word{
	String stem;
	
	public Adjective(String stem, int chapter, ArrayList<String> definitions) {
		super(chapter, definitions);
		this.stem = stem;
	}
	
	public static Adjective getRandomAdjective(int maxChapter){
		int size = FileParser.getAdjectivesToChapter(maxChapter).size();
		return FileParser.getAdjectivesToChapter(maxChapter).toArray(new Adjective[size])[Values.random.nextInt(size)];
	}
	
	public abstract ConjugatedAdjective decline(int Case, int number, int gender, int purpose);
	public abstract String toString();
}
