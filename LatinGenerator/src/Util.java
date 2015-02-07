import java.util.Random;


public class Util {
	public static int getRandomNumber(){
		Random r = new Random();
		return r.nextInt(2);
	}
}
