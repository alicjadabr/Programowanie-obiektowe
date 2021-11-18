package pl.edu.uwm.obiektowe.s156921.kolo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {
    public static void main (String[] args) {
        ArrayList<Osoba> osoby = new ArrayList<>();
        Osoba o1 = new Osoba("Alicja", "Dabrowska", LocalDate.of(2000, 12, 27));
        Osoba o2 = new Osoba("Edward", "Norton",  LocalDate.of(1969, 8, 18));
        Osoba o3 = new Osoba("Bartosz", "Rynga",  LocalDate.of(1995, 11, 13));
        Osoba o4 = new Osoba("Feliks", "Kolas", LocalDate.of(2004, 3, 2));
        Osoba o5 = new Osoba("Laura", "Hecky", LocalDate.of(1983, 5, 11));
        Osoba o6 = new Osoba("Blanka", "Jaksa", LocalDate.of(1973, 7, 4));
        Pracownik p1 = new Pracownik(o3, "redaktor", 3300.2324);
        Pracownik p2 = new Pracownik(o5, "adwokat", 6000);
        Pracownik p3 = new Pracownik(o6, "weterynarz", 5300.43);
        osoby.add(o1);
        osoby.add(o2);
        osoby.add(o4);
        osoby.add(p1);
        osoby.add(p2);
        osoby.add(p3);

        for (int i=0; i<osoby.size(); i++) {
            System.out.println(osoby.get(i));
        }

        double sumaPensji = 0;
        for(int i = 0; i<osoby.size(); i++) {
            Osoba o = osoby.get(i);
            if (o instanceof Pracownik) {
                sumaPensji += ((Pracownik) o).getPensja();
            }
        }
        System.out.println(String.format("Suma pensji wszystkich pracownikow wynosi %.4f", sumaPensji));
    }
}

