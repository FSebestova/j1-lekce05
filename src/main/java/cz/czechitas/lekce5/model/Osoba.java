package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Osoba {
    private String jmeno;
    private String prijmeni;
    private String rodneCislo;

    private Telefon telefon;

    private String pracovniEmail;

    private String soukromiEmail;

    private Adresa adresa;

    public void setJmeno(String jmeno) {
        Objects.requireNonNull(jmeno);
        if (jmeno.isBlank()) {
            System.err.println("Jméno nemůže být prázdné.");
            return;
        }
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        Objects.requireNonNull(prijmeni);
        if (prijmeni.isBlank()) {
            System.err.println("Příjmení nemůže být prázdné.");
            return;
        }
        this.prijmeni = prijmeni;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        Objects.requireNonNull(rodneCislo);
        if (rodneCislo.isBlank()) {
            System.err.println("Rodné číslo nemůže být prázdné.");
            return;
        }
        if (!rodneCislo.contains("/")) {
            System.err.println("Rodné číslo musí obsahovat lomítko.");
            return;
        }
        this.rodneCislo = rodneCislo;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public String getPracovniEmail() {
        return pracovniEmail;

    }

    public void setPracovniEmail(String pracovniEmail) {
        Objects.requireNonNull(pracovniEmail);
        if (pracovniEmail.isBlank()) {
            System.err.println("Email nemůže být prázdné.");
            return;
        }
                if (pracovniEmail.contains("@" + ".")) {
            System.err.println("Pole musí obsahovat @ a . .");
            return;
        }
        this.pracovniEmail = pracovniEmail;
    }

    public String getSoukromiEmail() {
        return soukromiEmail;
    }

    public void setSoukromiEmail(String soukromiEmail) {
        this.soukromiEmail = soukromiEmail;
    }

    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }

    public String toString() {
        return jmeno + " " + prijmeni + " (" + rodneCislo + ")";
    }
}

