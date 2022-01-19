package pl.imiajd.dabrowska;

import pl.imiajd.dabrowska.Osoba;

public class Student extends Osoba {
    private String kierunek;

    public Student(Osoba o, String kierunek) {
        super(o.getNazwisko(), o.getRokUrodzenia());
        this.kierunek = kierunek;
    }

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return this.kierunek;
    }
    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }
    public String toString() {
        return String.format("%s, jest studentem na kierunku %s.", super.toString(), getKierunek());

    }
}
