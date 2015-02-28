package Words;

import java.util.ArrayList;
import java.util.HashSet;

import GrammaticalConstructions.GrammaticalConstruction;

public class Translation {



	public boolean isValidEnglishTranslation(Clause latin, String english){

	}

	/*
	IMPORTANT: 
	[null : This word and purpose can be ommitted completely], 
	[Blank string included OR empty set : Only normal word required], 
	[Given string has nothing but a purpose : The purpose alone is a sufficient translation. No normal definition is needed.] (Ex. ut + purpose clause. we don't want a random 'as' required.)
	[Given string ends with a '+' : A normal definition must be added in addition to the purpose translation]

	 */

	static void printAllValidTranslations(ArrayList<HashSet<String>> input){
		for(HashSet<String> current : input){
			for(String currentS : current){
				System.out.print(currentS + "/");
			}
			System.out.println();
		}
	}

	public static ArrayList<HashSet<String>> getAllPossibleTranslations(Clause latin){
		ArrayList<HashSet<String>> output = new ArrayList<>();

		for(ConjugatedWord currentWord : latin.getWords()){
			int currentPurpose = currentWord.getPurpose();
			//System.out.println(currentWord);
			HashSet<String> purposeTranslations = getTranslationsFromPurpose(currentPurpose);
			HashSet<String> validTranslationsForCurrentWord = new HashSet<>();

			if(purposeTranslations.size() == 0){ //empty set.
				for(String currentEnglishTranslation : currentWord.definitions){
					validTranslationsForCurrentWord.add(currentEnglishTranslation);
				}
			} else {
				for(String currentPurposeTrans : purposeTranslations){
					if(currentPurposeTrans == null){ //	[null : This word and purpose can be ommitted completely], 
						validTranslationsForCurrentWord.add("");
					} else if(currentPurposeTrans.length() == 0){ //[Blank string included : Only normal word required], 
						for(String currentEnglishTranslation : currentWord.definitions){
							validTranslationsForCurrentWord.add(currentEnglishTranslation);
						}
					} else if(currentPurposeTrans.charAt(currentPurposeTrans.length()-1) == '+'){ //[Given string ends with a '+' : A normal definition must be added in addition to the purpose translation]
						for(String currentEnglishTranslation : currentWord.definitions){
							validTranslationsForCurrentWord.add(currentPurposeTrans.substring(0, currentPurposeTrans.length()-1) + " " + currentEnglishTranslation);
						}
					} else { //	[Given string has nothing but a purpose : The purpose alone is a sufficient translation. No normal definition is needed.] (Ex. ut + purpose clause. we don't want a random 'as' required.)
						validTranslationsForCurrentWord.add(currentPurposeTrans);
					}
				}
			}
			output.add(validTranslationsForCurrentWord);
		}
		return output;
	}

	public static HashSet<String> getTranslationsFromPurpose(int purpose){
		for(Class<? extends GrammaticalConstruction> current : Values.grammaticalConstructions){ //search through grammatical constructions, looking for a purpose that matches the passed one.
			try {
				System.out.println(current.newInstance().getPurposeTranslations());
				if(current.newInstance().getPurposeTranslations().containsKey(purpose)){
					return current.newInstance().getPurposeTranslations().get(purpose);
				}
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		throw new IllegalArgumentException("Invalid purpose integer: " + purpose);
	}

	public static String cleanEnglishTranslation(String translation){
		translation = translation.toLowerCase();
		for(String current : Values.irrelevantEnglishWords){
			translation = translation.replaceAll(current + " ", "");
		}

		return translation;

	}

	boolean isValidTranslation(Word word, String translation){
		return word.getBuzzWords().contains(translation.trim().substring(0, 4));
	}

}
