package TDs.TD9;

public class FichierVide extends Exception {
    public FichierVide(String nomFichier) {
        super("Fichier "+ nomFichier + " vide");
    }
}

