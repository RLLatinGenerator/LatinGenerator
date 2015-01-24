import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FileParser { //this is a personal WIP; I'm anticipating finishing it up within the next few days. 
	public static ArrayList<Preposition> parseFromDirectory(File input){ //input is a directory containing the data files.
		//if(!input.isDirectory()){
		//	throw new IllegalArgumentException("Input file was not a directory!");
		//}

		Scanner data = null;
		try {
			data = new Scanner(input);
		} catch (FileNotFoundException e) {
			System.err.println("Error opening passed file!");
			return null;
		}
		ArrayList<Preposition> output = null;

		System.out.println(parseAdjective3(data));


		data.close();

		return output;

	}



	static ArrayList<Preposition> parsePrepositions(Scanner data){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		ArrayList<String[]> raw = parseDataToArray(data);
		ArrayList<Preposition> output = new ArrayList<Preposition>();

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
			Preposition currentPreposition = new Preposition(Preposition, caseTaken, chapter, definitions);
			System.out.println("Added: " + currentPreposition);
			output.add(currentPreposition);
		}

		return output;
	}

	static ArrayList<Adjective> parseAdjective12(Scanner data){ //use ADJECTIVE_DECLENSION, not declensions for nouns. Can parse 1st and 2nd declension.
		int declension = Values.DELCENSION_ADJECTIVE_FIRST_AND_SECOND;
		ArrayList<String[]> raw = parseDataToArray(data);
		ArrayList<Adjective> output = new ArrayList<Adjective>();

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
			Adjective currentAdjective = new Adjective(masculine, feminine, neuter, chapter, declension, definitions);
			System.out.println("Added: " + currentAdjective);
			output.add(currentAdjective);
		}

		return output;
	}

	static ArrayList<Adjective> parseAdjective3(Scanner data){ //use ADJECTIVE_DECLENSION, not declensions for nouns. Can parse 3rd declension. 
		
		int declension = -1;
		ArrayList<String[]> raw = parseDataToArray(data);
		ArrayList<Adjective> output = new ArrayList<Adjective>();

		for(String[] current : raw){ //iterate over each line from the original file.

			if(current.length != Values.ADJECTIVE_DATA_ARRAY_LENGTH_CORRECT){
				System.err.println("Error parsing a line.");
				continue;
			}

			//System.out.println("Raw: " + Arrays.toString(current));

			//current[] contains a split based on tabs. Generally {chapter, nom/gen/gender, definition}.

			int chapter = 0;
			String masculine = null;
			String feminine = null;
			String neuter = null;
			ArrayList<String> definitions = new ArrayList<String>();

			//Values.betterStringArrayPrint(current);

			try{ //try to read a noun, assuming that the chapter IS specified
				if(current[1].split(", ").length == 1){
					masculine = current[1].split(", ")[0];
					feminine = null;
					neuter = null;
					declension = Values.DELCENSION_ADJECTIVE_THIRD_1;
				} else if(current[1].split(", ").length == 2){
					masculine = current[1].split(", ")[0];
					feminine = current[1].split(", ")[1];
					neuter = null;
					declension = Values.DELCENSION_ADJECTIVE_THIRD_2;
				} else if(current[1].split(", ").length == 3){
					masculine = current[1].split(", ")[0];
					feminine = current[1].split(", ")[1];
					neuter = current[1].split(", ")[2];
					declension = Values.DELCENSION_ADJECTIVE_THIRD_3;
				}
				chapter = Integer.parseInt(current[0].trim());
				List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
				definitions.addAll(tempDefinitions);
			} catch(Exception e){
				e.printStackTrace();
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			Adjective currentAdjective = new Adjective(masculine, feminine, neuter, chapter, declension, definitions);
			System.out.println("Added: " + currentAdjective);
			output.add(currentAdjective);
		}

		return output;
	}

	static ArrayList<Noun> parseNouns(Scanner data, int declension){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		assert(declension != Values.INDEX_DECLENSION_THIRD && declension != Values.INDEX_DECLENSION_THIRD_I_N && declension != Values.INDEX_DECLENSION_THIRD_I_N); //there's a separate function for these guys.
		ArrayList<String[]> raw = parseDataToArray(data);
		ArrayList<Noun> output = new ArrayList<Noun>();

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
			Noun currentNoun = new Noun(nominative, genitive, chapter, genderIndex, declension, definitions);
			System.out.println("Added: " + currentNoun);
			output.add(currentNoun);
		}

		return output;
	}

	static ArrayList<Noun> parse3rdNouns(Scanner data){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications

		int declension = 3;
		ArrayList<String[]> raw = parseDataToArray(data);
		ArrayList<Noun> output = new ArrayList<Noun>();

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
					declension = Values.INDEX_DECLENSION_THIRD;
					System.out.println("No i-stem");
				} catch(NumberFormatException e){ //I-Stem.
					chapter = Integer.parseInt(current[0].substring(0, 2));
					nominative = current[1].split(", ")[0];
					genitive = current[1].split(", ")[1];
					gender = current[1].split(", ")[2].charAt(0);
					List<String> tempDefinitions = Arrays.asList(current[2].split(",|;")); //definitions
					definitions.addAll(tempDefinitions);
					declension = Values.INDEX_DECLENSION_THIRD_I;
					System.out.println("i-stem");
				}
			} catch(Exception e){
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			int genderIndex = Values.getGenderIndex(gender);
			Noun currentNoun = new Noun(nominative, genitive, chapter, genderIndex, declension, definitions);
			System.out.println("Added: " + currentNoun);
			output.add(currentNoun);
		}

		return output;
	}

	static ArrayList<Conjunction> parseConjunctions(Scanner data){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		ArrayList<String[]> raw = parseDataToArray(data);
		ArrayList<Conjunction> output = new ArrayList<Conjunction>();

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
			Conjunction currentConjunction = new Conjunction(Conjunction, chapter, definitions);
			System.out.println("Added: " + currentConjunction);
			output.add(currentConjunction);
		}

		return output;
	}

	static ArrayList<Adverb> parseAdverbs(Scanner data){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		ArrayList<String[]> raw = parseDataToArray(data);
		ArrayList<Adverb> output = new ArrayList<Adverb>();

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
			Adverb currentAdverb = new Adverb(Adverb, chapter, definitions);
			System.out.println("Added: " + currentAdverb);
			output.add(currentAdverb);
		}

		return output;
	}

	static ArrayList<Verb> parseVerbs(Scanner data, int conjugation){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
		ArrayList<String[]> raw = parseDataToArray(data);
		ArrayList<Verb> output = new ArrayList<Verb>();

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

}
