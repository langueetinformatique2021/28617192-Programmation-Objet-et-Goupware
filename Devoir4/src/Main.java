public class Main {
    public static void main(String[] args)
    {
        Cercle c1 = new Cercle(5, "rouge");
        Cercle c2 = new Cercle(10, "bleu");
        System.out.println("c1.estPlusGrandQue(c2) : " + c1.estPlusGrandQue(c2));
        System.out.println("c1.estPlusPetitQue(c2) : " + c1.estPlusPetitQue(c2));
        System.out.println();
        System.out.println("c1.estEgalA(c2) : " + c1.estEgalA(c2));
        System.out.println("c1.estDifferentDe(c2) : " + c1.estDifferentDe(c2));
        System.out.println();
        System.out.println("c1.estPlusGrandOuEgalA(c2) : " + c1.estPlusGrandOuEgalA(c2));
        System.out.println("c1.estPlusPetitOuEgalA(c2) : " + c1.estPlusPetitOuEgalA(c2));
        System.out.println();
        System.out.println("c1.compareTo(c2) : " + c1.compareTo(c2));
    }
}