public abstract class FigureGeometrique implements Comparable {
    protected String couleur = "noir";

    /** création d'une nouvelle instance de la classe FigureGeometrique
     * @param co couleur de la figure
     */
    public FigureGeometrique (String co) {
        couleur = co; // couleur par défaut
    }

    /** calcul du périmètre d'une figure géométrique
     * @return périmètre
     */
    public abstract float perimetre();

    /** calcul de la surface d'une figure géométrique
     * @return surface
     */
    public abstract float surface();
}
