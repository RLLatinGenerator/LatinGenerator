package Words;
import java.util.ArrayList;
import java.util.Random;


public class Noun extends Word{
	private String nominative;
	private String genitive;
	private String base;
	private int declension;
	private int gender;
	
	public Noun(String nominative, String genitive, int chapter, int gender, int declension, ArrayList<String> definition){ //WHO THE F MADE THE NOUN DELCARATOR STATIC FUFUFUFUFUUFUFUFUFUFUFUFUFU
		super(chapter, definition);
		this.nominative = nominative;
		this.genitive = genitive;
		this.declension = declension;
		base = genitive.substring(0, genitive.length()-getGenitiveEndingLength(declension)); //take off the last i. TODO 
		this.gender = gender;
	}

	public ConjugatedNoun decline(int purpose, int Case, int number){
		if(Case == Values.CASE_NOMINATIVE && number == Values.NUMBER_SINGULAR){
			return new ConjugatedNoun(this, nominative, purpose, Values.NUMBER_SINGULAR, Values.CASE_NOMINATIVE, gender);
		}
		return new ConjugatedNoun(this, addEnding(Values.DECLENSION_NOUNS[declension][number][Case]), purpose, number, Case, gender);
	}

	public int getGender(){
		return gender;
	}
	public int getDeclension(){
		return declension;
	}
	public String getGenitive(){
		return genitive;
	}
	public String getNominative(){
		return nominative;
	}

	public int getDeclension(String nominative, String genitive, int gender){ //get the declension of the word with the nominative, genitive(ie: 2, 4)
		String lastTwoLettersGen = "" + (genitive.charAt(genitive.length())) + (genitive.charAt(genitive.length()-1));
		String lastTwoLettersNom = "" + (nominative.charAt(nominative.length())) + (nominative.charAt(nominative.length()-1));

		if(lastTwoLettersGen.equals("ae")) return Values.INDEX_ENDINGS_DECLENSION_FIRST;
		if(genitive.charAt(genitive.length()) == 'i' && gender != Values.GENDER_NEUTER) return Values.INDEX_ENDINGS_DECLENSION_SECOND;
		if(genitive.charAt(genitive.length()) == 'i' && gender == Values.GENDER_NEUTER) return Values.INDEX_ENDINGS_DECLENSION_SECOND_N;
		if(lastTwoLettersGen.equals("is") && gender != Values.GENDER_NEUTER) return Values.INDEX_ENDINGS_DECLENSION_THIRD;
		if(lastTwoLettersGen.equals("is") && gender == Values.GENDER_NEUTER) return Values.INDEX_ENDINGS_DECLENSION_THIRD_N; //deal with i-stems later.
		if(lastTwoLettersGen.equals("us") && lastTwoLettersNom.equals("us")) return Values.INDEX_ENDINGS_DECLENSION_FOURTH;
		if(lastTwoLettersGen.equals("u") && lastTwoLettersNom.equals("us")) return Values.INDEX_ENDINGS_DECLENSION_FOURTH_N;
		if(lastTwoLettersNom.equals("ei")) return Values.INDEX_ENDINGS_DECLENSION_FIFTH;

		return -1;
	}

	public static int getGenitiveEndingLength(int declension){//if it's amicus, amici, returns 1, because the final 'i' is the only thing that needs to be taken off from genitive to get base.
		return Values.declensionGenitiveLength[declension];
	}

	public String addEnding(String ending){
		return base + ending;
	}

	public String toString(){
		return nominative;
	}

	public static Clause getNounClause(Noun noun, int purpose, int Case, int number){
		return new Clause(new ConjugatedWord[]{noun.decline(purpose, Case, number)});
	}
	
	public static Noun getRandomNoun(int maxChapter){
		Random r = new Random();
		return (Noun) FileParser.getNounsToChapter(maxChapter).toArray()[r.nextInt(FileParser.getNounsToChapter(maxChapter).size())];
	}

	public static Clause getRandomNounClause(int purpose, int Case, int number, int maxChapter){
		int attachment = Util.getRandomNounAttachment();
		if(attachment == Values.INDEX_NOUN_CLAUSE_ATTACH_GENITIVE){ //chosen to have an attached genitive.
			return new Clause(new Clause[]{getRandomNounClause(purpose, Case, number, maxChapter), getRandomNounClause(Purpose.NOUN_POSSESSION, Values.CASE_GENITIVE, Util.getRandomPlurality(), maxChapter)});
		} else if(attachment == Values.INDEX_NOUN_CLAUSE_ATTACH_NOTHING) {
			return (new Clause(new ConjugatedWord[]{getRandomNoun(maxChapter).decline(purpose, Case, number)}));
		}
		System.out.println(attachment);
		return null;
	}
}
