package Words;
import java.util.ArrayList;


public class Word implements Comparable<Word>{
	
	int chapter;
	ArrayList<String> definitions;
	
	public Word(int chapter, ArrayList<String> definitions) {
		this.chapter = chapter;
		this.definitions = definitions;
	}
	
	public Word(Word copy){
		this.chapter = copy.chapter;
		this.definitions = new ArrayList<String>(copy.definitions);
	}
	
	ArrayList<String> getBuzzWords(){ //returns the first three letters of every definition.
		ArrayList<String> output = new ArrayList<String>();
		for(String currentDef : definitions){
			output.add(currentDef.substring(0, 4));
		}
		
		return output;
	}

	@Override
	public int compareTo(Word arg0) { //sort by chapter, and if the chapters are the same, by alphabetical order.
		int chapterCompare = this.chapter-arg0.chapter;
		if(chapterCompare != 0){
		return chapterCompare;
		} else {
			try{
			return this.toString().compareTo(arg0.toString());
			} catch (NullPointerException e){
				if(this == null || this.toString() == null){
					return -1;
				} else if(arg0 == null || arg0.toString() == null ){
					return 1;
				} else {
					System.err.println("Compare Error!");
					return 0;
				}
			}
		}
	}
	
	boolean isValidTranslation(String translation){
		return getBuzzWords().contains(translation.trim().substring(0, 4));
	}
}
