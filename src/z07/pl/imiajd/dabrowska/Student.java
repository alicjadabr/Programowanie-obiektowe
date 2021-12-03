package pl.imiajd.dabrowska;

import java.time.LocalDate;

public class Student extends Osoba {
    public Student(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, String kierunek, double sredniaOcen) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double srednia) {
        sredniaOcen = srednia;
    }

    public String getOpis() {
        return String.format("Student %s %surodzony %s, kierunek %s, srednia ocen: %.2f ", getNazwisko(), getImiona(),
                getDataUrodzenia().toString(), kierunek, sredniaOcen);
    }

    private String kierunek;
    private double sredniaOcen;

}
