package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

        System.out.println(mujPocitac.toString());
        mujPocitac.zapniSe();

        Disk diskMehoPocitace = new Disk();
        diskMehoPocitace.setKapacita (500_277_790_720L);
        diskMehoPocitace.setVyuziteMisto (56_000_000_000L);

        Pamet pametMehoPocitace = new Pamet();
        pametMehoPocitace.setKapacita (8_000_000_000L);

        Procesor procesorMehoPocitace = new Procesor();
        procesorMehoPocitace.setVyrobce ("Intel");
        procesorMehoPocitace.setRychlost (2.6);

        Pocitac mujPocitac = new Pocitac();
        mujPocitac.setCpu(procesorMehoPocitace);
        mujPocitac.setRam(pametMehoPocitace);
        mujPocitac.setPevnyDisk(diskMehoPocitace);

        System.out.println(mujPocitac.toString());

        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
        System.out.println(mujPocitac.toString());
        mujPocitac.vypniSe();

        mujPocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
        mujPocitac.vypniSe();

        System.out.println("Program spuštěn.");
        System.err.println("Program nelze spustit.");
    }

}
