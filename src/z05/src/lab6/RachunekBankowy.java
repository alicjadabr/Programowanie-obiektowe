package lab6;

public class RachunekBankowy {

    private static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo) {
        this.saldo = saldo;
    }

    public void obliczMiesieczneOdsetki() {
        double odsetki;
        odsetki = (this.saldo * rocznaStopaProcentowa)/12;
        this.saldo += odsetki;
    }
    public static void setRocznaStopaProcentowa(double nowaStopa){
        rocznaStopaProcentowa = nowaStopa;
    }
    public void wypiszSaldo() {
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}




