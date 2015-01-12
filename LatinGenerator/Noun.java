
public class Noun extends Word{
	private String base;
	private int declension;
	public static Noun(String nominative, String genitive){
		declension = 2;
		base = genitive.substring(0, genitive.length()); //take off the last i.
	}
	
	public ConjugatedNoun decline(int Case, int plurality){
		if(declension == 2){
			return addEnding(Values.DECLENSION_SECOND[Case][plurality]);
		}
	}
	
	public static String addEnding(String ending){
		return base + ending;
	}
}
