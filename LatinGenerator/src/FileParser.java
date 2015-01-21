import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileParser { //this is a personal WIP; I'm anticipating finishing it up within the next few days. 
	ArrayList<Word> parseFromDirectory(File input){ //input is a directory containing the data files.
		if(!input.isDirectory()){
			throw new IllegalArgumentException("Input file was not a directory!");
		}

			Scanner data = null;
			try {
				 data = new Scanner(input);
			} catch (FileNotFoundException e) {
				System.err.println("Error opening passed file!");
				return null;
			}
			//
			
			
			data.close();
		
	}
	
	ArrayList<Noun> parseNouns(Scanner data){
		ArrayList<String[]> raw = parseDataToArray(data);
		ArrayList<Noun> output = new ArrayList<Noun>();
		
		for(String[] current : raw){ //iterate over each line from the original file.
			int chapter = Integer.parseInt(current[0]);
			String nominative = current[1].split(", ")[0];
			String genitive = current[1].split(", ")[1];
			char gender = current[2].split(", ")[2].charAt(0);
		}
	}
	
	ArrayList<String[]> parseDataToArray(Scanner data){ //return an array of whatever we found in the file.
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
		
		System.out.println(fixed);
		return null;
	}
	
}
