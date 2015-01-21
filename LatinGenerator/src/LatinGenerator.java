import java.util.Scanner;


public class LatinGenerator {

	public static void main(String[] args) {
		//Main function for testing.
		Noun n = new Noun("pokemus", "pokemi");
		System.out.println(n);
		
		Scanner in = new Scanner(System.in);
		
		FileParser.fixInputLine(in.nextLine());
	}
	
}
