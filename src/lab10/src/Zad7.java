import java.util.Set;
import java.util.TreeSet;

public class Zad7 {
    public static void sitoEratostenesa(int n) {
        Set<Integer> primes = new TreeSet<>();
        for(int i=2; i<=n; i++) {
            primes.add(i);
        }
        for(int i=2; i<Math.sqrt(n); i++) {
            for(int j=2*i; j<=n; j+=i){
                primes.remove(j);
            }
        }
        System.out.println(primes.toString());
    }
}
