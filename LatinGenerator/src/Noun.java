
public class Noun extends Word{
	private String base;
	private int declension;
	public Noun(String nominative, String genitive){ //WHO THE F MADE THE NOUN DELCARATOR STATIC
		declension = 2;
		base = genitive.substring(0, genitive.length()); //take off the last i.
	}
	
	public ConjugatedNoun decline(int Case, int plurality){
		if(declension == 2){
			return new ConjugatedNoun(addEnding(Values.DECLENSION_SECOND[Case][plurality]));
		}
	}
	
	public String addEnding(String ending){
		return base + ending;
	}
	
	public String toString(){
		return base;
	}
}
