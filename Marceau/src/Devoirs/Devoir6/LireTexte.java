package Devoirs.Devoir6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
/** Lecture des mots d'un fichier-texte
 * @author montacie
 */
    public class LireTexte {
        private BufferedReader entree;
        private String nomFichier;
        private String ligne;
        private StringTokenizer tok;


        /** Création d'une nouvelle instance de LireTexte
         * @param ft nom du fichier texte
         *           (chemin relatif ou absolu)
         */
        public LireTexte(String ft) throws FichierVide, IOException {
            try {
                entree = new BufferedReader(new FileReader(ft));
                nomFichier = ft.split("/")[ft.split("/").length - 1];
            } catch (FileNotFoundException e) {
                System.out.println("Fichier " + ft + " non trouvé");
                System.exit(42);
            }
            this.Ouvrir();
            tok = new StringTokenizer(ligne);

        }
        /** Ouverture d'un fichier texte,
         * Lecture de la première ligne,
         * Teste si le fichier est vide
         * @throws IOException Erreur à l'ouverture
         * @throws FichierVide Fichier vide
         */
        protected void Ouvrir() throws IOException, FichierVide {
            ligne = entree.readLine();
            if (ligne == null) {
                throw new FichierVide(nomFichier);
            }
        }
        /** Fermeture du fichier
         * @throws IOException Erreur à la fermeture
         */
        protected void Fermer() throws IOException
        {
            entree.close();
        }
        /** Lecture mot à mot du fichier
         * @return prochain mot
         * @throws IOException Erreur de lecture
         */
        public String readWord() throws IOException {
            if (tok.hasMoreTokens()) {
                            return tok.nextToken();
            } else {
                ligne = entree.readLine();
                if (ligne == null) {
                    return null;
                } else {
                    tok = new StringTokenizer(ligne);
                    return tok.nextToken();
                }
            }

        }
}