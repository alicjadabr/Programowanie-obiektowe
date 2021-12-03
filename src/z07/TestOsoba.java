import pl.imiajd.dabrowska.*;

import java.time.LocalDate;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Bronek", "Jan"}, LocalDate.of(1965, 12, 3), true, 4440.334, LocalDate.of(2004, 4, 3));
        ludzie[1] = new Student("Nowak", new String[]{"Malgorzata"}, LocalDate.of(1997, 5, 5), false, "informatyka", 3.443);
        // ludzie[2] = new pl.imiajd.dabrowska.Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getOpis());
        }
    }
}


