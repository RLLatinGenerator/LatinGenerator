package Words;

import java.util.ArrayList;
import java.util.HashSet;

import CaseUseages.CaseUsage;
import GrammaticalConstructions.GrammaticalConstruction;

public class Translation {
	
	public boolean isValidEnglishTranslation(Clause latin, String english){
		english = cleanEnglishTranslation(english);
		for(ConjugatedWord currentWord : latin.getWords()){
			int currentPurpose = currentWord.getPurpose();
			//int currentValid 
			ArrayList<String> currentWordTranslations = currentWord.getBuzzWords()
		}
		
	}
	
	public HashSet<String> getTranslationsFromPurpose(int purpose){
		for(Class<? extends GrammaticalConstruction> current : Values.grammaticalConstructions){ //search through grammatical constructions.
			try {
				if(current.newInstance().getPurposeTranslations().containsKey(purpose)){
					return current.newInstance().getPurposeTranslations().get(purpose);
				}
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
		for(Class<? extends CaseUsage> current : Values.caseUsages){ //search through grammatical constructions.
			try {
				if(current.newInstance().containsKey(purpose)){
					return current.newInstance().getPurposeTranslations().get(purpose);
				}
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String cleanEnglishTranslation(String translation){
		translation = translation.toLowerCase();
		for(String current : Values.irrelevantEnglishWords){
			translation = translation.replaceAll(current + " ", "");
		}
		
		return translation;
		
	}
	
	boolean validEnglishTranslation(String translation){
		translation = Translation.cleanEnglishTranslation(translation);
		String[] englishWords = translation.split(" ");
		int latinWordsIndex = 0;
		if(englishWords.length < words.length){
			return false;
		}
		
		for(int i = 0; i < this.words.length; i++){
			if(this.words[latinWordsIndex].isValidTranslation(englishWords[i])){
				System.out.println(this.words[latinWordsIndex] + " == " + englishWords[i]);
				latinWordsIndex++;
			}
		}
		
		if(latinWordsIndex >= this.words.length){
			return true;
		} else {
			return false;
		}	
	}
	
	boolean isValidTranslation(Word word, String translation){
		return word.getBuzzWords().contains(translation.trim().substring(0, 4));
	}
	
}
