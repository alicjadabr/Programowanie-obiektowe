package pl.imiajd.dabrowska;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    @Override
    public String toString() {
        return String.format("%s, [%.2f]", super.toString(), sredniaOcen);
    }

    @Override
    public int compareTo(Osoba o) {
        Student s = (Student) o;
        int res = super.compareTo(o);
        if(res == 0) {
            double sr = this.sredniaOcen - s.sredniaOcen;
            if(sr < 0) {
                return -1;
            }
            else if (sr > 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
        return res;
    }
}
