package TD6;

public class Test {

	public static void main(String[] args) {
		Chat c = new Chat("Persan");
		System.out.println(c.domestique);
		c.domestiquer("Chien"); /** Un chat qui s'appelle chien.. Pourquoi pas? */
		System.out.println(c.domestique);
		System.out.println(c.nom());

}
	
}
