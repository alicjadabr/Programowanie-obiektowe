package pl.edu.uwm.obiektowe.s156921.kolo1;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = obliczWiek();
    }
    public Osoba(String imie, String nazwisko, int year, int month, int day) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        LocalDate today = LocalDate.now();
        LocalDate dataDoWeryfikacji = LocalDate.of(year, month, day);
        if (dataDoWeryfikacji.isAfter(today)) {
            System.out.println("Data z przyszlosci!");
        } else {
            dataUrodzenia = LocalDate.of(year, month, day);
        }
        this.wiek = obliczWiek();
    }

    private int obliczWiek() {
        LocalDate today = LocalDate.now();
        int w = Period.between(dataUrodzenia, today).getYears();
        return w;
    }

    public String imie() {
        return imie;
    }
    public String nazwisko() {
        return nazwisko;
    }
    public LocalDate dataUrodzenia() {
        return dataUrodzenia;
    }
    public int wiek() {
        return wiek;
    }
    public void ustawImie(String noweImie) {
        imie = noweImie;
    }
    public void ustawNazwisko(String noweNazwisko) {
        imie = noweNazwisko;
    }
    public void ustawDate(int y, int m, int d) {
        dataUrodzenia = LocalDate.of(y, m, d);
    }
    public String toString(){
        return "Osoba " + imie + " " + nazwisko + " urodzona " + dataUrodzenia + ", wiek " + wiek;
    }
}

