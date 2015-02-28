package CaseUseages;

import java.util.ArrayList;
import java.util.Arrays;

import Words.Clause;
import Words.ConjugatedNoun;
import Words.ConjugatedWord;
import Words.Noun;
import Words.Preposition;
import Words.Util;
import Words.Values;
import Words.Word;

public abstract class CaseUsage { //MAKE SURE TO ADD ANY NEW CASE USAGES TO VALUES.CASEUSAGES!
	private int Case;
	private int chapter;
	private int[] canModify;
	private ArrayList<String> translations;
	private ArrayList<Preposition> introducedBy;
	private int prepositionPurpose;
	private int nounPurpose;
	
	public CaseUsage(int Case, int chapter, int[] canModify, int prepositionPurpose, int nounPurpose, ArrayList<String> translations, ArrayList<Preposition> introducedBy){
		this.Case = Case;
		this.chapter = chapter;
		this.canModify = Util.copyArray(canModify);
		this.translations = new ArrayList<String>(translations);
		this.introducedBy = new ArrayList<Preposition>(introducedBy);
		this.prepositionPurpose = prepositionPurpose;
		this.nounPurpose = nounPurpose;
	}
	
	public CaseUsage(){
		
	}
	
	public CaseUsage(int Case, int chapter, int[] canModify, int prepositionPurpose, int nounPurpose, String[] translations, Preposition[] introducedBy){
		this(Case, chapter, canModify, prepositionPurpose, nounPurpose, new ArrayList<String>(Arrays.asList(translations)), new ArrayList<Preposition>(Arrays.asList(introducedBy)));
	}
	
	public boolean needsIntroductionPreposition(){
		return !(introducedBy.size()==0);
	}
	
	public abstract Clause addToWord(ConjugatedWord caseUsageWord, ConjugatedWord toAttachTo); //for example, if I pass a verb, it will append a ablative of means.
	public abstract ConjugatedNoun makeCaseUsage(Noun input, int plurality);
	public abstract Clause generateRandom(int maxChapter);
	
	public boolean checkIfCanModify(Word word){
		int type = Values.getWordType(word);
		return (Arrays.asList(canModify).contains(type));
	}

	public int getCase() {
		return Case;
	}

	public void setCase(int case1) {
		Case = case1;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public int[] getCanModify() {
		return Util.copyArray(canModify);
	}

	public void setCanModify(int[] canModify) {
		this.canModify = Util.copyArray(canModify);
	}

	public ArrayList<String> getTranslations() {
		return new ArrayList<String>(translations);
	}

	public void setTranslations(ArrayList<String> translations) {
		this.translations = new ArrayList<String>(translations);
	}

	public ArrayList<Preposition> getIntroducedBy() {
		return new ArrayList<Preposition>(introducedBy);
	}

	public void setIntroducedBy(ArrayList<Preposition> introducedBy) {
		this.introducedBy = new ArrayList<Preposition>(introducedBy);
	}

	public int getPrepositionPurpose() {
		return prepositionPurpose;
	}

	public void setPrepositionPurpose(int prepositionPurpose) {
		this.prepositionPurpose = prepositionPurpose;
	}

	public int getNounPurpose() {
		return nounPurpose;
	}

	public void setNounPurpose(int nounPurpose) {
		this.nounPurpose = nounPurpose;
	}
}
