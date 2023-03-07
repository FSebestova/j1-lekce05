package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Osoba rumcajz = new Osoba();
        rumcajz.setJmeno("Rumcajz");
        rumcajz.setPrijmeni("Řáholecký");
        rumcajz.setRodneCislo("2525252/525");
        rumcajz.setPracovniEmail("rum@seznam.cz");
        rumcajz.setSoukromiEmail("rumicek@seznam.cz");

        Adresa rumcajzAdresa = new Adresa();
        rumcajzAdresa.setObec("Kunice");
        rumcajzAdresa.setPsc("25163");
        rumcajzAdresa.setCastObce("Stančice");
        rumcajzAdresa.setUlice("Májová 13");

        Telefon rumcajzuvTelefon = new Telefon();
        rumcajzuvTelefon.setPredcisli("+420");
        rumcajzuvTelefon.setTelefonniCislo("777777777");



//        System.out.println("Krestní Jmeno: "  + rumcajz.getJmeno());
//        System.out.println("Obec: " + rumcajzAdresa.getObec());
//        System.out.println("Pracovní email: " + rumcajz.getPracovniEmail());
//        System.out.println("Telefon: " + rumcajz.getTelefon().getTelefonniCislo());
//        System.out.println(rumcajzuvTelefon.getClass());



    }

}
