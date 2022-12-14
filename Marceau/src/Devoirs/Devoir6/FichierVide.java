package Devoirs.Devoir6;

public class FichierVide extends Exception {
    public FichierVide(String nomFichier) {
        super("Fichier "+ nomFichier + " vide");
    }
}

