package CaseUseages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import Words.Clause;
import Words.ConjugatedNoun;
import Words.ConjugatedWord;
import Words.Noun;
import Words.Preposition;
import Words.Purpose;
import Words.Util;
import Words.Values;

public class AccusativeOfDurationOfTime extends CaseUsage{
	
	public AccusativeOfDurationOfTime() { 
		super.setCase(Values.CASE_ABLATIVE);
		super.setChapter(20);
		super.setTypesModified(new int[]{Values.WORD_TYPE_NOUN});
		super.setTranslations(new HashSet<String>(Arrays.asList(new String[]{"for"})));
		//super.setIntroducedBy(new ArrayList<Preposition> (Arrays.asList(new Preposition[]{(Preposition) Values.getWord("ab"), (Preposition) Values.getWord("a")})));
		//super.setPrepositionPurpose(Purpose.PREPOSITION_ABLATIVE_OF_MEANS);
		super.setNounPurpose(Purpose.NOUN_ACCUSATIVE_OF_DURATION_OF_TIME);
	}

	@Override
	public Clause addToWord(ConjugatedWord caseUsageWord, ConjugatedWord toAttachTo) {
		if(checkIfCanModify(toAttachTo)){ //valid.
			return Clause.concatenateClauses(new Clause(caseUsageWord), new Clause(toAttachTo));
		} else return null;
	}
	
	public Clause generateRandomGrammaticalConstruction(ConjugatedWord modified, int maxChapter){
		if(modified != null && !checkIfCanModify(modified)){
			throw new IllegalArgumentException();
		}
		else{
			return new Clause(makeCaseUsage(Noun.getRandomNoun(this.getChapter()), Util.getRandomPlurality()));
		}
		/*else {
			return Clause.concatenateClauses(new Clause(Util.getRandom(getIntroducedBy()).getConjugated(getPrepositionPurpose())), new Clause(makeCaseUsage(Noun.getRandomNoun(maxChapter), Util.getRandomPlurality())));
		}*/
	}

	@Override
	public ConjugatedNoun makeCaseUsage(Noun input, int plurality) {
		return input.decline(getNounPurpose(), this.getCase(), plurality);
	}
	
	
}