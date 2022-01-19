package pl.imiajd.dabrowska;

import java.time.LocalDate;

public abstract class Instrument {

    private String producent;
    private LocalDate rokProdukcji;

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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Instrument other = (Instrument) obj;
        if (producent == null) {
            if (other.producent != null)
                return false;
        } else if (!producent.equals(other.producent))
            return false;
        if (!rokProdukcji.equals(other.rokProdukcji))
            return false;
        return true;

    }

    @Override
    public String toString() {
        return String.format("Producent: %s, rok produkcji: %s", producent, rokProdukcji.toString());
    }

}

