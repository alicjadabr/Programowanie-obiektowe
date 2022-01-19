package pl.imiajd.dabrowska;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz() {
        if(this.numer_mieszkania != 0) {
            System.out.println("Kod pocztowy: " + kod_pocztowy +", miasto: " + miasto);
            System.out.println("Ulica: " + ulica + ", numer domu: " + numer_domu
                    + ", numer mieszkania: " + numer_mieszkania);
        } else {
            System.out.println("Kod pocztowy: " + kod_pocztowy +", miasto: " + miasto);
            System.out.println("Ulica: " + ulica + ", numer domu: " + numer_domu);
        }
    }

    public boolean przed(String kod_pocztowy) {
        int kod_ob = Integer.parseInt(this.kod_pocztowy.replace("-", ""));
        int kod2 = Integer.parseInt(kod_pocztowy.replace("-", ""));
        if(kod_ob<kod2)
            return true;
        return false;
    }
}
