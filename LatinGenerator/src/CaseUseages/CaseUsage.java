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

public abstract class CaseUsage {
	int Case;
	int chapter;
	int[] canModify;
	ArrayList<String> translations;
	ArrayList<Preposition> introducedBy;
	
	public CaseUsage(int Case, int chapter, int[] canModify, ArrayList<String> translations, ArrayList<Preposition> introducedBy){
		this.Case = Case;
		this.chapter = chapter;
		this.canModify = Util.copyArray(canModify);
		this.translations = new ArrayList<String>(translations);
		this.introducedBy = new ArrayList<Preposition>(introducedBy);
	}
	
	public CaseUsage(int Case, int chapter, int[] canModify, String[] translations, Preposition[] introducedBy){
		this.Case = Case;
		this.chapter = chapter;
		this.canModify = Util.copyArray(canModify);
		this.translations = new ArrayList<String>(Arrays.asList(translations));
		this.introducedBy = new ArrayList<Preposition>(Arrays.asList(introducedBy));
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
}
