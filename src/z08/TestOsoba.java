import pl.imiajd.dabrowska.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestOsoba {
    public static void main (String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>();
        Osoba o1 = new Osoba("Kowal", LocalDate.of(1969, 8, 18));
        Osoba o2 = new Osoba("Ochocka", LocalDate.of(1995, 11, 13));
        Osoba o3 = new Osoba("Kowal", LocalDate.of(2004, 3, 2));
        Osoba o4 = new Osoba("Dabrowska", LocalDate.of(2000, 12, 27));
        Osoba o5 = new Osoba("Wolski", LocalDate.of(1995, 11, 13));
        grupa.add(o1);
        grupa.add(o2);
        grupa.add(o3);
        grupa.add(o4);
        grupa.add(o5);

        for (int i=0; i<grupa.size(); i++) {
            System.out.println(grupa.get(i));
        }
        Collections.sort(grupa);
        System.out.println();
        for (int i=0; i<grupa.size(); i++) {
            System.out.println(grupa.get(i));
        }
    }
}

