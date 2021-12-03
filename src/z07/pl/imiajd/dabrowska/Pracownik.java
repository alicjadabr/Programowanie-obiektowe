package pl.imiajd.dabrowska;

import java.time.LocalDate;

public class Pracownik extends Osoba {
    public Pracownik(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory() {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public String getOpis() {
        return String.format("Pracownik %s %surodzony %s, zatrudniony %s, pensja: %.2f zł", getNazwisko(), getImiona(),
                getDataUrodzenia().toString(), dataZatrudnienia.toString(), pobory);
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}
