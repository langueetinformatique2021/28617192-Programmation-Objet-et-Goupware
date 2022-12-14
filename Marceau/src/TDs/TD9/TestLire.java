package TDs.TD9;

import java.io.IOException;
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

                while ((mot = lire.readWord()) != null) {
                    System.out.println(mot);
                }

                System.out.println("Fin du fichier");

            } catch (FichierVide e) {
                System.out.println("Fichier vide");
            } catch (IOException e) {
                System.out.println("Erreur d'entrée/sortie");
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

        } catch (FichierVide e) {
            System.out.println("Fichier vide");
        } catch (IOException e) {
            System.out.println("Erreur d'entrée/sortie");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
