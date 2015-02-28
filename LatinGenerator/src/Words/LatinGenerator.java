package Words;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import GrammaticalConstructions.AblativeAbsolute;

public class LatinGenerator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		FileParser.parseFromDirectory(new File("src/Data"));
		Values v= new Values();
		
		System.out.println("------------");
		
		//System.out.println(new AblativeAbsolute(3).getConstruction().formatAsSentence());
		Values.getWordType(new Noun("cookie", "cookie", 1, 1, 1, new ArrayList<String>(Arrays.asList(new String[]{"def"}))));
		Clause test = new AblativeAbsolute().generateRandomGrammaticalConstruction(null, 20);
		/*for(ConjugatedWord w : test.getWords()){
			System.out.println(Translation.getTranslationsFromPurpose(w.getPurpose()));
		}*/
		System.out.println(test.formatAsSentence());
		System.out.println("debug");
		Translation.printAllValidTranslations(Translation.getAllPossibleTranslations(test));
	}

}
