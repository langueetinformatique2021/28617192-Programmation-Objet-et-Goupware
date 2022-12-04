package TDs.TD7;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		long randomNum = ThreadLocalRandom.current().nextInt(5000, 15000 + 1);

		Calendar2 c = new Calendar2();
		c.creation();
		c.afficher();
		System.out.println(c.iscours());

		try {
			System.out.println(randomNum/1000.0 + " secondes d'attentes");
		    Thread.sleep(randomNum);
		} catch (InterruptedException ie) {}

		System.out.println(c.duree());		
	}
}
