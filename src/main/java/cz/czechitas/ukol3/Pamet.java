package cz.czechitas.ukol3;

import java.util.Objects;

public class Pamet {
    private long kapacita;

    public void setKapacita(long kapacita) {
        Objects.requireNonNull(kapacita);
    }

    public String toString() {
        return "Velikost paměti je " + kapacita + " GB.";
    }

}
