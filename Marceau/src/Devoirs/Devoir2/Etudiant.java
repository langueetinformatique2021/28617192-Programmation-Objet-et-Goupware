package Devoirs.Devoir2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Classe Etudiant
 *
 * Classe définissant un étudiant
 * Un étudiant est caractérisé par les informations suivantes :
 * <ul>
 *     <li>Un nom</li>
 *     <li>Un prénom</li>
 *     <li>Un identifiant unique (UUID)</li>
 *     <li>Un identifiant d'étudiant issu de l'identifiant unique</li>
 * </ul>
 * Et optionnellement :
 * <ul>
 *     <li>Un code postal</li>
 *     <li>Une date de naissance</li>
 *     <li>Un sexe</li>
 *     <li>Un mail</li>
 * </ul>
 *
 * @attribute nom nom de l'étudiant
 * @attribute prenom prénom de l'étudiant
 * @attribute UUID identifiant unique de l'étudiant
 * @attribute idEtudiant identifiant de l'étudiant
 * @attribute [codePostal] code postal de l'étudiant
 * @attribute [dateNaissance] date de naissance de l'étudiant
 * @attribute [sexe] sexe de l'étudiant
 * @attribute [mail] mail de l'étudiant
 *
 *
 * @author Marceau
 * @version 1.0
 * @since 2022-11-02
 * @see Promotion
 */
public class Etudiant {
    private final String nom;
    private final String prenom;
    private final String IDEtudiant;
    private final UUID uuid;


    private int codePostal;
    private String email;
    private Date dateNaissance;
    private String sexe;

    /**
     * Liste des cours suivis par l'étudiant, vide à l'instantiation
     */
    private final List <String> cours = new ArrayList<String>();

    /**
     * Méthode privée permettant de s'assurer que les noms et prénoms ont leur première lettre en majuscule
     * et toutes les autres en minuscule
     * @param chaine
     * @return chaine avec la première lettre en majuscule et les autres en minuscule
     */
    private String capitale(String chaine) {
        return chaine.substring(0, 1).toUpperCase() + chaine.substring(1).toLowerCase();
    }

    /**
     * Constructeur de la classe Etudiant il prend le nom, le prénom, le code postal, la date de naissance, le sexe
     * et le mail
     * l'identifiant unique est généré automatiquement
     * l'identifiant d'étudiant est généré automatiquement
     * @param nom nom de l'étudiant
     * @param prenom prénom de l'étudiant
     * @param codePostal code postal de l'étudiant
     * @param email mail de l'étudiant
     * @param dateNaissance date de naissance de l'étudiant
     * @param sexe sexe de l'étudiant ( M ou F )
     * @see Etudiant#Etudiant(String, String)
     */
    public Etudiant(String prenom, String nom, int codePostal, String email, Date dateNaissance, String sexe) {
        if (sexe.equals("M") || sexe.equals("F")) {
            this.nom = capitale(nom);
            this.prenom = capitale(prenom);
            this.codePostal = codePostal;
            this.email = email;
            this.dateNaissance = dateNaissance;
            this.sexe = sexe;
            this.uuid = UUID.randomUUID();
            this.IDEtudiant = this.uuid.toString().substring(24);
        } else {
            throw new IllegalArgumentException("Le sexe doit être M ou F");
        }
    }

    /**
     * Constructeur minimal de la classe Etudiant ne prend que le nom et le prénon
     * l'identifiant unique est généré automatiquement
     * l'identifiant d'étudiant est généré automatiquement
     * @param prenom prénom de l'étudiant
     * @param nom nom de l'étudiant
     * @see Etudiant#Etudiant(String, String, int, String, Date, String)
     */
    public Etudiant(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
        this.uuid = UUID.randomUUID();
        this.IDEtudiant = this.uuid.toString().substring(24);
    }

    /**
     * Méthode pour attribuer un code postal à l'étudiant
     * @param codePostal code postal a attribuer
     */
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * Méthode pour attribuer un mail à l'étudiant
     * @param email mail a attribuer
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Méthode pour attribuer une date de naissance à l'étudiant
     * @param dateNaissance date de naissance a attribuer
     */
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * Méthode pour attribuer un sexe à l'étudiant
     * @param sexe sexe a attribuer
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * Mérhode pour retourner le nom complet de l'étudiant sous la forme "NOM Prénom"
     * @return nom complet de l'étudiant
     */
    public String nomComplet() {
        return this.nom.toUpperCase() + " " + this.prenom;
    }

    /**
     * Méthode affichant les informations de l'étudiant
     * Vu que certains attributs sont optionnels, on vérifie si ils sont ne sont pas "null" avant de les afficher
     */
    public void afficher() {
        System.out.println("Nom complet: " + this.nomComplet());

        System.out.println("Identifiant étudiant: " + this.IDEtudiant);

        if (this.codePostal != 0) System.out.println("Code postal: " + this.codePostal);

        if (this.email != null) System.out.println("Email: " + this.email);

        if (this.dateNaissance != null) {
            Date date = new Date();

            int age = (date.getYear() + 1900) - this.dateNaissance.getYear();

            if (date.getMonth() < this.dateNaissance.getMonth()) age--;

            else if (date.getMonth() == this.dateNaissance.getMonth()
                    && date.getDate() < this.dateNaissance.getDate()) age-- ;

            System.out.println("Age: " + age);
        }

        if (this.sexe != null) System.out.println("Sexe: " + this.sexe);

        System.out.println("");
    }

    /**
     * Méthode pour obtenir l'identifiant unique de l'étudiant (UUID)
     * @return UUID de l'étudiant
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Méthode pour obtenir l'identifiant d'étudiant
     * @return identifiant d'étudiant
     */
    public String getIDEtudiant() {
        return IDEtudiant;
    }

    /**
     * Méthode pour ajouter un cours à l'étudiant
     * si le cours est déjà présent dans la liste, on ne l'ajoute pas
     * @param cours cours à ajouter
     */
    public void etudieCours(String cours) {
        if (!this.cours.contains(cours)) {
            this.cours.add(cours);
        }
    }

    /**
     * Méthode pour ajouter plusieurs cours à l'étudiant
     * si l'un des cours est déjà présent dans la liste, on ne l'ajoute pas
     * @param cours... cours à ajouter
     */
    public void etudieCours(String ... cours) {
        for (String cours1 : cours) {
            if (!this.cours.contains(cours)) this.cours.add(cours1);
        }
    }

    /**
     * Méthode pour afficher la liste des cours de l'étudiant
     */
    public void afficherCours(){
        System.out.println("Cours suivis par " + this.nomComplet() + ":");
        if (this.cours.size() == 0) {
            System.out.println("Pas de cours");
            return;
        }
        for (String cours : this.cours) {
            System.out.println(cours);
        }
        System.out.println("");
    }

    /**
     * Méthode pour savoir si l'étudiant suit un cours
     * @param cours cours à vérifier
     * @return true si l'étudiant suit le cours, false sinon
     */
    public boolean afficherCours(String cours) {
        return this.cours.contains(cours);
    }

    /**
     * Méthode pour comparer les cours suivis par deux étudiants
     * @param etudiant étudiant à comparer
     * @return les cours communs aux deux étudiants
     */
    private List comparerCours(Etudiant etudiant) {
        List<String> coursCommuns = new ArrayList<String>();
        for (String cours : this.cours) {
            if (etudiant.afficherCours(cours)) {
                coursCommuns.add(cours);
            }
        }
        return coursCommuns;
    }

    /**
     * Méthode afficher les cours communs à deux étudiants
     * @param etudiant étudiant à comparer
     */
    public void afficherCoursCommuns(Etudiant etudiant) {
        System.out.println("Cours communs entre " + this.nomComplet() + " et " + etudiant.nomComplet()+ ":");
        List<String> coursCommuns = this.comparerCours(etudiant);
        for (String cours : coursCommuns) {
            System.out.println(cours);
        }
        System.out.println("");
    }

    /**
     * Méthode pour savoir si deux étudiants suivent les mêmes cours
     * @param etudiant étudiant à comparer
     * @return true si les deux étudiants suivent les mêmes cours, false sinon
     */
    public boolean coursIdentiques(Etudiant etudiant) {
        if (this.cours.size() == etudiant.cours.size()) {
            if (this.comparerCours(etudiant).size() == this.cours.size()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Méthode pour retirer un cours de la liste des cours de l'étudiant
     * @param cours cours à retirer
     * @return true si le cours a été retiré, false sinon
     */
    public boolean suppCours(String cours) {
        if (this.cours.contains(cours)) {
            this.cours.remove(cours);
            return true;
        }
        return false;
    }

}
