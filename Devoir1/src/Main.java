public class Main {
    /**
     * @author Marceau
     * Calcule la médianne !
     */
    public static void main(String[] args) {
        int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
        int p6 = 0;

        // Trouve la medianne des 5 premiers nombres puis la stocke dans p6

        boolean answer = mediane(p1, p2, p3, p4, p5);
        if (answer) {
            p6 = p1;
        }
        else {
            answer = mediane(p2, p1, p3, p4, p5);
            if (answer) {
                p6 = p2;
            }
            else {
                answer = mediane(p3, p1, p2, p4, p5);
                if (answer) {
                    p6 = p3;
                }
                else {
                    answer = mediane(p4, p1, p2, p3, p5);
                    if (answer) {
                        p6 = p4;
                    }
                    else {
                        answer = mediane(p5, p1, p2, p3, p4);
                        if (answer) {
                            p6 = p5;
                        }
                    }
                }
            }
        }

        // Affiche le résultat, p6

        System.out.println(p6);
    }

    /**
     * Permet de trouver si le premier parametre est la mediane des 5 entiers donnés
     * @param p1  premier int
     * @param p2  deuxieme int
     * @param p3  troisieme int
     * @param p4  quatrieme int
     * @param p5  cinquieme int
     * @return true si p1 est la mediane des 5 entiers, false sinon
     * @author Marceau
     */

    private static boolean mediane(int p1, int p2, int p3, int p4, int p5) {
        int test = 0;
        if (p1 < p2) {
            test --;
        }
        else {
            test ++;
        }
        if (p1 < p3) {
            test --;
        }
        else {
            test ++;
        }
        if (p1 < p4) {
            test --;
        }
        else {
            test ++;
        }
        if (p1 < p5) {
            test --;
        }
        else {
            test ++;
        }
        return (test == 0);
    }

}