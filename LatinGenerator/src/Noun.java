
public class Noun extends Word{
	private String base;
	private int declension;
	public Noun(String nominative, String genitive){ //WHO THE F MADE THE NOUN DELCARATOR STATIC FUFUFUFUFUUFUFUFUFUFUFUFUFU
		declension = 2;
		base = genitive.substring(0, genitive.length()); //take off the last i.
	}
	
	public ConjugatedNoun decline(int Case, int plurality){
			return new ConjugatedNoun(addEnding(Values.DECLENSION_NOUNS[declension][Case][plurality]));
	}
	
	public int getDeclension(String nominative, String genitive, int gender){ //get the declension of the word with the nominative, genitive(ie: 2, 4)
		String lastTwoLettersGen = "" + (genitive.charAt(genitive.length())) + (genitive.charAt(genitive.length()-1));
		String lastTwoLettersNom = "" + (nominative.charAt(nominative.length())) + (nominative.charAt(nominative.length()-1));
		
		if(lastTwoLettersGen.equals("ae")) return Values.INDEX_DECLENSION_FIRST;
		if(genitive.charAt(genitive.length()) == 'i' && gender != Values.GENDER_NEUTER) return Values.INDEX_DECLENSION_SECOND;
		if(genitive.charAt(genitive.length()) == 'i' && gender == Values.GENDER_NEUTER) return Values.INDEX_DECLENSION_SECOND_N;
		if(lastTwoLettersGen.equals("is") && gender != Values.GENDER_NEUTER) return Values.INDEX_DECLENSION_THIRD;
		if(lastTwoLettersGen.equals("is") && gender == Values.GENDER_NEUTER) return Values.INDEX_DECLENSION_THIRD_N; //deal with i-stems later.
		if(lastTwoLettersGen.equals("us") && lastTwoLettersNom.equals("us")) return Values.INDEX_DECLENSION_FOURTH;
		if(lastTwoLettersGen.equals("u") && lastTwoLettersNom.equals("us")) return Values.INDEX_DECLENSION_FOURTH_N;
		if(lastTwoLettersNom.equals("ei")) return Values.INDEX_DECLENSION_FIFTH;
		
		return -1;
	}
	
	public String addEnding(String ending){
		return base + ending;
	}
	
	public String toString(){
		return base;
	}
}
