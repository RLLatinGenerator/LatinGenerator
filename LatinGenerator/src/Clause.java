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
		System.out.println("Subject: " + subjectNoun);
		Noun predicateNoun = Noun.getRandomNoun();
		int number = Util.getRandomNumber();
		ConjugatedNoun conjugatedSubject = subjectNoun.decline(Values.CASE_NOMINATIVE, number);
		ConjugatedNoun conjugatedPredicate = predicateNoun.decline(Values.CASE_NOMINATIVE, number);
		ConjugatedVerb toBe = new ConjugatedVerb(number==Values.NUMBER_SINGULAR ? "est" : "sunt", Values.INDEX_TENSE_PRESENT, number, 3);
		
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
