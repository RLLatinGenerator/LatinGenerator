import java.io.File;

public class LatinGenerator {

	public static void main(String[] args) {
		//Main function for testing.
		//Noun n = new Noun("pokemus", "pokemi");
		//System.out.println(n);
		System.out.println(FileParser.parseFromDirectory(new File("M:\\Documents\\Text Files\\Data\\Adjectives3.txt")));
	}

}
