package pl.imiajd.dabrowska;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Instrument {

    public Instrument(String producent, LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public abstract String dzwiek();

    public String getProducent() {
        return producent;
    }
    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) && Objects.equals(rokProdukcji, that.rokProdukcji);
    }

    @Override
    public String toString() {
        return String.format("Producent: %s, rok produkcji: %s", producent, rokProdukcji.toString());
    }

    private String producent;
    private LocalDate rokProdukcji;
}

