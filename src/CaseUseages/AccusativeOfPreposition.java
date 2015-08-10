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

public class AccusativeOfPreposition extends CaseUsage{

	public AccusativeOfPreposition() {
		super.setCase(Values.CASE_ACCUSATIVE);
		super.setChapter(3);
		super.setTypesModified(new int[]{Values.WORD_TYPE_NOUN});
		super.setTranslations(new HashSet<String>(Arrays.asList(new String[]{})));
		super.setIntroducedBy(new ArrayList<Preposition> (Arrays.asList(new Preposition[]{(Preposition) Values.getWord("ad"), (Preposition) Values.getWord("in"), (Preposition) Values.getWord("sub"), (Preposition) Values.getWord("ante"), (Preposition) Values.getWord("contra"), (Preposition) Values.getWord("inter"), (Preposition) Values.getWord("ob"), (Preposition) Values.getWord("per"), (Preposition) Values.getWord("post"), (Preposition) Values.getWord("propter"), (Preposition) Values.getWord("trans"), (Preposition) Values.getWord("prope"), (Preposition) Values.getWord("apud"), (Preposition) Values.getWord("circum"), (Preposition) Values.getWord("praeter"), (Preposition) Values.getWord("super")})));
		super.setPrepositionPurpose(Purpose.PREPOSITION_ACCUSATIVE_OF_PREPOSITION);
		super.setNounPurpose(Purpose.NOUN_ACCUSATIVE_OF_PREPOSITION);
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