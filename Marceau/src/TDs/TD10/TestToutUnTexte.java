package TDs.TD10;

import java.io.FileNotFoundException;

public class TestToutUnTexte {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "Marceau/src/TDs/TD10/";
        String fileName = "adelaide.txt";


        LireToutUnTexte texte = new LireToutUnTexte(path + fileName);
        //texte.afficher();

        System.out.println(texte.chercher("le"));


        texte.chercherVoir("rothbanner", 10);

        System.out.println(texte.chercherER("parl\\w+?\\b"));

        System.out.println(texte.chercherVoirER("parl\\w+?\\b", 10));

    }
}
