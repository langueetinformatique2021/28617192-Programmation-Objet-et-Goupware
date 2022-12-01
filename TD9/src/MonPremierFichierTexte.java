import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;

public class MonPremierFichierTexte {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al = new ArrayList<String>();
        al.add("28617192");
        al.add("28617193");
        al.add("28617194");
        al.add("28617195");


        BufferedWriter writer = new BufferedWriter(new FileWriter("Nom.txt"));
        writinglist(al, writer);

        writer.close();
    }
    public static void writinglist(ArrayList<String> al, BufferedWriter writer) throws IOException {
        for (String str : al) {
            writer.write(str);
            }
     }
}


