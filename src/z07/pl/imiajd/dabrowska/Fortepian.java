package pl.imiajd.dabrowska;

import java.time.LocalDate;

public class Fortepian extends Instrument {
    public Fortepian(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "tyryryry ";
    }
}
