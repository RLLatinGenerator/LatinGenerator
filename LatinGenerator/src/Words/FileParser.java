package Words;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class FileParser { //this is a personal WIP; I'm anticipating finishing it up within the next few days. 
	
	private static TreeSet<Noun> allNouns;
	private static TreeSet<Verb> allVerbs;
	private static TreeSet<Adjective> allAdjectives;
	private static TreeSet<Adverb> allAdverbs;
	private static TreeSet<Conjunction> allConjunctions;
	private static TreeSet<Preposition> allPrepositions;
	
	public static void parseFromDirectory(File input){ //input is a directory containing the data files.
		
		long timer = System.currentTimeMillis();
		
		Scanner nouns1;
		Scanner nouns2;
		Scanner nouns3;
		Scanner nouns4;
		Scanner nouns5;
		
		Scanner verbs1;
		Scanner verbs2;
		Scanner verbs3;
		Scanner verbs3IO;
		Scanner verbs4;
		
		Scanner adjectives12;
		Scanner adjectives3;
		
		Scanner adverbs;
		Scanner prepositions;
		Scanner conjunctions;
		
		if(!input.isDirectory()){
			throw new IllegalArgumentException("Input file was not a directory!");
		}
		
		String inputLocation = input.getAbsolutePath();
		
		try {
			//Initialize everything
			nouns1 = new Scanner(new File(inputLocation+"\\Nouns1.txt"));
			nouns2 = new Scanner(new File(inputLocation+"\\Nouns2.txt"));
			nouns3 = new Scanner(new File(inputLocation+"\\Nouns3.txt"));
			nouns4 = new Scanner(new File(inputLocation+"\\Nouns4.txt"));
			nouns5 = new Scanner(new File(inputLocation+"\\Nouns5.txt"));
			
			verbs1 = new Scanner(new File(inputLocation+"\\Verbs1.txt"));
			verbs2 = new Scanner(new File(inputLocation+"\\Verbs2.txt"));
			verbs3 = new Scanner(new File(inputLocation+"\\Verbs3.txt"));
			verbs3IO = new Scanner(new File(inputLocation+"\\Verbs3IO.txt"));
			verbs4 = new Scanner(new File(inputLocation+"\\Verbs4.txt"));
			
			adjectives12 = new Scanner(new File(inputLocation+"\\Adjectives12.txt"));
			adjectives3 = new Scanner(new File(inputLocation+"\\Adjectives3.txt"));
			
			adverbs = new Scanner(new File(inputLocation+"\\Adverbs.txt"));
			prepositions = new Scanner(new File(inputLocation + "\\Prepositions.txt"));
			conjunctions = new Scanner(new File(inputLocation+"\\Conjunctions.txt"));

			//Make the arraylists to hold data
			allNouns = new TreeSet<Noun>();
			allVerbs = new TreeSet<Verb>();
			allAdjectives = new TreeSet<Adjective>();
			allAdverbs = new TreeSet<Adverb>();
			allConjunctions = new TreeSet<Conjunction>();
			allPrepositions = new TreeSet<Preposition>();
			
			allNouns.addAll(parseNouns(nouns1, Values.INDEX_NOUN_TYPE_DECLENSION_FIRST));
			allNouns.addAll(parseNouns(nouns2, Values.INDEX_NOUN_TYPE_DECLENSION_SECOND));
			allNouns.addAll(parse3rdNouns(nouns3));
			allNouns.addAll(parseNouns(nouns4, Values.INDEX_NOUN_TYPE_DECLENSION_FOURTH));
			allNouns.addAll(parseNouns(nouns5, Values.INDEX_NOUN_TYPE_DECLENSION_FIFTH));
			
			allVerbs.addAll(parseVerbs(verbs1, Values.INDEX_VERB_TYPE_CONJUGATION_FIRST));
			allVerbs.addAll(parseVerbs(verbs2, Values.INDEX_VERB_TYPE_CONJUGATION_SECOND));
			allVerbs.addAll(parseVerbs(verbs3, Values.INDEX_VERB_TYPE_CONJUGATION_THIRD));
			allVerbs.addAll(parseVerbs(verbs3IO, Values.INDEX_VERB_TYPE_CONJUGATION_THIRDIO));
			allVerbs.addAll(parseVerbs(verbs4, Values.INDEX_VERB_TYPE_CONJUGATION_FOURTH));
			
			allAdjectives.addAll(parseAdjective12(adjectives12));
			allAdjectives.addAll(parseAdjective3(adjectives3));
			
			allAdverbs.addAll(parseAdverbs(adverbs));
			allPrepositions.addAll(parsePrepositions(prepositions));
			allConjunctions.addAll(parseConjunctions(conjunctions));
			
			//make sure that everything is sorted by chapter!
			
			//close everything
			nouns1.close();
			nouns2.close();
			nouns3.close();
			nouns4.close();
			nouns5.close();
			
			verbs1.close();
			verbs2.close();
			verbs3.close();
			verbs3IO.close();
			verbs4.close();
			
			adjectives12.close();
			adjectives3.close();
			
			adverbs.close();
			prepositions.close();
			conjunctions.close();
			
		} catch (FileNotFoundException e1) {
			System.out.println("Failed to open files!");
			e1.printStackTrace();
		}
		
		int totalWords = allAdjectives.size() + allNouns.size() + allVerbs.size() + allAdverbs.size() + allConjunctions.size() + allPrepositions.size();
		
		System.out.printf("Done in: %d milliseconds! \nParsed %d words. \nFINISHED PARSING. \n", (System.currentTimeMillis()-timer), totalWords);
		
	}
	
	static void trimAll(ArrayList<String> input){
		for(int i = 0; i < input.size(); i++){
			input.add(i, input.remove(i).trim());
		}
	}



	static TreeSet<Preposition> parsePrepositions(Scanner data){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		ArrayList<String[]> raw = parseDataToArray(data);
		TreeSet<Preposition> output = new TreeSet<Preposition>();

		for(String[] current : raw){ //iterate over each line from the original file.

			if(current.length != Values.PREPOSITION_DATA_ARRAY_LENGTH_CORRECT){
				System.err.println("Error parsing a line.");
				continue;
			}

			//System.out.println("Raw: " + Arrays.toString(current));

			//current[] contains a split based on tabs. Generally {chapter, nom/gen/gender, definition}.

			int chapter = 0;
			String Preposition;
			int caseTaken = 0;
			ArrayList<String> definitions = new ArrayList<String>();

			//Values.betterStringArrayPrint(current);

			try{ //try to read a noun, assuming that the chapter IS specified
				chapter = Integer.parseInt(current[0]);
				Preposition = current[1].split(" \\+ ")[0];
				caseTaken = Values.getCaseFromString(current[1].split(" \\+ ")[1]);
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
				definitions.addAll(tempDefinitions);
			} catch(NumberFormatException e){ //can happen if a chapter isn't specified. Read the noun from a null chapter.
				chapter = Values.CHAPTER_VOID;
				Preposition = current[1].split(" \\+ ")[0];
				caseTaken = Values.getCaseFromString(current[1].split(" \\+ ")[1]);
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
				definitions.addAll(tempDefinitions);
			} catch(Exception e){
				e.printStackTrace();
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			trimAll(definitions);
			Preposition currentPreposition = new Preposition(Preposition, caseTaken, chapter, definitions);
			System.out.println("Added: " + currentPreposition);
			output.add(currentPreposition);
		}

		return output;
	}

	static TreeSet<Adjective> parseAdjective12(Scanner data){ //use ADJECTIVE_DECLENSION, not declensions for nouns. Can parse 1st and 2nd declension.
		int declension = Values.DELCENSION_ADJECTIVE_FIRST_AND_SECOND;
		ArrayList<String[]> raw = parseDataToArray(data);
		TreeSet<Adjective> output = new TreeSet<Adjective>();

		for(String[] current : raw){ //iterate over each line from the original file.

			if(current.length != Values.ADJECTIVE_DATA_ARRAY_LENGTH_CORRECT){
				System.err.println("Error parsing a line.");
				continue;
			}

			//System.out.println("Raw: " + Arrays.toString(current));

			//current[] contains a split based on tabs. Generally {chapter, nom/gen/gender, definition}.

			int chapter = 0;
			String masculine;
			String feminine;
			String neuter;

			ArrayList<String> definitions = new ArrayList<String>();

			//Values.betterStringArrayPrint(current);

			try{ //try to read a noun, assuming that the chapter IS specified
				chapter = Integer.parseInt(current[0]);
				masculine = current[1].split(", ")[0];
				feminine = current[1].split(", ")[1];
				neuter = current[1].split(", ")[2];
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
				definitions.addAll(tempDefinitions);
			} catch(Exception e){
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			trimAll(definitions);
			Adjective currentAdjective = new FirstSecondAdjective(masculine, feminine, neuter, chapter, definitions);
			System.out.println("Added: " + currentAdjective);
			output.add(currentAdjective);
		}

		return output;
	}

	static TreeSet<Adjective> parseAdjective3(Scanner data){ //use ADJECTIVE_DECLENSION, not declensions for nouns. Can parse 3rd declension. 
		ArrayList<String[]> raw = parseDataToArray(data);
		TreeSet<Adjective> output = new TreeSet<Adjective>();

		for(String[] current : raw){ //iterate over each line from the original file.

			if(current.length != Values.ADJECTIVE_DATA_ARRAY_LENGTH_CORRECT){
				System.err.println("Error parsing a line.");
				continue;
			}

			//System.out.println("Raw: " + Arrays.toString(current));

			//current[] contains a split based on tabs. Generally {chapter, nom/gen/gender, definition}.

			int chapter = 0;
			ArrayList<String> definitions = new ArrayList<String>();
			Adjective currentAdjective = null;

			//Values.betterStringArrayPrint(current);

			try{ //try to read a noun, assuming that the chapter IS specified
				
				chapter = Integer.parseInt(current[0].trim());
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
				definitions.addAll(tempDefinitions);
				trimAll(definitions);
				
				if(current[1].split(", ").length == 1){
					currentAdjective = new OneTerminationAdjective(current[1].split(", ")[0].split(":")[0], current[1].split(", ")[0].split(":")[1], chapter, definitions);
				} else if(current[1].split(", ").length == 2){
					String mascFem = current[1].split(", ")[0];
					String neuter = current[1].split(", ")[1];
					currentAdjective = new TwoTerminationAdjective(mascFem, neuter, chapter, definitions);
				} else if(current[1].split(", ").length == 3){
					String masculine = current[1].split(", ")[0];
					String feminine = current[1].split(", ")[1];
					String neuter = current[1].split(", ")[2];
					currentAdjective = new ThreeTerminationAdjective(masculine, feminine, neuter, chapter, definitions);
				}

			} catch(Exception e){
				e.printStackTrace();
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			//Adjective currentAdjective = new Adjective(masculine, feminine, neuter, chapter, declension, definitions);
			System.out.println("Added: " + currentAdjective);
			output.add(currentAdjective);
		}

		return output;
	}

	static TreeSet<Noun> parseNouns(Scanner data, int declension){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		assert(declension != Values.INDEX_ENDINGS_DECLENSION_THIRD && declension != Values.INDEX_ENDINGS_DECLENSION_THIRD_I_N && declension != Values.INDEX_ENDINGS_DECLENSION_THIRD_I_N); //there's a separate function for these guys.
		ArrayList<String[]> raw = parseDataToArray(data);
		TreeSet<Noun> output = new TreeSet<Noun>();

		for(String[] current : raw){ //iterate over each line from the original file.

			if(current.length != Values.NOUN_DATA_ARRAY_LENGTH_CORRECT){
				System.err.println("Error parsing a line.");
				continue;
			}

			//System.out.println("Raw: " + Arrays.toString(current));

			//current[] contains a split based on tabs. Generally {chapter, nom/gen/gender, definition}.

			int chapter = 0;
			String nominative = null;
			String genitive = null;
			char gender = '-';
			ArrayList<String> definitions = new ArrayList<String>();

			//Values.betterStringArrayPrint(current);

			try{ //try to read a noun, assuming that the chapter IS specified
				chapter = Integer.parseInt(current[0]);
				nominative = current[1].split(", ")[0];
				genitive = current[1].split(", ")[1];
				gender = current[1].split(", ")[2].charAt(0);
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
				definitions.addAll(tempDefinitions);
			} catch(NumberFormatException e){ //can happen if a chapter isn't specified. Read the noun from a null chapter.
				chapter = Values.CHAPTER_VOID;
				nominative = current[1].split(", ")[0];
				genitive = current[1].split(", ")[1];
				gender = current[1].split(", ")[2].charAt(0);
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
				definitions.addAll(tempDefinitions);
			} catch(Exception e){
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			int genderIndex = Values.getGenderIndex(gender);
			trimAll(definitions);
			Noun currentNoun = new Noun(nominative, genitive, chapter, genderIndex, declension, definitions);
			System.out.println("Added: " + currentNoun);
			output.add(currentNoun);
		}

		return output;
	}

	static TreeSet<Noun> parse3rdNouns(Scanner data){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications

		int declension = 3;
		ArrayList<String[]> raw = parseDataToArray(data);
		TreeSet<Noun> output = new TreeSet<Noun>();

		for(String[] current : raw){ //iterate over each line from the original file.

			if(current.length != Values.NOUN_DATA_ARRAY_LENGTH_CORRECT){
				System.err.println("Error parsing a line.");
				continue;
			}

			//System.out.println("Raw: " + Arrays.toString(current));

			//current[] contains a split based on tabs. Generally {chapter, nom/gen/gender, definition}.

			int chapter = 0;
			String nominative = null;
			String genitive = null;
			char gender = '-';
			ArrayList<String> definitions = new ArrayList<String>();

			//Values.betterStringArrayPrint(current);
			try{
				try{ //try to read a noun, assuming that the chapter IS specified
					chapter = Integer.parseInt(current[0]);
					nominative = current[1].split(", ")[0];
					genitive = current[1].split(", ")[1];
					gender = current[1].split(", ")[2].charAt(0);
					List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
					definitions.addAll(tempDefinitions);
					declension = Values.INDEX_ENDINGS_DECLENSION_THIRD;
					//System.out.println("No i-stem");
				} catch(NumberFormatException e){ //I-Stem.
					chapter = Integer.parseInt(current[0].substring(0, 2));
					nominative = current[1].split(", ")[0];
					genitive = current[1].split(", ")[1];
					gender = current[1].split(", ")[2].charAt(0);
					List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
					definitions.addAll(tempDefinitions);
					declension = Values.INDEX_ENDINGS_DECLENSION_THIRD_I;
					//System.out.println("i-stem");
				}
			} catch(Exception e){
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			int genderIndex = Values.getGenderIndex(gender);
			trimAll(definitions);
			Noun currentNoun = new Noun(nominative, genitive, chapter, genderIndex, declension, definitions);
			System.out.println("Added: " + currentNoun);
			output.add(currentNoun);
		}

		return output;
	}

	static TreeSet<Conjunction> parseConjunctions(Scanner data){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		ArrayList<String[]> raw = parseDataToArray(data);
		TreeSet<Conjunction> output = new TreeSet<Conjunction>();

		for(String[] current : raw){ //iterate over each line from the original file.

			if(current.length != Values.CONJUNCTION_DATA_ARRAY_LENGTH_CORRECT){
				System.err.println("Error parsing a line.");
				continue;
			}

			//System.out.println("Raw: " + Arrays.toString(current));

			//current[] contains a split based on tabs. Generally {chapter, nom/gen/gender, definition}.

			int chapter = 0;
			String Conjunction = null;
			ArrayList<String> definitions = new ArrayList<String>();

			//Values.betterStringArrayPrint(current);

			try{ //try to read a noun, assuming that the chapter IS specified
				chapter = Integer.parseInt(current[0]);
				Conjunction = current[1];
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
				definitions.addAll(tempDefinitions);
			} catch(Exception e){
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			trimAll(definitions);
			Conjunction currentConjunction = new Conjunction(Conjunction, chapter, definitions);
			System.out.println("Added: " + currentConjunction);
			output.add(currentConjunction);
		}

		return output;
	}

	static TreeSet<Adverb> parseAdverbs(Scanner data){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		ArrayList<String[]> raw = parseDataToArray(data);
		TreeSet<Adverb> output = new TreeSet<Adverb>();

		for(String[] current : raw){ //iterate over each line from the original file.

			if(current.length != Values.ADVERB_DATA_ARRAY_LENGTH_CORRECT){
				System.err.println("Error parsing a line.");
				continue;
			}

			//System.out.println("Raw: " + Arrays.toString(current));

			//current[] contains a split based on tabs. Generally {chapter, nom/gen/gender, definition}.

			int chapter = 0;
			String Adverb = null;
			ArrayList<String> definitions = new ArrayList<String>();

			//Values.betterStringArrayPrint(current);

			try{ //try to read a noun, assuming that the chapter IS specified
				chapter = Integer.parseInt(current[0]);
				Adverb = current[1];
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
				definitions.addAll(tempDefinitions);
			} catch(Exception e){
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			trimAll(definitions);
			Adverb currentAdverb = new Adverb(Adverb, chapter, definitions);
			System.out.println("Added: " + currentAdverb);
			output.add(currentAdverb);
		}

		return output;
	}

	static TreeSet<Verb> parseVerbs(Scanner data, int conjugation){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		ArrayList<String[]> raw = parseDataToArray(data);
		TreeSet<Verb> output = new TreeSet<Verb>();

		for(String[] current : raw){ //iterate over each line from the original file.

			if(current.length != Values.VERB_DATA_ARRAY_LENGTH_CORRECT){
				System.err.println("Error parsing a line.");
				continue;
			}

			//System.out.println("Raw: " + Arrays.toString(current));

			//current[] contains a split based on tabs. Generally {chapter, nom/gen/gender, definition}.

			int chapter = 0;
			String PP1 = null;
			String PP2 = null;
			String PP3 = null;
			String PP4 = null;

			String[] PPs = current[1].split(", ");
			ArrayList<String> definitions = new ArrayList<String>();

			//Values.betterStringArrayPrint(current);

			try{ //try to read a noun, assuming that the chapter IS specified
				chapter = Integer.parseInt(current[0].trim());
				PP1 = PPs[0];
				PP2 = PPs[1];
				PP3 = PPs[2];
				try{
					PP4 = PPs[3];
				} catch (ArrayIndexOutOfBoundsException e){
					//deponent verb.
				}
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;"));
				definitions.addAll(tempDefinitions);
			} catch(Exception e){
				System.err.println("Could not read a line!");
				e.printStackTrace();
				continue; //We can't make a noun out of the botrked line.
			}
			Verb currentVerb = new Verb(PP1, PP2, PP3, PP4, conjugation, chapter, definitions);

			System.out.println("Added: " + currentVerb);
			output.add(currentVerb);
		}

		return output;
	}

	static ArrayList<String[]> parseDataToArray(Scanner data){ //return an array of whatever we found in the file.
		ArrayList<String[]> toParse = new ArrayList<String[]>();

		while(data.hasNext()){ //read everything from data into a String ArrayList, fixing it as we go.
			toParse.add(fixInputLine(data.nextLine()).split("%"));
		}

		return toParse;

	}

	static String fixInputLine(String input){ //get rid of tabs, etc: format in a more computer-readable way.
		String fixed = input;

		for(int i = 0; i < 10; i++){ //run 10 passes, getting rid of redundant tabs.
			fixed = fixed.replaceAll("\\\t\\\t", "\t");
		}

		//turn any remaining tabs into % characters. 

		fixed = fixed.replaceAll("\\\t", "%");

		//System.out.println(fixed);
		return fixed;
	}

	public static TreeSet<Preposition> getPrepositionsToChapter(int chapter) {
		chapter++;
		return (TreeSet<Preposition>) allPrepositions.subSet(Values.makeHighestChapterPreposition(0), Values.makeHighestChapterPreposition(chapter));
	}
	
	public static TreeSet<Adverb> getAdverbsToChapter(int chapter) {
		chapter++;
		return (TreeSet<Adverb>) allAdverbs.subSet(Values.makeHighestChapterAdverb(0), Values.makeHighestChapterAdverb(chapter));
	}
	
	public static TreeSet<Noun> getNounsToChapter(int chapter) {
		chapter++;
		return (TreeSet<Noun>) allNouns.subSet(Values.makeHighestChapterNoun(0), Values.makeHighestChapterNoun(chapter));
	}
	
	public static TreeSet<Verb> getVerbsToChapter(int chapter) {
		chapter++;
		return (TreeSet<Verb>) allVerbs.subSet(Values.makeHighestChapterVerb(0), Values.makeHighestChapterVerb(chapter));
	}
	
	public static TreeSet<Conjunction> getConjunctionsToChapter(int chapter) {
		chapter++;
		return (TreeSet<Conjunction>) allConjunctions.subSet(Values.makeHighestChapterConjunction(0), Values.makeHighestChapterConjunction(chapter));
	}
	
	public static TreeSet<Adjective> getAdjectivesToChapter(int chapter) {
		chapter++;
		return (TreeSet<Adjective>) allAdjectives.subSet(Values.makeHighestChapterAdjective(0), Values.makeHighestChapterAdjective(chapter));
	}

}
