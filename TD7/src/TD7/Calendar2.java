package TD7;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar2 extends Calendar {
	protected Date creation;
	boolean cours;
	
	public Calendar2() {
		super();
		creation = new Date();
		cours = _iscours();
	}
	
	private boolean _iscours() {
		if (9 < this.creation.getHours() && this.creation.getHours() < 13) {
			return true;
		} else {
			if (9 == this.creation.getHours() && 29 < this.creation.getMinutes()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean iscours() {
		return cours;
	}
	
	private String TimeToString(Date d) {
		String H = Integer.toString(d.getHours());
		String M = Integer.toString(d.getMinutes());
		String S = Integer.toString(d.getSeconds());
		return H + " heures " + M + " minutes " + S + " secondes";						
	}
	
	private String DateToString(Date d) {
		String D = Integer.toString(d.getDay());
		String M = Integer.toString(d.getMonth());
		String Y = Integer.toString(d.getYear()+1900);
		return D + "/" + M + "/" + Y;	

	}
	
	public void creation() {
		System.out.println(TimeToString(this.creation));
	}
	
	public void afficher() {
		System.out.println(DateToString(new Date()));
		System.out.println(TimeToString(new Date()));
	}
	
	public int duree() {
		Date d = new Date();
		return ((int) (d.getTime() - this.creation.getTime()))/1000;
	}


}
