package Devoirs.Devoir2;
import java.util.ArrayList;
import java.util.List;
/**
 * Classe Promotion
 *
 * Classe définissant une promotion (d'etudiants)
 * Une promotion est caractérisée par les informations suivantes :
 * <ul>
 *     <li>Un nom</li>
 *     <li>Une liste d'étudiants</li>
 *     <li>Un nombre d'étudiants</li>
 *     <li>Un nombre de cours</li>
 *     <li>Une liste de cours (tronc commun)</li>
 * </ul>
 *
 * @author Marceau
 * @version 1.0
 * @since 2022-11-02
 * @see Etudiant
 * @attribute nomPromotion nom de la promotion défini à l'instantiation
 * @attribute listeEtudiants liste des étudiants de la promotion (vide à l'instantiation)
 * @attribute nbEtudiants nombre d'étudiants de la promotion (0 à l'instantiation)
 * @attribute annee année de la promotion définie à l'instantiation
 * @attribute troncCommun liste des cours du tronc commun (vide à l'instantiation)
 */
public class Promotion {
    private List<Etudiant> etudiants = new ArrayList<Etudiant>();
    private String nomPromotion;
    private int annee;
    private int nbEtudiants;
    private List<String> troncCommun = new ArrayList<String>();

    /**
     * Constructeur de la classe Promotion, il ne prend que le nom de la promotion et l'année
     * le nombre d'étudiants est initialisé à 0
     * @param nomPromotion le nom de la promotion
     * @param annee année de la promotion
     */
    public Promotion(String nomPromotion, int annee) {
        this.nomPromotion = nomPromotion;
        this.annee = annee;
        this.nbEtudiants = 0;
    }

    /**
     * Méthode permettant d'ajouter un étudiant à la promotion
     * les cours du tronc commun sont automatiquement ajoutés à l'étudiant
     * le nombre d'étudiants est incrémenté
     * @param etudiant à ajouter
     */
    public void ajouterEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
        this.nbEtudiants++;
        for (String cours : this.troncCommun) {
            if (!etudiant.afficherCours(cours)) {
                etudiant.etudieCours(cours);
            }
        }
    }

    /**
     * Méthode pour ajouter plusieurs étudiants à la promotion
     * les cours du tronc commun sont automatiquement ajoutés à l'étudiant
     * le nombre d'étudiants est incrémenté pour chaque étudiant ajouté
     * @param etudiants liste d'étudiants à ajouter
     */
    public void ajouterEtudiant(Etudiant ... etudiants) {
        for (Etudiant etudiant : etudiants) {
            this.etudiants.add(etudiant);
            this.nbEtudiants++;
            for (String cours : this.troncCommun) {
                if (!etudiant.afficherCours(cours)) {
                    etudiant.etudieCours(cours);
                }
            }
        }
    }

    /**
     * Méthode pour ajouter un cours au tronc commun
     * le cours est ajouté à chaque étudiant de la promotion
     * @param cours le cours à ajouter
     */
    public void ajouterCours(String cours) {
        this.troncCommun.add(cours);
        for (Etudiant etudiant : this.etudiants) {
                etudiant.etudieCours(cours);

        }
    }

    /**
     * Méthode pour ajouter plusieurs cours au tronc commun
     * les cours est ajouté à chaque étudiant de la promotion
     * @param cours... cours à ajouter
     */
    public void ajouterCours(String ... cours) {
        for (String cours_ : cours) {
            this.troncCommun.add(cours_);
            for (Etudiant etudiant : this.etudiants) {
                    etudiant.etudieCours(cours_);

            }
        }
    }

    /**
     * Méthode pour afficher les cours du tronc commun
     */
    public void afficherCoursTroncCommun() {
        System.out.println("Cours du tronc commun de la promotion " + this.nomPromotion + ":");
        for (String cours : this.troncCommun) {
            System.out.println(cours);
        }
        System.out.println("");
    }

    /**
     * Méthode pour afficher les étudiants de la promotion
     */
    public void afficherEtudiants() {
        System.out.println("Etudiants de la promotion " + this.nomPromotion + ":");
        for (Etudiant etudiant : this.etudiants) {
            System.out.println(etudiant.nomComplet());
        }
        System.out.println("");
    }

    /**
     * Methode qui compare les cours de deux promotions
     * @param promotion la promotion à comparer
     * @return la liste des cours communs
     */
    private List<String> comparerCoursTroncCommun(Promotion promotion) {
        List<String> coursCommuns = new ArrayList<String>();
        for (String cours : this.troncCommun) {
            if (promotion.troncCommun.contains(cours)) {
                coursCommuns.add(cours);
            }
        }
        return coursCommuns;
    }

    /**
     * Méthode pour afficher les cours communs entre deux promotions
     * @param promotion la promotion à comparer
     */
    public void afficherCoursCommuns(Promotion promotion) {
        if (this.nomPromotion.equals(promotion.nomPromotion)) {
            System.out.println("Cours communs entre la promotion " + this.nomPromotion + " de l'année " + this.annee
                    + " et celle de l'année " + promotion.annee + ":");
        } else {
            System.out.println("Cours communs entre la promotion " + this.nomPromotion + " et la promotion "
                    + promotion.nomPromotion + ":");
        }

        List<String> coursCommuns = this.comparerCoursTroncCommun(promotion);
        for (String cours : coursCommuns) {
            System.out.println(cours);
        }
        System.out.println("");
    }

    /**
     * Méthode pour retourner si deux promotions ont les mêmes cours dans leur tronc commun
     * @param promotion la promotion à comparer
     * @return true si les promotions ont les mêmes cours dans leur tronc commun
     */
    public boolean coursIdentiques(Promotion promotion) {
        List<String> coursCommuns = this.comparerCoursTroncCommun(promotion);
        if (coursCommuns.size() == this.troncCommun.size()
                && coursCommuns.size() == promotion.troncCommun.size()) {
            return true;
        }
        return false;
    }

    /**
     * Méthode pour afficher les etudiants communs entre deux promotions
     * @param promotion la promotion à comparer
     */
    public void afficherEtudiantsCommuns(Promotion promotion) {
        if (this.nomPromotion.equals(promotion.nomPromotion)) {
            System.out.println("Etudiants communs entre la promotion " + this.nomPromotion + " de l'année " + this.annee
                    + " et celle de l'année " + promotion.annee + ":");
        } else {
            System.out.println("Etudiants communs entre la promotion " + this.nomPromotion + " et la promotion "
                    + promotion.nomPromotion + ":");
        }
        for (Etudiant etudiant : this.etudiants) {
            if (promotion.etudiants.contains(etudiant)) {
                System.out.println(etudiant.nomComplet());
            }
        }
        System.out.println("");
    }

    /**
     * Méthode pour afficher les etudiants (attribut privé de la promotion)
     * @return la liste des etudiants
     */
    public List<Etudiant> getEtudiants() {
        return this.etudiants;
    }

    /**
     * Méthode qui retourne si les étudiants passés en paramètre sont dans la promotion
     * @param etudiant... les étudiants à tester
     * @return true si les étudiants sont dans la promotion
     */
    public boolean getEtudiants(Etudiant... etudiant) {
        for (Etudiant etudiant1 : etudiant) {
            if (!this.etudiants.contains(etudiant1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Méthode qui retourne si l'étudiant passé en paramètre est dans la promotion
     * @param etudiant l'étudiant à tester
     * @return true si l'étudiant est dans la promotion
     */
    public boolean getEtudiants(Etudiant etudiant) {
        return this.etudiants.contains(etudiant);
    }

}
