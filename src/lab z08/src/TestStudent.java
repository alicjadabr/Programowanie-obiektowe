import pl.imiajd.dabrowska.Osoba;
import pl.imiajd.dabrowska.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main (String[] args) {
        ArrayList<Student> studenci = new ArrayList<>();
        Student s1 = new Student("Kowal", LocalDate.of(1969, 8, 18), 2.34);
        Student s2 = new Student("Ochocka", LocalDate.of(1995, 11, 13), 4.76);
        Student s3 = new Student("Kowal", LocalDate.of(2004, 3, 2), 3.34);
        Student s4 = new Student("Dabrowska", LocalDate.of(2000, 12, 27), 3.54);
        Student s5 = new Student("Wolski", LocalDate.of(1995, 11, 13), 2.96);
        Student s6 = new Student("Kowal", LocalDate.of(1969, 8, 18), 3.44);
        Student s7 = new Student("Kowal", LocalDate.of(1969, 8, 18), 2.22);
        studenci.add(s1);
        studenci.add(s2);
        studenci.add(s3);
        studenci.add(s4);
        studenci.add(s5);
        studenci.add(s6);
        studenci.add(s7);

        for (Student s : studenci ) {
            System.out.println(s);
        }

        Collections.sort(studenci);
        System.out.println();

        for (Student s : studenci ) {
            System.out.println(s);
        }
    }
}