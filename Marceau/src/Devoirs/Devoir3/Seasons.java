package Devoirs.Devoir3;
import java.util.Arrays;
import java.util.List;

/**
 * Enumération des saisons de l'année.
 * Permet de définir les saisons de l'année et de les manipuler.
 * Par exemple, on peut passer à la saison suivante ou précédente.
 * Mais on a surtour une valeur pré-définie pour chaque saison, permettant de
 * les comparer entre elles, et effectuer des actions selon la saison.
 * @author Marceau
 * @see Vegetal
 * @see VegetalI
 * @see Arbre
 * @see Peuplier
 */
public enum Seasons {
    /**
     * La liste des saisons de l'année
     */
    PRINTEMPS("Printemps"),
    ETE("Eté"),
    AUTOMNE("Automne"),
    HIVER("Hiver");

    private String season;

    /**
     * Constructeur de la classe Seasons
     * @param season Nom de la saison
     */
    Seasons(String season) {
        this.season = season;
    }

    /**
     * Méthode pour obtenir la saison actuelle
     * @return La saison actuelle
     */
    public String getSeason() {
        return season;
    }

    /**
     * Méthode pour obtenir la n-ième saison suivante
     * @param n Nombre de saisons à changer
     * @return La n-ième saison suivante
     */
    public Seasons suivante(int n) {
        List<Seasons> seasons = Arrays.asList(PRINTEMPS, ETE, AUTOMNE, HIVER);
        int index = seasons.indexOf(this);
        return seasons.get((index + n) % seasons.size());
    }

    /**
     * Méthode pour obtenir la saison suivante
     * @return La saison suivante
     */
    public Seasons suivante() {
        return this.suivante(1);
    }

    /**
     * Méthode pour obtenir n-ième la saison précédente
     * @param n Nombre de saisons à changer
     * @return La n-ième saison précédente
     */
    public Seasons precedente(int n) {
        return this.suivante(-n);
    }

    /**
     * Méthode pour obtenir la saison précédente
     * @return La saison précédente
     */
    public Seasons precedente() {
        return this.suivante(-1);
    }
}
