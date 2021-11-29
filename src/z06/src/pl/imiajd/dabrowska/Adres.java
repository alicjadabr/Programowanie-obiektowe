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
        StringBuilder sb = new StringBuilder().append(kod_pocztowy.charAt(0));
        sb.append(kod_pocztowy.charAt(1));
        int firstPart= Integer.parseInt(sb.toString());
        StringBuilder sb2 = new StringBuilder().append(this.kod_pocztowy.charAt(0));
        sb2.append(this.kod_pocztowy.charAt(1));
        int kod_obiektu = Integer.parseInt(sb2.toString());
        if(kod_obiektu < firstPart)
            return true;
        else if(kod_obiektu == firstPart) {
            StringBuilder sb3 = new StringBuilder().append(kod_pocztowy.charAt(3));
            sb3.append(kod_pocztowy.charAt(4)).append(kod_pocztowy.charAt(5));
            int secondPart = Integer.parseInt(sb3.toString());
            StringBuilder sb4 = new StringBuilder().append(this.kod_pocztowy.charAt(3));
            sb4.append(this.kod_pocztowy.charAt(4)).append(this.kod_pocztowy.charAt(5));
            int kod_obiektu2 = Integer.parseInt(sb4.toString());
            if(kod_obiektu2 < secondPart)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
