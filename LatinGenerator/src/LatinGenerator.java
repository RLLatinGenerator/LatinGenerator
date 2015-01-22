public class LatinGenerator {

	public static void main(String[] args) {
		//Main function for testing.
		Noun n = new Noun("pokemus", "pokemi");
		System.out.println(n);
		String testVerb = Verb.conjugate(3, "portare", "portavi", 0, 0, 1);
		System.out.println(testVerb);
	}

}
