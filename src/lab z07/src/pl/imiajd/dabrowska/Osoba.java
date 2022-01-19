package pl.imiajd.dabrowska;

import java.time.LocalDate;

public abstract class Osoba {
    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec) {
        this.nazwisko = nazwisko;
        this.imiona = new String[imiona.length];
        int i = 0;
        for (String imie : imiona) {
            this.imiona[i] = imie;
            i++;
        }
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImiona() {
        StringBuilder imi = new StringBuilder();
        for (String imie : imiona) {
            imi.append(imie + " ");
        }
        return imi.toString();
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean getPlec() {
        return plec;
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}
