import java.io.*;

public class Copie {
    public static void main(String[] args) throws IOException {
        File file = new File("Nom.txt");
        File file2 = new File("Nom2.txt");
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(file));
            OutputStream out = new BufferedOutputStream(new FileOutputStream(file2));
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}