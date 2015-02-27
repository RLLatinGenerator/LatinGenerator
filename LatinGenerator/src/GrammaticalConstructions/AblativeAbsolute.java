package GrammaticalConstructions;

import Words.Adjective;
import Words.Clause;
import Words.ConjugatedWord;
import Words.Noun;
import Words.Purpose;
import Words.Values;
import Words.Verb;

public class AblativeAbsolute extends GrammaticalConstruction{

	public AblativeAbsolute(int maxChapter) {
		super(50, new int[]{}, new Clause());
		super.setConstruction(generateRandomGrammaticalConstruction(null, maxChapter));
	}

	@Override
	public Clause generateRandomGrammaticalConstruction(ConjugatedWord modified, int maxChapter) {
		int typeOfAA = Values.random.nextInt(2);
		int plurality = Values.random.nextInt(2)==1 ? Values.NUMBER_PLURAL : Values.NUMBER_SINGULAR;
		if(typeOfAA == 0){
			return generateNounNoun(Noun.getRandomNoun(maxChapter), Noun.getRandomNoun(maxChapter), plurality);
		} else if(typeOfAA == 1){
			return generateNounAdjective(Noun.getRandomNoun(maxChapter), Adjective.getRandomAdjective(maxChapter), plurality);
		} else {
			return null;//Need participles
		}
	}
	
	public Clause generateNounNoun(Noun subject, Noun predicate, int plurality){
		return new Clause(new ConjugatedWord[]{subject.decline(Purpose.NOUN_ABLATIVE_ABSOLUTE_SUBJECT, Values.CASE_ABLATIVE, plurality), predicate.decline(Purpose.NOUN_ABLATIVE_ABSOLUTE_PREDICATE, Values.CASE_ABLATIVE, plurality)});
	}
	
	public Clause generateNounAdjective(Noun subject, Adjective predicate, int plurality){
		return new Clause(new ConjugatedWord[]{subject.decline(Purpose.NOUN_ABLATIVE_ABSOLUTE_SUBJECT, Values.CASE_ABLATIVE, plurality), predicate.decline(Values.CASE_ABLATIVE, plurality, subject.getGender(), Purpose.ADJECTIVE_ABLATIVE_ABSOLUTE_PREDICATE)});
	}
	
	public Clause generateNounVerb(Noun subject, Verb participle, int plurality, int tense){
		//add once we have participle generation.
	}

}
