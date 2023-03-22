package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

        Disk diskMehoPocitace = new Disk();
        diskMehoPocitace.setKapacita(500_277_790_720L);
        diskMehoPocitace.setVyuziteMisto(0L);

        Pamet pametMehoPocitace = new Pamet();
        pametMehoPocitace.setKapacita(8_000_000_000L);

        Procesor procesorMehoPocitace = new Procesor();
        procesorMehoPocitace.setVyrobce("Intel");
        procesorMehoPocitace.setRychlost(2_600_000_000L);

        Pocitac mujPocitac = new Pocitac();
        System.out.println(mujPocitac.toString());
        mujPocitac.zapniSe(); // Melo by vypsat chybu, protoze pocitac nema komponenty.

        mujPocitac.setCpu(procesorMehoPocitace);
        mujPocitac.setRam(pametMehoPocitace);
        mujPocitac.setPevnyDisk(diskMehoPocitace);


        mujPocitac.zapniSe(); // Mel by se spravne zapnout.
        mujPocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
        System.out.println(mujPocitac.toString());
        mujPocitac.vypniSe(); // Mel by se spravne vypnout.

        mujPocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
        mujPocitac.vypniSe();

        // Pokus o vytvoreni souboru pri vypnutem pocitaci - skonci chybou
        mujPocitac.vytvorSouborOVelikosti(5000);
        System.out.println(mujPocitac.toString());

        // Pokus o smazani souboru pri vypnutem pocitaci - skonci chybou
        mujPocitac.vymazSouborOVelikosti(7000);
        System.out.println(mujPocitac.toString());

        // Pokus o vytvoreni souboru, na ktery je dostatek mista - probehne OK
        mujPocitac.zapniSe();
        mujPocitac.vytvorSouborOVelikosti(720);
        System.out.println(mujPocitac.toString());

        // Pokus o vytvoreni dalsiho souboru, na ktery je dostatek mista - probehne OK
        mujPocitac.vytvorSouborOVelikosti(277_790_000);
        System.out.println(mujPocitac.toString());

        // Pokus o vytvoreni dalsiho souboru, ktery zaplni kapacitu na maximum - probehne OK
        mujPocitac.vytvorSouborOVelikosti(500_000_000_000L);
        System.out.println(mujPocitac.toString());

        // Pokus o vytvoření dalšího souboru, když už je kapacita naplněná - vypíše chybu
        mujPocitac.vytvorSouborOVelikosti(1);
        System.out.println(mujPocitac.toString());

        // Pokus o smazani souboru, ktery je mensi nez zaplnene misto - probehne OK
        mujPocitac.vymazSouborOVelikosti(500_000_000_000L);
        System.out.println(mujPocitac.toString());

        // Pokus o smazani dalsiho souboru, ktery je mensi nez zaplnene misto - probehne OK
        mujPocitac.vymazSouborOVelikosti(277_790_000);
        System.out.println(mujPocitac.toString());

        // Pokus o smazani dalsiho souboru, ktery je stejne velky jako zaplnene misto - probehne OK
        mujPocitac.vymazSouborOVelikosti(720);
        System.out.println(mujPocitac.toString());

        // Pokus o smazani dalsiho souboru, ktery je vetsi nez zaplnene misto - skonci chybou
        mujPocitac.vymazSouborOVelikosti(277_790_000);
        System.out.println(mujPocitac.toString());
    }

}
