package Words;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import CaseUseages.AblativeOfMeans;
import GrammaticalConstructions.AblativeAbsolute;

public class LatinGenerator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		FileParser.parseFromDirectory(new File("src/Data"));
		
		System.out.println("------------");
		
		//System.out.println(new AblativeAbsolute(3).getConstruction().formatAsSentence());
		Values.getWordType(new Noun("cookie", "cookie", 1, 1, 1, new ArrayList<String>(Arrays.asList(new String[]{"def"}))));
		System.out.println(new AblativeOfMeans().generateRandom(2).formatAsSentence());
	}

}
