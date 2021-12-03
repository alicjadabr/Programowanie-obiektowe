import pl.imiajd.dabrowska.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
   public static void main (String[] args) {

   ArrayList<Instrument> orkiestra = new ArrayList<Instrument>(5);
   Instrument s1 = new Skrzypce("Strunal", LocalDate.of(2011, 12, 1));
   Instrument f1 = new Flet("Hohner", LocalDate.of(2020, 2, 12));
   Instrument f2 = new Flet("Matmax", LocalDate.of(2001, 4, 1));
   Instrument fo1 = new Fortepian("Kawai", LocalDate.of(2019, 6, 5));
   Instrument s2 = new Skrzypce("Yamaha", LocalDate.of(2017, 9, 16));

   orkiestra.add(s1);
   orkiestra.add(f1);
   orkiestra.add(fo1);
   orkiestra.add(s2);
   orkiestra.add(f2);

   for(Instrument i : orkiestra) {
      System.out.println(i.dzwiek());
   }
   for(Instrument ins : orkiestra) {
      System.out.println(ins);
   }
   }
}
