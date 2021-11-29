package pl.imiajd.dabrowska;

public class Nauczyciel extends Osoba {
    private double pensja;

    public Nauczyciel(Osoba o, double pensja) {
        super(o.getNazwisko(), o.getRokUrodzenia());
        this.pensja = pensja;
    }
    public double getPensja() {
        return this.pensja;
    }
    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
    public String toString() {
        return String.format("%s, jest nauczycielem o pensji %.2f zl.", super.toString(), getPensja());
    }

}
