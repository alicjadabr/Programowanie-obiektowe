package pl.imiajd.dabrowska;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return String.format("Osoba [%s], [%s]", nazwisko, dataUrodzenia.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Osoba osoba = (Osoba) o;
        if (this.nazwisko.equals(osoba.nazwisko) && this.dataUrodzenia.equals(osoba.dataUrodzenia)) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Osoba o) {
        int result = this.nazwisko.compareTo(o.nazwisko);
        if (result == 0) {
            result = -1 * this.dataUrodzenia.compareTo(o.dataUrodzenia);
            return result;
        }
        return result;
    }
}