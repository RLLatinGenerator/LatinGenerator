package Words;
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
	
	public static int arraySum(double[] input){
		int total = 0;
		for(double i : input){
			total+=i;
		}
		return total;
	}
	
	public static String cleanEnglishTranslation(String translation){
		translation = translation.toLowerCase();
		for(String current : Values.irrelevantEnglishWords){
			translation = translation.replaceAll(current + " ", "");
		}
		
		return translation;
		
	}
	
	public static int getRandomNounAttachment(){
		Random r = new Random();
		double total = arraySum(Values.NOUN_CLAUSE_PROBABILITY_ATTACH_TO_NOUN_CLAUSE);
		double rNum = r.nextDouble()*total;
		
		for(int i = 0; i < Values.NOUN_CLAUSE_PROBABILITY_ATTACH_TO_NOUN_CLAUSE.length; i++){
			
			rNum -= Values.NOUN_CLAUSE_PROBABILITY_ATTACH_TO_NOUN_CLAUSE[i];
			if(rNum <= 0){
				return i;
			}
		}
		
		return -1;
	}
}
