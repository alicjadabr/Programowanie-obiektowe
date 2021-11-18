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
        checkDate(dataUrodzenia);
        this.wiek = obliczWiek();
    }
    private int obliczWiek() {
        LocalDate today = LocalDate.now();
        int w = Period.between(dataUrodzenia, today).getYears();
        return w;
    }
    private void checkDate(LocalDate dataUrodzenia) {
        LocalDate today = LocalDate.now();
        if (dataUrodzenia.isAfter(today)) {
            System.out.println("Data z przyszlosci!");
        } else {
            this.dataUrodzenia = dataUrodzenia;
        }
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    public int getWiek() {
        return wiek;
    }
    public void setImie(String noweImie) {
        imie = noweImie;
    }
    public void setNazwisko(String noweNazwisko) {
        nazwisko = noweNazwisko;
    }
    public void setDataUrodzenia(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        checkDate(date);
        wiek = obliczWiek();
    }
    public String toString(){
        return "Osoba " + imie + " " + nazwisko + " urodzona " + dataUrodzenia + ", wiek " + wiek;
    }
}

