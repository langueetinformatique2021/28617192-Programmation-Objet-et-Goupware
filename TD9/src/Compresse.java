import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class Compresse {
    public static void main(String[] args) throws IOException {
        File file = new File("Nom.txt");
        File file2 = new File("Nom2.zip");
        try {
            InputStream in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(file2);
            DeflaterOutputStream defOut = new DeflaterOutputStream(out);
            int content;
            while ((content = in.read()) != -1) {
                defOut.write(content);
            }
            defOut.close();
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}