package cz.czechitas.ukol3.model;

public class Pamet {
    private long kapacita;

    public long getKapacita(){
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public String toString() {
        return "Velikost paměti je " + kapacita + " bajtů.";
    }

}
