package TDs.TD9;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

/**
 * Classe permettant de lire un fichier texte
 * Extend la classe FileInputStream
 * Permet de copier un fichier, de le compresser et de le décompresser
 * @author Marceau
 * @see FileInputStream
 */
public class FileInputStreamTP9 extends FileInputStream {
    // Attributs
    private final File file;

    /**
     * Constructeur de la classe FileInputStreamTP9
     * @param name Chemin du fichier
     * @throws FileNotFoundException Si le fichier n'existe pas
     */
    public FileInputStreamTP9(String name) throws FileNotFoundException {
        super(name);
        this.file = new File(name);
    }

    /**
     * Copie le file input stream dans un autre fichier
     *
     * @param f Le fichier de destination
     * @throws IOException Si une erreur d'entrée/sortie survient
     */
    public void copie(File f) throws IOException {
        FileOutputStream fos = new FileOutputStream(f);
        int c;
        while ((c = this.read()) != -1) {
            fos.write(c);
        }
        fos.close();
    }

    /**
     * Compresse le file input stream dans un fichier "zip"
     *
     * @param f Le fichier de destination
     * @throws IOException Si une erreur d'entrée/sortie survient
     * @see FileInputStreamTP9#decompresse(File)
     */
    public void compresse(File f) throws IOException {
        DeflaterOutputStream dos = new DeflaterOutputStream(new FileOutputStream(f));
        int c;
        while ((c = this.read()) != -1) {
            dos.write(c);
        }
        dos.close();
    }

    /**
     * Decompresse le file input stream dans un fichier
     *
     * @param f Le fichier de destination
     * @throws IOException Si une erreur d'entrée/sortie survient
     * @see FileInputStreamTP9#compresse(File)
     */
    public void decompresse(File f) throws IOException {
        InflaterOutputStream ios = new InflaterOutputStream(new FileOutputStream(f));
        int c;
        while ((c = this.read()) != -1) {
            ios.write(c);
        }
        ios.close();
    }

    /**
     * Liste les propriétés du fichier
     * @return Une liste de propriétés du fichier chaque propriété est une chaîne de caractères
     */
    public List<String> proprietes() {
            List<String> al = new ArrayList<>();
            al.add("Nom du fichier: " + this.file.getName());
            al.add("Chemin absolu: " + this.file.getAbsolutePath());
            al.add("Est-ce un fichier: " + this.file.isFile());
            al.add("Est-ce un répertoire: " + this.file.isDirectory());
            al.add("Est-ce un fichier caché: " + this.file.isHidden());
            al.add("Taille du fichier: " + this.file.length());
            al.add("Dernière modification: " + new Date(this.file.lastModified()));
            return al;
        }

    /**
     * Compare deux instances de cette classe en vérifiant que les deux input streams
     * ont le même contenu.
     * On peut utiliser cette méthode pour vérifier que la méthode copie() fonctionne
     * correctement.
     * On se fiche du fichier d'origine, on se contente de comparer les deux input streams.
     * @param fis le deuxième file input stream à comparer
     * @return true si les deux input streams ont le même contenu, false sinon
     * @throws IOException si une erreur d'entrée/sortie survient
     * @see FileInputStreamTP9#copie(File)
     */
    public boolean compareTo(FileInputStreamTP9 fis) throws IOException {
        if (this.hashCode() == fis.hashCode()) {
            return true;
        }
        int c1;

        while ((c1 = this.read()) != -1) {
                if (c1 != fis.read()) {
                    return false;
                }
            }
            return true;
        }

}
