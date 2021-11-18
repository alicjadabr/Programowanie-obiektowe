package pl.edu.uwm.obiektowe.s156921.kolo1;

import java.time.LocalDate;

public class Pracownik extends Osoba {
    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, int year, int month, int day) {
        super(imie, nazwisko, year, month, day);
    }

    public Pracownik(Osoba o, String stanowisko, double pensja) {
        super(o.imie(), o.nazwisko(), o.dataUrodzenia());
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public double pensja() {
        return pensja;
    }

    public String toString() {
        return String.format("%s, jest pracownikiem na stanowisku %s z pensją %.2f zł", super.toString(), stanowisko, pensja);
    }
}
