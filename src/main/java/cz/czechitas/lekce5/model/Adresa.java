package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Adresa {

    private String ulice;

    private String castObce;

    private String obec;

    private String psc;

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        Objects.requireNonNull(ulice);
        if (ulice.isBlank()) {
            System.err.println("Toto pole je povinné");
            return;
        }
        this.ulice = ulice;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        Objects.requireNonNull(castObce);
        if (castObce.isBlank()) {
            System.err.println("Toto pole je povinné");
            return;
        }
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        Objects.requireNonNull(obec);
        if (obec.isBlank()) {
            System.err.println("Toto pole je povinné");
            return;
        }
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        Objects.requireNonNull(psc);
        if (psc.isBlank()) {
            System.err.println("Toto pole je povinné");
            return;
        }
        if (psc.length() != 5) {
            System.err.println("PSC musí obsahovat 5 znaků");
            return;
        }
    this.psc = psc;
    }
}





