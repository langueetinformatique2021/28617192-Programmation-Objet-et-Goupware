import java.io.*;

public class Copie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Nom.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Nom2.txt"));
        String line = reader.readLine();
        while (line != null) {
            writer.write(line);
            writer.newLine();
            line = reader.readLine();
        }
        reader.close();
        writer.close();



    }
}