import java.util.Arrays;
import java.util.List;

public enum Seasons {
    PRINTEMPS("Printemps"),
    ETE("Eté"),
    AUTOMNE("Automne"),
    HIVER("Hiver");

    private String season;

    Seasons(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public Seasons suivante(int n) {
        List<Seasons> seasons = Arrays.asList(PRINTEMPS, ETE, AUTOMNE, HIVER);
        int index = seasons.indexOf(this);
        return seasons.get((index + n) % seasons.size());
    }

    public Seasons suivante() {
        return this.suivante(1);
    }

    public Seasons precedente(int n) {
        return this.suivante(-n);
    }

    public Seasons precedente() {
        return this.suivante(-1);
    }
}
