public class Cercle extends FigureGeometrique implements Comparable {
    private float rayon;
    private float pi = 3.14f;

    public Cercle(float rayon, String couleur) {
        super(couleur);
        this.rayon = rayon;
    }


    public float perimetre() {
        return 2 * pi * rayon;
    }

    public float surface() {
        return pi * rayon * rayon;
    }

    public String toString() {
        return "Cercle de rayon " + rayon + " et de couleur " + couleur;
    }

    public static void main(String[] args) {
        Cercle c = new Cercle(5, "rouge");
        System.out.println(c);
    }

    private void checkType(Object o) throws IllegalArgumentException{
        if (o instanceof Cercle) return;
        throw new IllegalArgumentException("Le paramètre n'est pas un cercle");
    }

    public boolean estPlusGrandQue(Comparable c) throws IllegalArgumentException{
        checkType(c);
        Cercle c2 = (Cercle) c;
        return this.rayon > c2.rayon;
    }

    public boolean estPlusPetitQue(Comparable c) throws IllegalArgumentException{
        checkType(c);
        Cercle c2 = (Cercle) c;
        return this.rayon < c2.rayon;
    }

    public boolean estEgalA(Comparable c) throws IllegalArgumentException{
        checkType(c);
        Cercle c2 = (Cercle) c;
        return this.rayon == c2.rayon;
    }

    public boolean estDifferentDe(Comparable c) throws IllegalArgumentException{
        return !this.estEgalA(c);
    }

    public boolean estPlusGrandOuEgalA(Comparable c) throws IllegalArgumentException{
        return !this.estPlusPetitQue(c);
    }

    public boolean estPlusPetitOuEgalA(Comparable c) throws IllegalArgumentException {
        return !this.estPlusGrandQue(c);
    }

    public String compareTo(Comparable c) throws IllegalArgumentException {
        try {
            if (this.estPlusGrandQue(c)) return this.toString() + " plus grand que " + c.toString();
            if (this.estPlusPetitQue(c)) return this.toString() + " plus petit que " + c.toString();
            if (this.estEgalA(c)) return this.toString() + " égal à " + c.toString();
        } catch (IllegalArgumentException e) {
            return "incomparable";
        }
        return null;
    }

}
