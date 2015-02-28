package CaseUseages;

import Words.Clause;
import Words.ConjugatedNoun;
import Words.ConjugatedWord;
import Words.Noun;
import Words.Preposition;
import Words.Purpose;
import Words.Util;
import Words.Values;

public class AblativeOfMeans extends CaseUsage{

	public AblativeOfMeans() {
		super(Values.CASE_ABLATIVE, 20, new int[]{Values.WORD_TYPE_VERB}, new String[]{"by", "by means of"}, new Preposition[]{(Preposition) Values.getWord("ab"), (Preposition) Values.getWord("a")});
	}

	@Override
	public Clause addToWord(ConjugatedWord caseUsageWord, ConjugatedWord toAttachTo) {
		if(checkIfCanModify(toAttachTo)){ //valid.
			return Clause.concatenateClauses(new Clause(caseUsageWord), new Clause(toAttachTo));
		} else return null;
	}
	
	public Clause generateRandom(int maxChapter){
		if(!needsIntroductionPreposition()){
			return new Clause(makeCaseUsage(Noun.getRandomNoun(maxChapter), Util.getRandomPlurality()));
		} else {
			return Clause.concatenateClauses(new Clause(Util.getRandom(introducedBy).getConjugated(Purpose.PREPOSITION_ABLATIVE_OF_MEANS)), new Clause(makeCaseUsage(Noun.getRandomNoun(maxChapter), Util.getRandomPlurality())));
		}
	}

	@Override
	public ConjugatedNoun makeCaseUsage(Noun input, int plurality) {
		return input.decline(Purpose.NOUN_ABLATIVE_OF_MEANS, this.Case, plurality);
	}
	
	
}
