package pl.imiajd.dabrowska;

import pl.imiajd.dabrowska.Nauczyciel;
import pl.imiajd.dabrowska.Osoba;
import pl.imiajd.dabrowska.Student;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Kowalska", 1998);
        Osoba o2 = new Osoba("Edward", 1975);
        Osoba o3 = new Osoba("Bartosz", 1991);
        Osoba o4 = new Osoba("Feliks", 1969);

        Student s1 = new Student(o1, "Psychologia");
        Nauczyciel n1 = new Nauczyciel(o2, 3300);
        System.out.println(s1.toString());
        System.out.println(n1.toString());
        System.out.println(o3.toString());


    }
}
