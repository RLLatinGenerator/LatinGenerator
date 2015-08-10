package CaseUseages;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import GrammaticalConstructions.GrammaticalConstruction;
import Words.Clause;
import Words.ConjugatedNoun;
import Words.ConjugatedWord;
import Words.Noun;
import Words.Preposition;
import Words.Purpose;
import Words.Values;
import Words.Word;

public abstract class CaseUsage extends GrammaticalConstruction{ //MAKE SURE TO ADD ANY NEW CASE USAGES TO VALUES.CASEUSAGES!
	private int Case;
	//private ArrayList<String> translations;
	private ArrayList<Preposition> introducedBy;
	private int prepositionPurpose;
	private int nounPurpose;
	
	public CaseUsage(int Case, int chapter, int[] canModify, int prepositionPurpose, int nounPurpose, HashMap<Integer, HashSet<String>> purposeTranslations){
		super(chapter, canModify, purposeTranslations);
		this.Case = Case;
		this.introducedBy = new ArrayList<Preposition>(introducedBy);
		this.prepositionPurpose = prepositionPurpose;
		this.nounPurpose = nounPurpose;
		
	}
	
	public CaseUsage(int Case, int chapter, int[] canModify, int prepositionPurpose, int nounPurpose, HashSet<String> translations){ //translations are assumed to be translations for the preposition.
		super(chapter, canModify);
		this.Case = Case;
		setTranslations(translations);
		this.introducedBy = new ArrayList<Preposition>(introducedBy);
		this.prepositionPurpose = prepositionPurpose;
		this.nounPurpose = nounPurpose;
	}
	
	public CaseUsage(){
		
	}
	
	public Clause generateRandom(int maxChapter){
		return generateRandomGrammaticalConstruction(null, maxChapter);
	}
	
	/*
	public CaseUsage(int Case, int chapter, int[] canModify, int prepositionPurpose, int nounPurpose, String[] translations, Preposition[] introducedBy){
		this(Case, chapter, canModify, prepositionPurpose, nounPurpose, new ArrayList<String>(Arrays.asList(translations)), new ArrayList<Preposition>(Arrays.asList(introducedBy)));
	}
	*/
	
	public boolean needsIntroductionPreposition(){
		return !(introducedBy.size()==0);
	}
	
	public abstract Clause addToWord(ConjugatedWord caseUsageWord, ConjugatedWord toAttachTo); //for example, if I pass a verb, it will append a ablative of means.
	public abstract ConjugatedNoun makeCaseUsage(Noun input, int plurality);
	//public abstract Clause generateRandom(int maxChapter);
	
	public boolean checkIfCanModify(Word word){
		int type = Values.getWordType(word);
		return (Arrays.asList(getTypesModified()).contains(type));
	}

	public int getCase() {
		return Case;
	}

	public void setCase(int case1) {
		Case = case1;
	}

	/*
	public ArrayList<String> getTranslations() {
		return new ArrayList<String>(translations);
	}
	*/

	public void setTranslations(HashSet<String> translations) {
		HashMap<Integer, HashSet<String>> purposeTranslations = new HashMap<>();
		purposeTranslations.put(getPrepositionPurpose(), translations);
		purposeTranslations.put(getNounPurpose(), new HashSet<String>());
		setPurposeTranslations(purposeTranslations);
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
