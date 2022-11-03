/**
 * Classe Peuplier
 * Classe représentant un peuplier
 * @author Marceau
 * @see Vegetal
 * @see VegetalI
 * @see Arbre
 */
public class Peuplier extends Arbre {

    /**
     * Constructeur de la classe Peuplier
     * @param name Nom du peuplier
     * @param season Saison de départ
     */
    public Peuplier(String name, Seasons season) {
        super(name, "Peuplier", season,
                "Les peupliers sont des arbres du genre Populus de la famille des Salicacées.");
        this.selonSaison();
    }

    /**
     * Constructeur de la classe Peuplier
     * La saison de départ est le printemps
     * @param name Nom du peuplier
     */
    public Peuplier(String name) {
        this(name, Seasons.PRINTEMPS);
    }

    /** Méthode protéhée permettant d'agir selon la saison
     * @see Seasons
     */
    protected void selonSaison() {
        switch (this.getSeason()) {
            case PRINTEMPS:
                this.setColor("Vert");
                break;
            case ETE:
                this.pousse(2);
                break;
            case AUTOMNE:
                this.setColor("Jaune");
                break;
            case HIVER:
                this.setColor("Rouge");
                break;
        }
    }
    /**
     * Méthode pour changer la saison de n
     * Des actions sont effectuées selon la saison
     * @param n Nombre de saisons à changer
     * @see Peuplier#selonSaison()
     */
    public void changeSeason(int n) {
        super.changeSeason(n);
        this.selonSaison();
    }

    /**
     * Méthode pour changer la saison de 1
     * Des actions sont effectuées selon la saison
     * @see Peuplier#selonSaison()
     * @see Peuplier#changeSeason(int)
     */
    public void changeSeason() {
        super.changeSeason();
        this.selonSaison();
    }

    /**
     * Méthode retournant l'etat de floraison du peuplier
     * @return true si le peuplier est en fleur, false sinon
     */
    protected boolean isFleuri() {
        return this.getSeason() == Seasons.ETE;
    }

    /**
     * Méthode pour a
     * @return
     */
    public String fleurit() {
        return this.isFleuri() ? "Je fleuris" : "Je ne fleuris pas";
    }

    public String afficher() {
        return super.afficher() + this.fleurit() + "\n";
    }

    protected boolean feuillesTombent() {
        return this.getSeason() == Seasons.AUTOMNE;
    }

    public String tombeFeuilles() {
        return this.feuillesTombent() ? "Mes feuilles tombent" : "Mes feuilles ne tombent pas";
    }



}
