package pl.imiajd.dabrowska;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;
    public Osoba(String nazwisko, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    public String getNazwisko() {
        return this.nazwisko;
    }
    public int getRokUrodzenia() {
        return this.rokUrodzenia;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }
    public String toString() {
        return "Nazwisko:  " + nazwisko + " rok urodzenia " + rokUrodzenia;
    }


}
