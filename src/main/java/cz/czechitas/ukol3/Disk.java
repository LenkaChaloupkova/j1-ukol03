package cz.czechitas.ukol3;

import java.util.Objects;

public class Disk {
    private long kapacita; //(v bajtech)
    private long vyuziteMisto; //(v bajtech)


    public void setKapacita(long kapacita) {
        Objects.requireNonNull(kapacita);
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        Objects.requireNonNull(vyuziteMisto);
    }

    public String toString() {
        return "Kapacita disku je " + kapacita + "bajtů." + "Využito je: " + vyuziteMisto + " bajtů.";
    }

}
