package TDs.TD9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Test de la classe FileInputStreamTP9
 * @author Marceau
 * @see FileInputStreamTP9
 */
public class TestFIS {

    public static void main(String[] args) throws IOException {
        try {
            String path = "Marceau/src/TDs/TD9/";

            FileInputStreamTP9 FIS9 = new FileInputStreamTP9(path + "chap0.txt");


            FIS9.copie(new File(path + "chap0_copy.txt"));

            FIS9 = new FileInputStreamTP9(path + "chap0.txt"); // On réinitialise le fichier car on a
            // consommé tout son contenu en le copiant
            FIS9.compresse(new File(path + "chap0_copy_zip.txt"));

            FileInputStreamTP9 FIS9_2 = new FileInputStreamTP9(path + "chap0_copy_zip.txt");

            FIS9_2.decompresse(new File(path + "chap0_copy_unzipped.txt"));

            FIS9_2 = new FileInputStreamTP9(path + "chap0_copy_zip.txt");

            System.out.println(FIS9.proprietes());

            System.out.println(FIS9.compareTo(FIS9_2));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

}

