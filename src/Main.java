public class Main {
    public static void main(String[] args) {

        NumereComplexe c1 = new NumereComplexe(3, 5);
        System.out.println(c1);
        NumereComplexe c2 = new NumereComplexe(5, 7.32);
        System.out.println(c2);
        System.out.println(c1.adunare(c2));
        System.out.println(c1.scadere(c2));
        NumereComplexe c3 =c1.adunare(c2);
        System.out.println(c3.isReal());
    }
}
