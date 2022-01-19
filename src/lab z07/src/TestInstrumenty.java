import pl.imiajd.dabrowska.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
   public static void main (String[] args) {

   ArrayList<Instrument> orkiestra = new ArrayList<Instrument>(5);
   Skrzypce s1 = new Skrzypce("Strunal", LocalDate.of(2011, 12, 1));
   Flet f1 = new Flet("Hohner", LocalDate.of(2020, 2, 12));
   Flet f2 = new Flet("Matmax", LocalDate.of(2001, 4, 1));
   Fortepian fo1 = new Fortepian("Kawai", LocalDate.of(2019, 6, 5));
   Skrzypce s2 = new Skrzypce("Yamaha", LocalDate.of(2017, 9, 16));

   orkiestra.add(s1);
   orkiestra.add(f1);
   orkiestra.add(fo1);
   orkiestra.add(s2);
   orkiestra.add(f2);

   for(int i=0; i<orkiestra.size(); i++) {
      System.out.println(orkiestra.get(i).dzwiek());
   }
   for(Instrument ins : orkiestra) {
      System.out.println(ins);
   }

   Flet f6 = new Flet("Hohner", LocalDate.of(2020, 2, 12));
   System.out.println(f1.equals(f6));
   System.out.println(f1.equals(f2));

   }
}
