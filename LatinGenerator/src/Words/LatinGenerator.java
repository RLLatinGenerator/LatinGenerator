package Words;
import java.io.File;
import java.util.Scanner;

public class LatinGenerator {

	public static void main(String[] args) {
		
		/*
		 * TODO LIST
		 * ---------
		 * 
		 * 
		 */
		
		//Main function for testing.
		//Noun n = new Noun("pokemus", "pokemi");
		//System.out.println(n);
		//String testVerb = Verb.conjugate(3, "portare", "portavi", 0, 0, 1);
		//System.out.println(testVerb);
		
		//ConsoleInterface.runConsole();
		
		Scanner in = new Scanner(System.in);
		FileParser.parseFromDirectory(new File("src/Data"));
		//System.out.println(Noun.getRandomNoun());
		
		System.out.println("------------");
		
		//System.out.println(FileParser.getNounsToChapter(3)); //working on this.
		
		/*for (int i = 0; i < 20; i++) {
			System.out.println(Clause.makeToBeSentence(2).formatAsSentence());
		}*/
		
		Clause sentence = Clause.makeSubjVerbSentence(2, 0);
		
		System.out.println(sentence.formatAsSentence());
		
		//System.out.println(Util.getRandomNounAttachment());
		
		String answer = in.nextLine();
		
		System.out.println(sentence.validEnglishTranslation(answer) ? "You got it right!" : "You got it wrong!");
		
		//System.out.println(Util.getWordsUpToChapter(FileParser.getAllNouns(), 3));
		
	}

}
