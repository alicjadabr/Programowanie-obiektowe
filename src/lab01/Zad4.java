public class Zad4 {
    public static void main(String[] args){
        int x = 1000;
        double r1 = x + 0.06 * 1000;
        double r2 = r1 + 0.06 * r1;
        double r3 = r2 + 0.06 * r2;
        System.out.println("Saldo po 1 roku wynosi: " + r1);
        System.out.println("Saldo po 2 roku wynosi: " + r2);
        System.out.println("Saldo po 3 roku wynosi: " + r3);
    }
}
