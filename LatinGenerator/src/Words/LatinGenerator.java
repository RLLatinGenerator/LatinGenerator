package Words;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import GrammaticalConstructions.AblativeAbsolute;

public class LatinGenerator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Util.load();
		
		Clause test = new AblativeAbsolute().generateRandomGrammaticalConstruction(null, 20);
		System.out.println(test.formatAsSentence());
		String english = in.nextLine();
		System.out.println(Translation.isValidEnglishTranslation(test, english));
		Translation.printAllValidTranslations(Translation.getAllPossibleTranslations(test));
	}

}
