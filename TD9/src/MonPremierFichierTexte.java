import java.io.*;
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

        BufferedReader reader = new BufferedReader(new FileReader("Nom.txt"));
        boolean x = checkList(al, reader);
        reader.close();
        System.out.println(x);


    }
    public static void writinglist(ArrayList<String> al, BufferedWriter writer) throws IOException {
        for (String str : al) {
            writer.write(str);
            writer.newLine();
            }
     }

     public static boolean checkList(ArrayList<String> al, BufferedReader reader) throws IOException {
        // for each line in the file, check if it is in the list

         for (String line = reader.readLine(); line != null; line = reader.readLine()) {
            if (al.contains(line)) {
                continue;
            }
            else {
                return false;
            }

         }
         return true;


         }


}


