package CaseUseages;

import java.util.ArrayList;
import java.util.Arrays;

import Words.Clause;
import Words.ConjugatedNoun;
import Words.ConjugatedWord;
import Words.Noun;
import Words.Preposition;
import Words.Purpose;
import Words.Util;
import Words.Values;

public class AblativeOfMeans extends CaseUsage{
	
	public AblativeOfMeans() { //I've made this as easy as I possible can to copy-paste. MAKE SURE TO ADD ANY NEW CASE USAGES TO VALUES.CASEUSAGES!
		//super(myCaseTaken, myChapter, new int[]{Values.WORD_TYPE_VERB}, new String[]{"by", "by means of"}, new Preposition[]{(Preposition) Values.getWord("ab"), (Preposition) Values.getWord("a")});
		super.setCase(Values.CASE_ABLATIVE);
		super.setChapter(20);
		super.setCanModify(new int[]{Values.WORD_TYPE_VERB});
		super.setTranslations(new ArrayList<String>(Arrays.asList(new String[]{"by", "by means of"})));
		super.setIntroducedBy(new ArrayList<Preposition> (Arrays.asList(new Preposition[]{(Preposition) Values.getWord("ab"), (Preposition) Values.getWord("a")})));
		super.setPrepositionPurpose(Purpose.PREPOSITION_ABLATIVE_OF_MEANS);
		super.setNounPurpose(Purpose.NOUN_ABLATIVE_OF_MEANS);
	}

	@Override
	public Clause addToWord(ConjugatedWord caseUsageWord, ConjugatedWord toAttachTo) {
		if(checkIfCanModify(toAttachTo)){ //valid.
			return Clause.concatenateClauses(new Clause(caseUsageWord), new Clause(toAttachTo));
		} else return null;
	}
	
	public Clause generateRandom(int maxChapter){
		if(!needsIntroductionPreposition()){
			return new Clause(makeCaseUsage(Noun.getRandomNoun(this.getChapter()), Util.getRandomPlurality()));
		} else {
			return Clause.concatenateClauses(new Clause(Util.getRandom(getIntroducedBy()).getConjugated(getPrepositionPurpose())), new Clause(makeCaseUsage(Noun.getRandomNoun(maxChapter), Util.getRandomPlurality())));
		}
	}

	@Override
	public ConjugatedNoun makeCaseUsage(Noun input, int plurality) {
		return input.decline(getNounPurpose(), this.getCase(), plurality);
	}
	
	
}
