package CaseUseages;

import java.util.ArrayList;
import java.util.Arrays;

import Words.Util;

public class CaseUsage {
	int Case;
	int chapter;
	int[] canModify;
	ArrayList<String> translations;
	
	public CaseUsage(int Case, int chapter, int[] canModify, ArrayList<String> translations){
		this.Case = Case;
		this.chapter = chapter;
		this.canModify = Util.copyArray(canModify);
		this.translations = new ArrayList<String>(translations);
	}
	
	public CaseUsage(int Case, int chapter, int[] canModify, String[] translations){
		this.Case = Case;
		this.chapter = chapter;
		this.canModify = Util.copyArray(canModify);
		this.translations = new ArrayList<String>(Arrays.asList(translations));
	}
}
