import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zad_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swoj kapital(k): ");
        float k = in.nextFloat();
        System.out.println("Podaj stope procentowa(p): ");
        float p = in.nextFloat();
        System.out.println("Ile lat planujesz oszczedzac(n): ");
        float n = in.nextFloat();
        System.out.println("Po " + n + "latach" + "zarobiono " + kasa(k, p, n));

    }
    public static BigDecimal kasa(float k, float p, float n) {
        BigDecimal sav = BigDecimal.valueOf(k);
        sav = sav.multiply(BigDecimal.valueOf(Math.pow(p+1, n)));
        return sav;
    }
}