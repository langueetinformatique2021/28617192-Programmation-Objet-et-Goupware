package TDs.TD10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.max;

public class LireToutUnTexte extends BufferedReader {
    private final List<String> lignes;
    private final int nbLignes;
    private final String texte;
    public LireToutUnTexte(String path) throws FileNotFoundException {
        super(new FileReader(path));
        String ligne;
        this.lignes = new ArrayList<>();

        try {
            while ((ligne = this.readLine()) != null) {
                lignes.add(ligne);
            }
            this.close();
        } catch (IOException e) {
            System.out.println("Erreur d'ouverture du fichier");
        }
        nbLignes = lignes.size();
        this.texte = lignes.toString().toLowerCase();
    }

    public void afficher() {
        for (int i = 0; i < nbLignes; i++) {
            System.out.println(lignes.get(i));
        }
    }

    public int getNbLignes() {
        return nbLignes;
    }

    public String getLigne(int i) {
        return lignes.get(i);
    }

    public List<String> getLignes() {
        return lignes;
    }

    public int chercher(String mot) {
        mot = mot.toLowerCase();
        return texte.split(mot).length - 1;
    }

    public int chercher(String mot, int ignoredMode) {
        int nbOccurences = 0;
        int j;
        String ligne;
        mot = mot.toLowerCase();

        for (int i = 0; i < nbLignes; i++) {
            if (lignes.get(i).contains(mot)) {
                ligne = lignes.get(i).toLowerCase();
                j = ligne.split(mot).length - 1;
                nbOccurences += j;
                System.out.println("Nombre d'occurences de " + mot + " dans la ligne " + i + " : " + j);
            }
        }
        return nbOccurences;
    }

    /**
     * Affichage du contexte des occurences de s dans sTexte
     *
     * @param chaine      chaîne cherchée
     * @param Contexte_mots taille du contexte
     */
    public static String chercherVoir(String texte, String chaine, int Contexte_mots) {

        String contexte;
        if(texte.contains(chaine)) {


            int index_start = max(texte.indexOf(chaine) - (Contexte_mots), 0) ;
            int index_end = texte.indexOf(chaine) + (Contexte_mots + chaine.length());

            contexte = texte.substring(index_start,index_end);
        }
        else {

            contexte = null;
            System.out.println("la chaine cherchée n'est pas dans le texte");
        }

        return contexte;
    }


    public List<String> chercherVoir(String chaine, int Contexte_mots) {
        chaine = chaine.toLowerCase();
        int occurences = chercher(chaine);
        List<String> contextes = new ArrayList<>();

        String contexte;
        if(occurences > 0) {
            int i = 0;
            int index_end = 0;
            while (i < occurences) {
                int index_start = max(texte.indexOf(chaine, index_end) - (Contexte_mots), 0) ;
                index_end = texte.indexOf(chaine, index_end) + (Contexte_mots + chaine.length());

                contexte = texte.substring(index_start,index_end);
                System.out.println(contexte);
                contextes.add(contexte);
                i++;
            }
        }
        else {
            System.out.println("la chaine cherchée n'est pas dans le texte");
        }
        return contextes;
    }


    public int chercherER(String regex) {
        List<String> allMatches = new ArrayList<>();
        Matcher m = Pattern.compile(regex).matcher(texte);
        while (m.find()) {
            allMatches.add(m.group());
        }
        return allMatches.size();
    }

    public List<String> chercherVoirER(String regex, int Contexte_mots) {
        List<String> allMatches = new ArrayList<>();
        Matcher m = Pattern.compile(regex).matcher(texte);
        while (m.find()) {
            allMatches.add(m.group());
        }
        return allMatches;
    }

}
