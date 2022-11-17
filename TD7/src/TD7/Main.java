package TD7;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Date a = new Date();
		GregorianCalendar b = new GregorianCalendar();

//		System.out.println(a);
//		System.out.println(b.get(Calendar.HOUR));
//		System.out.println(b.get(Calendar.MINUTE));
//		System.out.println(b.get(Calendar.SECOND));
//
//		System.out.println(b.get(Calendar.DATE));
//		System.out.println(b.get(Calendar.MONTH));
//		System.out.println(b.get(Calendar.YEAR));
//		
//		System.out.println(b.getTime());
		
		Calendar2 c = new Calendar2();
		c.creation();

		try {
		    Thread.sleep(10000);
		} catch (InterruptedException ie) {}
		
		c.afficher();
		System.out.println(c.iscours());
		System.out.println(c.duree());

		

		
	}
}
