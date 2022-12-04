import java.util.Date;

/**
 * Classe de test
 * Au moment de l'execution, il faut ajouter un argument
 * selon le test à effectuer (etudiant, promotion ou les deux)
 *
 * @author Marceau
 * @version 1.0
 * @since 2022-11-02
 * @see Promotion
 * @see Etudiant
 */
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equals("etudiant")) {
                testEtudiant();
                return;
            } else if (args[0].equals("promotion")) {
                testPromotion();
                return;
            } else if (args[0].equals("both")) {
                testEtudiant();
                testPromotion();
                return;

            }
        }
        System.out.println("Permet de tester l'une des deux classes\nUsage: java Main [etudiant|promotion|both]");
        System.exit(42);
    }

    public static void testEtudiant() {
        System.out.println("\n\n--------------- Test de la classe Etudiant ---------------\n");
        Date date1 = new Date(1999, 6, 19);
        Date date2 = new Date(2002, 12, 1);
        Date date3 = new Date(2000, 1, 1);

        Etudiant etudiant1 = new Etudiant("Jean", "Dupont",
                94110, "jdupont@mail.com", date1, "M");
        Etudiant etudiant2 = new Etudiant("Marie", "Durand",
                92220, "mdurand@mail.fr", date2, "F");
        Etudiant etudiant3 = new Etudiant("Pierre", "Truc");



        System.out.println("afficher() des étudiants 1, 2 et 3");
        etudiant1.afficher();
        etudiant2.afficher();
        etudiant3.afficher();

        System.out.println("ajouter propriétés à l'étudiant 3 puis l'afficher");
        etudiant3.setCodePostal(75000);
        etudiant3.setEmail("tpierre@gmail.com");
        etudiant3.setDateNaissance(date3);
        etudiant3.setSexe("M");
        etudiant3.afficher();

        // On rentre les cours de l'étudiant 1
        etudiant1.etudieCours("Java");
        etudiant1.etudieCours("Python");
        etudiant1.etudieCours("Maths");

        etudiant2.etudieCours("Java", "Python", "Maths");

        etudiant3.etudieCours("Java");

        System.out.println("afficherCours() de l'étudiant 1");
        etudiant1.afficherCours();

        System.out.println("afficherCours() de l'étudiant 2");
        etudiant2.afficherCours();

        System.out.println("afficherCours() de l'étudiant 3");
        etudiant3.afficherCours();

        System.out.println("afficherCours(\"Python\") de l'étudiant 1 et 3");
        System.out.println(etudiant1.afficherCours("Python"));
        System.out.println(etudiant3.afficherCours("Python") + "\n");

        etudiant1.afficherCoursCommuns(etudiant2);

        System.out.println("coursIdentiques() des étudiants 1 et 2, puis 1 et 3");
        System.out.println(etudiant1.coursIdentiques(etudiant2));
        System.out.println(etudiant1.coursIdentiques(etudiant3));

        System.out.println("\nLe cours 'Maths' a été supprimé de 'etudiant1': " + etudiant1.suppCours("Maths"));
        System.out.println("afficherCours() de l'étudiant 1");
        etudiant1.afficherCours();


    }

    public static void testPromotion() {
        System.out.println("\n\n--------------- Test de la classe Promotion ---------------\n");
        Date date1 = new Date(1999, 6, 19);
        Date date2 = new Date(2002, 12, 1);
        Date date3 = new Date(2000, 1, 1);

        Etudiant etudiant1 = new Etudiant("Jean", "Dupont",
                94110, "jdupont@mail.com", date1, "M");
        Etudiant etudiant2 = new Etudiant("Marie", "Durand",
                92220, "mdurand@mail.fr", date2, "F");
        Etudiant etudiant3 = new Etudiant("Pierre", "Truc");


        Promotion promo = new Promotion("M1SDL", 2022);
        promo.ajouterEtudiant(etudiant1);
        promo.ajouterEtudiant(etudiant2);
        promo.ajouterEtudiant(etudiant3);

        promo.afficherEtudiants();
        promo.afficherCoursTroncCommun();

        etudiant1.afficherCours();

        promo.ajouterCours("Java", "Python", "Maths", "C++");

        etudiant1.afficherCours();

        promo.afficherCoursTroncCommun();

        Promotion promo2 = new Promotion("M1SDL", 2023);
        promo2.ajouterEtudiant(etudiant1);
        promo2.ajouterCours("Java", "Rust", "Ruby", "TypeScript", "Neo4j");

        promo.afficherCoursCommuns(promo2);
        promo.afficherEtudiantsCommuns(promo2);

        System.out.println(etudiant1.nomComplet());
        etudiant1.afficherCours();

        System.out.println("Premier etudiant de la promotion 'promo': " + promo.getEtudiants().get(0).nomComplet());

        System.out.println("\npromo.getEtudiants(etudiant1) " + promo.getEtudiants(etudiant1));
        System.out.println("promo.getEtudiants(etudiant1..3) " + promo.getEtudiants(etudiant1, etudiant2, etudiant3));
        System.out.println("promo2.getEtudiants(etudiant1) " + promo2.getEtudiants(etudiant3));
        System.out.println("promo2.getEtudiants(etudiant1..3) " + promo2.getEtudiants(etudiant1, etudiant2, etudiant3));


    }

}
