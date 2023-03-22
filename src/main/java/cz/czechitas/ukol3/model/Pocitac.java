package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty; //(toto bude pouze field, bez getteru a setteru)
    private Procesor cpu; //(budeme se tvářit, že počítač má jen jeden procesor s jedním jádrem)
    private Pamet ram;
    private Disk pevnyDisk;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty == true) {
            System.out.println("Chyba: Pocitac je jiz zapnuty.");
            return;
        }

        if (cpu == null || ram == null || pevnyDisk == null) {
            System.out.println("Chyba: Pocitac neni kompletni.");
            return;
        }

        jeZapnuty = true;
        System.out.println("Pocitac se prave zapnul.");

    }

    public void vypniSe() {
        if (jeZapnuty == true) {
            jeZapnuty = false;
            System.out.println("Pocitac se prave vypnul");
        }
    }

    public void vytvorSouborOVelikosti(long velikostSouboru) {
        if (jeZapnuty == false) {
            System.out.println("Chyba: Nejdříve zapněte počítač, až pak vytvářejte soubor.");
            return;
        }
        long nevyuzitaKapacita = pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto();
        if (nevyuzitaKapacita < velikostSouboru) {
            System.out.println("Chyba: Na pevném disku není dost paměti na vytvoření souboru.");
            //    return; > return se už nepíše, protože používám potom "else"
        } else {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikostSouboru);
            System.out.println("Soubor o velkosti " + velikostSouboru + " bajtů se právě vytvořil.");
        }
    }

    public void vymazSouborOVelikosti(long velikostMazanehoSouboru) {
        if (jeZapnuty == false) {
            System.out.println("Chyba: Nejdříve zapněte počítač, až pak vymažte soubor.");
            return;
        }
        if (velikostMazanehoSouboru > pevnyDisk.getVyuziteMisto()) {
            System.out.println("Chyba: Vyberte menší soubor ke smazání.");
        } else {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikostMazanehoSouboru);
            System.out.println("Soubor o velkosti " + velikostMazanehoSouboru + " bajtů se právě vymazal.");
        }
    }

    public String toString() {
        return "Procesor: " + cpu + " Pamet: " + ram + " Pevny disk: " + pevnyDisk;
    }

}
