package pl.imiajd.dabrowska;

public class TestAdres {
    public static void main(String[] args) {
        Adres a1 = new Adres("Kwiatowa", 13, 7, "Olsztyn", "10-240");
        Adres a2 = new Adres("Dluga", 223, "Torun", "20-102");
        Adres a3 = new Adres("Krotka", 84, 2, "Koszalin", "16-340");
        a1.pokaz();
        a2.pokaz();
        a3.pokaz();
        System.out.println(a2.przed("20-103"));
        System.out.println(a1.przed("10-100"));
    }

}
