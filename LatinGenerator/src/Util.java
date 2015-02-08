import java.util.Random;
import java.util.TreeSet;


public class Util {
	public static int getRandomPlurality(){ //returns plurality.
		Random r = new Random();
		return r.nextInt(2);
	}
	
	public static TreeSet<Word> getWordsUpToChapter(TreeSet<Word> all, int chapter){
		TreeSet<Word> output = new TreeSet<>();
		for(Word current: all){
			if(current.chapter <= chapter){
				output.add(current);
			}
			else break;
		}
		
		return output;
	}
}
