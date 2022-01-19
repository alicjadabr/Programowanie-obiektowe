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
        return String.format("%s [%s], [%s]", this.getClass().getSimpleName(), nazwisko, dataUrodzenia.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Osoba osoba = (Osoba) o;
        if (!this.nazwisko.equals(osoba.nazwisko))
            return false;
        if (!this.dataUrodzenia.equals(osoba.dataUrodzenia))
            return false;
        return true;
    }

    @Override
    public int compareTo(Osoba o) {
        // najpierw porownaj nazwiska
        int result = this.nazwisko.compareTo(o.nazwisko);
        // jesli takie same, to date urodzenia
        if (result == 0) {
            result = -1 * this.dataUrodzenia.compareTo(o.dataUrodzenia);
            return result;
        }
        return result;
    }

}