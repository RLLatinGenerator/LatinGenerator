import java.util.Arrays;
import java.util.Random;


public class Clause {
	ConjugatedWord[] words;

	public Clause(ConjugatedWord[] words){
		this.words = words;
	}
	
	getClause(){
		Random r = new Random();
		
		//basic format of a sentence is: Noun verbs Noun
		
		
	}
	
	public static Clause makeChapter1Sentence(){
		ConjugatedWord[] words = new ConjugatedWord[3];
		Noun subjectNoun = Noun.getRandomNoun();
		Noun predicateNoun = Noun.getRandomNoun();
		int plurality = Util.getRandomPlurality();
		ConjugatedNoun conjugatedSubject = subjectNoun.decline(Values.CASE_NOMINATIVE, plurality);
		ConjugatedNoun conjugatedPredicate = predicateNoun.decline(Values.CASE_NOMINATIVE, plurality);
		ConjugatedVerb toBe = new ConjugatedVerb(plurality==Values.PLURALITY_SINGULAR ? "est" : "sunt", Values.INDEX_TENSE_PRESENT, plurality, 3);
		
		words[0] = conjugatedSubject;
		words[1] = toBe;
		words[2] = conjugatedPredicate;
		
		return new Clause(words);
	}

	@Override
	public String toString() {
		return "Clause [words=" + Arrays.toString(words) + "]";
	}
	
	
}
