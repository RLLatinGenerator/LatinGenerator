import java.io.File;

public class LatinGenerator {

	public static void main(String[] args) {
		//Main function for testing.
		//Noun n = new Noun("pokemus", "pokemi");
		//System.out.println(n);
		//String testVerb = Verb.conjugate(3, "portare", "portavi", 0, 0, 1);
		//System.out.println(testVerb);
		FileParser.parseFromDirectory(new File("M:\\Documents\\Text Files\\Data"));
		//System.out.println(Noun.getRandomNoun());
		
		System.out.println("------------");
		
		System.out.println(FileParser.getNounsToChapter(3)); //working on this.
		
		//for (int i = 0; i < 20; i++) {
		//	System.out.println(Clause.makeToBeSentence(4).formatAsSentence());
		//}
		
		//System.out.println(Util.getWordsUpToChapter(FileParser.getAllNouns(), 3));
		
	}

}
