package td5;

public class TestCarafe {
	public static void main(String[] args) throws Exception {
		Carafe c1 = new Carafe(10, 10);
		Carafe c2 = new Carafe();
		System.out.println("initialisation");
		System.out.println(c1.Contenu());
		System.out.println(c1.Capacite());
		System.out.println(c2.Contenu());
		System.out.println(c2.Capacite());
		
		Carafe.Transvaser(c1, c2);
		System.out.println("Static Transvaser");
		System.out.println(c1.Contenu());
		System.out.println(c1.Capacite());
		System.out.println(c2.Contenu());
		System.out.println(c2.Capacite());
		
		c2.Transvaser(c1);

		System.out.println("Non-static Transvaser");
		System.out.println(c1.Contenu());
		System.out.println(c1.Capacite());
		System.out.println(c2.Contenu());
		System.out.println(c2.Capacite());
		
	}
	
	
}
