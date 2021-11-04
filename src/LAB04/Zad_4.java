import java.math.BigInteger;
import java.util.Scanner;

public class Zad_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = in.nextInt();
        System.out.println("Na szachownicy polozymy " + ziarenka(n) + " ziarenek maku.");

    }
    public static BigInteger ziarenka(int n) {
        int[][] szach = new int[n][n];
        BigInteger sum = BigInteger.ZERO;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sum = sum.add(BigInteger.valueOf((long)Math.pow(2, n*i+j)));
            }
        }
        return sum;
    }
}
