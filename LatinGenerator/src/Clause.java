import java.util.Arrays;

public class Clause {
	ConjugatedWord[] words;

	public Clause(Clause[] subClauses){
		this.words = appendClauses(subClauses).getWords();
	}
	
	public Clause(ConjugatedWord[] words){
		this.words = words;
	}
	
	public String formatAsSentence(){
		StringBuilder output = new StringBuilder();
		for(ConjugatedWord current : getWords()){
			output.append(current + " ");
		}
		output.setCharAt(0, Character.toUpperCase(output.charAt(0)));
		output.setCharAt(output.length()-1, '.');
		
		return output.toString();
	}
	
	
	public static Clause makeToBeSentence(int maxChapter){

		int number = Util.getRandomPlurality();
		Clause conjugatedSubject = Noun.getRandomNounClause(Values.CASE_NOMINATIVE, number, maxChapter);
		Clause conjugatedPredicate = Noun.getRandomNounClause(Values.CASE_NOMINATIVE, number, maxChapter);
		ConjugatedVerb toBe = new ConjugatedVerb(number==Values.NUMBER_SINGULAR ? "est" : "sunt", Values.INDEX_TENSE_PRESENT, number, 3);
		
		return Clause.appendClauses(new Clause[]{conjugatedSubject, toBe.asClause(), conjugatedPredicate});
	}
	
	public static Clause makeSubjVerbSentence(int maxChapter, int tense){
		int number = Util.getRandomPlurality();
		Noun subject = Noun.getRandomNoun(maxChapter);
		ConjugatedNoun conjugatedSubject = new ConjugatedNoun(subject.toString(), number, Values.CASE_NOMINATIVE, subject.getGender());
		Clause subjectClause = Noun.getNounClause(subject, Values.CASE_NOMINATIVE, number);
		Clause predicateClause = Noun.getRandomNounClause(Values.CASE_ACCUSATIVE, Util.getRandomPlurality(), maxChapter);
		Verb verb = Verb.getRandomVerb(maxChapter);
		ConjugatedVerb conjugatedVerb = Verb.getAgreeingVerb(conjugatedSubject, verb, tense);
		return Clause.appendClauses(new Clause[]{subjectClause, conjugatedVerb.asClause(), predicateClause});
	}
	
	public static Clause appendClauses(Clause[] input){
		Clause output = null;
		for(Clause current : input){
			output = concatenateClauses(output, current);
			//System.out.println("output: " + output);
		}
		return output;
	}
	
	public static Clause concatenateClauses(Clause c1, Clause c2){
		if(c1==null)
			return c2;
		if(c2 == null)
			return c1;
		
		ConjugatedWord[] c1Words = c1.getWords();
		ConjugatedWord[] c2Words = c2.getWords();
		
		ConjugatedWord[] combined = new ConjugatedWord[c1Words.length + c2Words.length];
		System.arraycopy(c1Words, 0, combined, 0, c1Words.length);
		System.arraycopy(c2Words, 0, combined, c1Words.length, c2Words.length);
		
		return new Clause(combined);
	}

	@Override
	public String toString() {
		return "Clause [words=" + Arrays.toString(words) + "]";
	}
	
	public ConjugatedWord[] getWords() {
		return words;
	}

	public void setWords(ConjugatedWord[] words) {
		this.words = words;
	}
	
}
