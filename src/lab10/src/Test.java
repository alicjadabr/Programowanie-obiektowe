import java.util.*;


public class Test {
    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("Stark");
        pracownicy.add("Polanska");
        pracownicy.add("Allen");
        pracownicy.add("Gosling");
        pracownicy.add("Hanks");
        pracownicy.add("Polo");
        Zad1.redukuj(pracownicy, 5);
        Zad8.print(pracownicy);

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(33);
        nums.add(31);
        nums.add(56);
        nums.add(90);
        Zad2.redukuj(nums, 1);
        Zad8.print(nums);

        Zad3.odwroc(pracownicy);
        Zad8.print(pracownicy);
        Zad4.odwroc(nums);
        Zad8.print(nums);

        System.out.println(Zad5.odwrocZdanie("Ala ma kota."));

        Zad7.sitoEratostenesa(100);
    }
}

