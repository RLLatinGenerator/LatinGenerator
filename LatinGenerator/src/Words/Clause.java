package Words;
import java.util.Arrays;

public class Clause {
	private ConjugatedWord[] words;

	public Clause(Clause[] subClauses){
		this.words = concatenateClauses(subClauses).getWords();
	}
	
	public Clause(ConjugatedWord word){
		this(new ConjugatedWord[]{word});
	}
	
	public Clause(){
		this.words = new ConjugatedWord[0];
	}
	
	public Clause(Clause copy){
		this.words = new ConjugatedWord[copy.getWords().length];
		for(int i = 0; i < words.length; i++){
			this.words[i] = new ConjugatedWord(copy.getWords()[i]);
		}
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
		Clause conjugatedSubject = Noun.getRandomNounClause(Purpose.NOUN_SUBJECT, Values.CASE_NOMINATIVE, number, maxChapter);
		Clause conjugatedPredicate = Noun.getRandomNounClause(Purpose.NOUN_OBJECT, Values.CASE_NOMINATIVE, number, maxChapter);
		ConjugatedVerb toBe = new ConjugatedVerb(Values.sum, number==Values.NUMBER_SINGULAR ? "est" : "sunt", Purpose.VERB_MAIN, Values.INDEX_TENSE_PRESENT, number, 3);
		
		return Clause.concatenateClauses(new Clause[]{conjugatedSubject, toBe.asClause(), conjugatedPredicate});
	}
	
	public static Clause makeSubjVerbSentence(int maxChapter, int tense){
		int number = Util.getRandomPlurality();
		Noun subject = Noun.getRandomNoun(maxChapter);
		ConjugatedNoun conjugatedSubject = new ConjugatedNoun(subject, subject.toString(), Purpose.NOUN_SUBJECT, number, Values.CASE_NOMINATIVE, subject.getGender());
		Clause subjectClause = Noun.getNounClause(subject, Purpose.NOUN_SUBJECT, Values.CASE_NOMINATIVE, number);
		Clause predicateClause = Noun.getRandomNounClause(Purpose.NOUN_PREDICATE, Values.CASE_ACCUSATIVE, Util.getRandomPlurality(), maxChapter);
		Verb verb = Verb.getRandomVerb(maxChapter);
		ConjugatedVerb conjugatedVerb = Verb.getAgreeingVerb(conjugatedSubject, verb, tense);
		return Clause.concatenateClauses(new Clause[]{subjectClause, conjugatedVerb.asClause(), predicateClause});
	}
	
	public static Clause concatenateClauses(Clause[] input){
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
