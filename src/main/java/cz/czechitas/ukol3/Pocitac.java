package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty; //(toto bude pouze field, bez getteru a setteru)
    private Procesor cpu; //(budeme se tvářit, že počítač má jen jeden procesor s jedním jádrem)
    private Pamet ram;
    private Disk pevnyDisk;

    //První metoda bude vracet stav, zda je počítač zapnutý (hodnotu fieldu jeZapnuty).
    //Další dvě metody budou počítač zapínat resp. vypínat, tj. budou nastavovat proměnnou (field) jeZapnuty
    //a do konzole vypíšou odpovídající informaci.

    public boolean jeZapnuty(){
        return false;
    };

    public void zapniSe(){

    };

    public void vypniSe(){

    };

    public String toString() {
        return "Rychlost procesoru je " + cpu + "Hz." + "Velikost pameti je: " + ram + " GB." + "Rychlost pevneho disku je " + pevnyDisk + " MB." ;
    }

}
