import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class FileParser { //this is a personal WIP; I'm anticipating finishing it up within the next few days. 
	public static ArrayList<Noun> parseFromDirectory(File input){ //input is a directory containing the data files.
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
		ArrayList<Noun> output = parseNouns(data, 5);


		data.close();

		return output;

	}

	static ArrayList<Noun> parseNouns(Scanner data, int declension){ //given a declension file, parse the nouns. Cannot do ones that have i-stem or no i-stem clarifications
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
			
			//Values.betterStringArrayPrint(current);
			
			try{ //try to read a noun, assuming that the chapter IS specified
				chapter = Integer.parseInt(current[0]);
				nominative = current[1].split(", ")[0];
				genitive = current[1].split(", ")[1];
				gender = current[1].split(", ")[2].charAt(0);
			} catch(NumberFormatException e){ //can happen if a chapter isn't specified. Read the noun from a null chapter.
				chapter = Values.CHAPTER_VOID;
				nominative = current[1].split(", ")[0];
				genitive = current[1].split(", ")[1];
				gender = current[1].split(", ")[2].charAt(0);
			} catch(Exception e){
				System.err.println("Could not read a line!");
				continue; //We can't make a noun out of the botrked line.
			}
			int genderIndex = Values.getGenderIndex(gender);
			Noun currentNoun = new Noun(nominative, genitive, chapter, genderIndex, declension);
			System.out.println("Added: " + currentNoun);
			output.add(currentNoun);
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
