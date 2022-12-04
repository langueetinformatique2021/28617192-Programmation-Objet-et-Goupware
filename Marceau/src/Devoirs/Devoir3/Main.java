package Devoirs.Devoir3;
/**
 * Tests
 */
public class Main {
    public static void main(String[] args) {
        Peuplier peuplier = new Peuplier("Paul le peuplier");
        Peuplier peuplier2 = new Peuplier("Paul le peuplier");
        System.out.println(peuplier.equivaut(peuplier2));

        System.out.println(peuplier.afficher());
        peuplier.changeSeason(2);
        System.out.println(peuplier.afficher());
        System.out.println(peuplier.tombeFeuilles());
        System.out.println(peuplier.fleurit());

        System.out.println(peuplier.equivaut(peuplier2));
        peuplier.changeSeason(2);
        System.out.println(peuplier.equivaut(peuplier2));
    }
}