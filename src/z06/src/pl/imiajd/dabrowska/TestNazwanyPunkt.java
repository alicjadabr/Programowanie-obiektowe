package pl.imiajd.dabrowska;

public class TestNazwanyPunkt
{
    public static void main(String[] args)
    {
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();

        Punkt b = new Punkt(3, 5);
        b.show();

        Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();

        //a = b;               //  --- powoduje błąd kompilacji  (dlaczego ?)
        //ponieważ zmienna a zawiera referencję do innego typu obiektu (ma "extra" pole name) niż zmienna b

        //a = (NazwanyPunkt) b;  //   --- powoduje błąd wykonania   (dlaczego ?)
        //nie mozemy przekonwertowac zmiennej b na NazwanyPunkt (a nastepnie zmienic referecji a),
        //bo domyslny konsruktor klasy NazwanyPunkt zawiera pole name, ktorego b nie posiada

        //a = c;                 //--- powoduje błąd kompilacji  (dlaczego ?)
        // a nie moze wskazywac tego samego miejsca w pamieci co c, poniewaz posiadaja rozne pola name

        a = (NazwanyPunkt) c;
        a.show();
    }
}
