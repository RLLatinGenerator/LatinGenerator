package GrammaticalConstructions;

import java.util.HashMap;
import java.util.HashSet;

import Words.Adjective;
import Words.Clause;
import Words.ConjugatedWord;
import Words.Noun;
import Words.Purpose;
import Words.Values;
import Words.Verb;

public class AblativeAbsolute extends GrammaticalConstruction{

	public AblativeAbsolute() { //MAKE SURE TO ADD ANY NEW GRAMMATICAL CONSTRUCTIONS TO VALUES.GRAMMATICALCONSTRUCTIONS!
		super(50, new int[]{});
		
		HashMap<Integer, HashSet<String>> purposeTranslations = new HashMap<>();
		
		purposeTranslations.put(Purpose.ADJECTIVE_ABLATIVE_ABSOLUTE_PREDICATE, new HashSet<String>());
		purposeTranslations.put(Purpose.NOUN_ABLATIVE_ABSOLUTE_PREDICATE, new HashSet<String>());
		purposeTranslations.put(Purpose.VERB_ABLATIVE_ABSOLUTE_PARTICIPLE, new HashSet<String>());
		
		HashSet<String> NOUN_ABLATIVE_ABSOLUTE_SUBJECT = new HashSet<String>();
		NOUN_ABLATIVE_ABSOLUTE_SUBJECT.add("after+");
		NOUN_ABLATIVE_ABSOLUTE_SUBJECT.add("since+");
		NOUN_ABLATIVE_ABSOLUTE_SUBJECT.add("when+");
		NOUN_ABLATIVE_ABSOLUTE_SUBJECT.add("although+");

		purposeTranslations.put(Purpose.NOUN_ABLATIVE_ABSOLUTE_SUBJECT, NOUN_ABLATIVE_ABSOLUTE_SUBJECT);
		
		super.setPurposeTranslations(purposeTranslations);
		//super.setConstruction(generateRandomGrammaticalConstruction(null, maxChapter));
		
	}

	@Override
	public Clause generateRandomGrammaticalConstruction(ConjugatedWord modified, int maxChapter) { //unfortunately cannot be static due to limitations of the java language.
		int typeOfAA = Values.random.nextInt(2);
		int plurality = Values.random.nextInt(2)==1 ? Values.NUMBER_PLURAL : Values.NUMBER_SINGULAR;
		if(typeOfAA == 0){
			return generateNounNoun(plurality, maxChapter);
		} else {
			return null;//Need participles
		}
	}
	
	public static Clause generateNounNoun(int plurality, int maxChapter){
		return Clause.concatenateClauses(Noun.getRandomNounClause(Purpose.NOUN_ABLATIVE_ABSOLUTE_SUBJECT, Values.CASE_ABLATIVE, plurality, maxChapter), Noun.getRandomNounClause(Purpose.NOUN_ABLATIVE_ABSOLUTE_PREDICATE, Values.CASE_ABLATIVE, plurality, maxChapter));
	}
	public static Clause generateNounVerb(Noun subject, Verb participle, int plurality, int tense){
		return null;
	}

}
