package pl.imiajd.dabrowska;

import java.time.LocalDate;

public class Skrzypce extends Instrument {
    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "wwwwggggzzzz";
    }
}
