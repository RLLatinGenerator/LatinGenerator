import java.util.Random;


public class Util {
	public static int getRandomPlurality(){
		Random r = new Random();
		return r.nextInt(2);
	}
}
