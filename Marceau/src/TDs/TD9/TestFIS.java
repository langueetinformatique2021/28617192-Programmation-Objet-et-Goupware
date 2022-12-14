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

            FileInputStreamTP9 FIS9 = new FileInputStreamTP9("Marceau/src/TDs/TD9/chap0.txt");


            FIS9.copie(new File("Marceau/src/TDs/TD9/chap0_copy.txt"));

            FIS9.compresse(new File("Marceau/src/TDs/TD9/chap0_copy.zip"));

            FileInputStreamTP9 FIS9_2 = new FileInputStreamTP9("Marceau/src/TDs/TD9/chap0_copy.zip");

            FIS9_2.decompresse(new File("Marceau/src/TDs/TD9/chap0_copy_unzipped.txt"));

            System.out.println(FIS9.proprietes());

            System.out.println(FIS9.compareTo(FIS9_2));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

}

