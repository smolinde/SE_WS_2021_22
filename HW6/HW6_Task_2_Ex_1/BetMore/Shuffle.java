import java.util.Random;

public class Shuffle {
	public static int pick_card () {
		Random rnd = new Random();
		return rnd.nextInt(101);
	}
}
