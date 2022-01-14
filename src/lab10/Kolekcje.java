import java.util.*;

public class Kolekcje {
    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<>();
        LinkedList<Integer> nums = new LinkedList<>();
        pracownicy.add("Stark");
        pracownicy.add("Polanska");
        pracownicy.add("Allen");
        pracownicy.add("Gosling");
        pracownicy.add("Hanks");
        pracownicy.add("Polo");
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(33);
        nums.add(31);
        nums.add(56);
        nums.add(90);
        System.out.println(pracownicy);
        redukuj2(pracownicy, 2);
        System.out.println(pracownicy);
        odwroc(pracownicy);
        System.out.println(pracownicy);
        System.out.println(nums);
        redukuj2(nums, 2);
        odwroc2(nums);
        System.out.println(nums);
        System.out.println(odwrocZdanie("Ala ma kota."));
        sitoEratostenesa(100);
        print(pracownicy);
        System.out.println("\n");
        print(nums);


    }
    public static void redukuj(LinkedList<String> pracownicy, int n) {
        pracownicy.remove(n);
    }

    public static <T> void redukuj2 (LinkedList<T> pracownicy, int n) {
        pracownicy.remove(n);
    }
    public static void odwroc (LinkedList<String> lista) {
        for(int i=0; i<lista.size()/2; i++) {
            String temp = lista.get(i);
            lista.set(i, lista.get(lista.size()-i-1));
            lista.set(lista.size()-i-1, temp);
        }
    }
    public static <T> void odwroc2 (LinkedList<T> lista) {
        for(int i=0; i<lista.size()/2; i++) {
            T temp = lista.get(i);
            lista.set(i, lista.get(lista.size() - i - 1));
            lista.set(lista.size()-i-1, temp);
        }
    }

    public static String odwrocZdanie (String zdanie) {
        Stack<String> stack = new Stack<>();
        String[] words = zdanie.split(" ");
        for(String word : words) {
            stack.push(word);
            if(word.contains("."))
                break;
        }
        StringBuilder zd =  new StringBuilder();
        while(stack.empty() == false)
        {
            String s = stack.pop();
            zd.append(s+" ");
        }
        zd.toString();
        String zd2 = zd.substring(0, 1).toUpperCase() + zd.substring(1).toLowerCase();
        return zd2;
    }
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

    public static<E, T extends Iterable<E>> void print(T iterable) {
        for (E item : iterable) {
            System.out.print(item+ ", ");
        }
    }
}

