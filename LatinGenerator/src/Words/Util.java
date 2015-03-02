package Words;
import java.io.File;
import java.util.ArrayList;
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
	
	public static void load(){
		String OSName = System.getProperty("os.name");
		System.out.println("Detected OS: " + OSName);
		if(OSName.startsWith("Windows")){
			FileParser.parseFromDirectory(new File("src/Data"));
		} else {
			FileParser.parseFromDirectory(new File("src\\Data"));
		}
		new Values();
		
		System.out.println("------------");
	}
	
	public static int[] copyArray(int[] input){
		int[] output = new int[input.length];
		for(int i = 0; i < input.length; i++){
			output[i] = input[i];
		}
		return output;
	}
	
	public static <T> T getRandom(ArrayList<T> input){
		if(input.size() == 0)
			return null;
		
		int index = Values.random.nextInt(input.size());
		return input.get(index);
	}
	
	public static int arraySum(double[] input){
		int total = 0;
		for(double i : input){
			total+=i;
		}
		return total;
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
