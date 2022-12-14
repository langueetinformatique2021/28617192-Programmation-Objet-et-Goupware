package Devoirs.Devoir6;

import java.util.ArrayList;
import java.util.List;

/**
 * Test de la classe LireTexte
 * @author Marceau
 * @see LireTexte
 */
public class TestLire {
    public static void main(String[] args) {
        List<String> paths = new ArrayList<>();
        paths.add("Marceau/src/TDs/TD9/chap0.txt");
        paths.add("Marceau/src/TDs/TD9/vide.txt");

        while (!paths.isEmpty()) {
            String path = paths.remove(0);
            try {
                LireTexte lire = new LireTexte(path);

                String mot;
                int unsurvingt = 0; // On va éviter d'afficher tous les mots

                while ((mot = lire.readWord()) != null) {
                    if (unsurvingt == 0) {
                        System.out.println(mot);
                    }
                    unsurvingt = (unsurvingt + 1) % 20;
                }

                System.out.println("Fin du fichier");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n\n");


        try {
            String path = "Marceau/src/TDs/TD9/chap0.txt";
            LireTexte lire = new LireTexte(path);

            System.out.println(lire.readWord());

            lire.Fermer();


            // Cela devrait générer une exception car le fichier est fermé,
            // mais on ira jusqu'a la fin de la ligne car le premier mot a été lu
            String mot;
            while ((mot = lire.readWord()) != null) {
                System.out.println(mot);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
