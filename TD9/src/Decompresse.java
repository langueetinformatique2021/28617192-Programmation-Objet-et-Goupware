import java.io.*;
import java.util.zip.InflaterOutputStream;


public class Decompresse {
    public static void main(String[] args) throws IOException {
        File file = new File("Nom2.zip");
        File file2 = new File("Nomdezip.txt");
        try {
            InputStream in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(file2);
            InflaterOutputStream infOut = new InflaterOutputStream(out);
            int content;
            while ((content = in.read()) != -1) {
                infOut.write(content);
            }
            infOut.close();
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}