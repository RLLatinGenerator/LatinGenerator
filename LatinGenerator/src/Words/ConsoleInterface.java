package Words;
import java.io.File;
import java.util.Scanner;


public class ConsoleInterface {
	
	private static String currentDataPath = "";
	private static Scanner in;
	
	public static void runConsole(){
		in = new Scanner(System.in);
		while(true){
			System.out.print(":");
			String command = in.nextLine();
			routeCommand(command);
			System.out.println("/");

		}
	}
	
	public static void routeCommand(String input){
		if(input.contains("parse")){
			parse(input);
		}
	}
	
	private static void test(){
		System.out.println("Working");
	}
	
	private static void parse(String input){
		if(input.equals("parse")){
		System.out.println("Data assumed to be in: " + currentDataPath +".");
		System.out.println("Parsing file...");
		FileParser.parseFromDirectory(new File(currentDataPath));
		} else if(input.contains("changeDataLocation")){
			System.out.println("Please type a new location: ");
			currentDataPath = in.nextLine();
		}
	}
}
