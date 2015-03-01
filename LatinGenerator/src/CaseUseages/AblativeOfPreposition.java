package CaseUseages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import Words.Clause;
import Words.ConjugatedNoun;
import Words.ConjugatedWord;
import Words.Noun;
import Words.Preposition;
import Words.Purpose;
import Words.Util;
import Words.Values;

public class AblativeOfPreposition extends CaseUsage{

	public AblativeOfPreposition() {
		super.setCase(Values.CASE_ABLATIVE);
		super.setChapter(3);
		super.setTypesModified(new int[]{Values.WORD_TYPE_NOUN});
		super.setTranslations(new HashSet<String>(Arrays.asList(new String[]{})));
		super.setIntroducedBy(new ArrayList<Preposition> (Arrays.asList(new Preposition[]{(Preposition) Values.getWord("ab"), (Preposition) Values.getWord("a"), (Preposition) Values.getWord("de"), (Preposition) Values.getWord("e"), (Preposition) Values.getWord("ex"),  (Preposition) Values.getWord("in"),  (Preposition) Values.getWord("sine"),  (Preposition) Values.getWord("cum"),  (Preposition) Values.getWord("sub"),  (Preposition) Values.getWord("pro"),  (Preposition) Values.getWord("prae")})));
		super.setPrepositionPurpose(Purpose.PREPOSITION_ABLATIVE_OF_PREPOSITION);
		super.setNounPurpose(Purpose.NOUN_ABLATIVE_OF_PREPOSITION);
	}

	@Override
	public Clause addToWord(ConjugatedWord caseUsageWord, ConjugatedWord toAttachTo) {
		if(checkIfCanModify(toAttachTo)){
			return Clause.concatenateClauses(new Clause(caseUsageWord), new Clause(toAttachTo));
		} else return null;
	}
	
	public Clause generateRandomGrammaticalConstruction(ConjugatedWord modified, int maxChapter){
		if(modified != null && !checkIfCanModify(modified)){
			throw new IllegalArgumentException();
		}
		else{
			return Clause.concatenateClauses(new Clause(Util.getRandom(getIntroducedBy()).getConjugated(getPrepositionPurpose())), new Clause(makeCaseUsage(Noun.getRandomNoun(maxChapter), Util.getRandomPlurality())));
		}
	}

	@Override
	public ConjugatedNoun makeCaseUsage(Noun input, int plurality) {
		return input.decline(getNounPurpose(), this.getCase(), plurality);
	}
}