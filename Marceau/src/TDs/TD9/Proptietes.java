import java.io.File;
import java.util.Date;

public class Proptietes {
    public static void main(String[] args) {
        File file = new File("Nom.txt");
        System.out.println("Nom du fichier: " + file.getName());
        System.out.println("Chemin absolu: " + file.getAbsolutePath());
        System.out.println("Est-ce un fichier: " + file.isFile());
        System.out.println("Est-ce un répertoire: " + file.isDirectory());
        System.out.println("Est-ce un fichier caché: " + file.isHidden());
        System.out.println("Taille du fichier: " + file.length());
        System.out.println("Dernière modification: " + new Date(file.lastModified()));

    }
}
