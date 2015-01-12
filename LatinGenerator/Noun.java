
public class Noun extends Word{
	private String base;
	private int declension;
	public static Noun(String nominative, String genitive){
		
	}
	
	public ConjugatedNoun decline(int Case, int plurality){
		return addEnding(Values.DECLENSION_SECOND[Case][plurality]);
	}
	
	public static String addEnding(String ending){
		return base + ending;
	}
}
