package Words;
import java.io.File;
import java.util.Scanner;

import GrammaticalConstructions.AblativeAbsolute;

public class LatinGenerator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		FileParser.parseFromDirectory(new File("src/Data"));
		
		System.out.println("------------");
		
		System.out.println(new AblativeAbsolute(60).getConstruction().formatAsSentence());
		
		
	}

}
