package cz.czechitas.ukol3;

import java.util.Objects;

public class Procesor {
    private String vyrobce;
    private long rychlost;

    public void setVyrobce(String vyrobce) {
        Objects.requireNonNull(vyrobce);
    }
    public void setRychlost(double rychlost) {
        Objects.requireNonNull(rychlost);
    }

    public String toString() {
        return "Výrobce procesoru je " + vyrobce + "." + "Rychlost procesoru je " + rychlost + ".";
    }



}
