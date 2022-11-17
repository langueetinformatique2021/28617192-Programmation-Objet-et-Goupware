package TD7;
import java.util.Calendar;
import java.util.Date;
@SuppressWarnings("deprecation")
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
	
	public String iscours() {
        return _iscours() ? "Fait en cours" : "Fait en dehors du cours";
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
		System.out.println("Heure : " + TimeToString(this.creation));
	}
	
	public void afficher() {
		System.out.println("Date: " + DateToString(new Date()) 
				+ "\t Heure : " + TimeToString(new Date()));
	}
	
	private double _duree() {
		Date d = new Date();
		return (d.getTime() - this.creation.getTime()) /1000.0;
	}
	
	public String duree() {
		return "Le calendrier a été créé il y a "+ _duree() + " secondes";
	}

	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int field, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roll(int field, boolean up) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}


}
