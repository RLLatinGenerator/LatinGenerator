package GrammaticalConstructions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import Words.Adjective;
import Words.Clause;
import Words.ConjugatedWord;
import Words.Noun;
import Words.Purpose;
import Words.Util;
import Words.Values;
import Words.Verb;

public class DativeOfIndirectObject extends GrammaticalConstruction{

	public DativeOfIndirectObject() { //MAKE SURE TO ADD ANY NEW GRAMMATICAL CONSTRUCTIONS TO VALUES.GRAMMATICALCONSTRUCTIONS!
		super(8, new int[]{});
		
		HashMap<Integer, HashSet<String>> purposeTranslations = new HashMap<>();
		
		purposeTranslations.put(Purpose.NOUN_DATIVE_OF_INDIRECT_OBJECT, new HashSet<String>());
		
		HashSet<String> NOUN_ABLATIVE_ABSOLUTE_SUBJECT = new HashSet<String>();
		NOUN_ABLATIVE_ABSOLUTE_SUBJECT.add("to");

		purposeTranslations.put(Purpose.NOUN_ABLATIVE_ABSOLUTE_SUBJECT, NOUN_ABLATIVE_ABSOLUTE_SUBJECT);
		
		super.setPurposeTranslations(purposeTranslations);
		//super.setConstruction(generateRandomGrammaticalConstruction(null, maxChapter));
		
	}
	public static Verb[] DIO_VERBS = {(Verb) Values.getWord("dono"), (Verb) Values.getWord("do"), (Verb) Values.getWord("monstro"), (Verb) Values.getWord("narro"), (Verb) Values.getWord("dico"), (Verb) Values.getWord("nuntio"), (Verb) Values.getWord("enuntio")};

	@Override
	public Clause generateRandomGrammaticalConstruction(ConjugatedWord modified, int maxChapter) { //unfortunately cannot be static due to limitations of the java language.
		int plurality = Values.random.nextInt(2)==1 ? Values.NUMBER_PLURAL : Values.NUMBER_SINGULAR;
		Clause indirectObject = Noun.getRandomNounClause(Purpose.NOUN_DATIVE_OF_INDIRECT_OBJECT, Values.CASE_DATIVE, Util.getRandomPlurality(), maxChapter);
		//Verb verb = Util.getRandom(Arrays.asList(DIO_VERBS));
		return null; //not done
	}
	

}