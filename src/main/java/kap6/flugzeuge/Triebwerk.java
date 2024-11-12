package kap6.flugzeuge;

public class Triebwerk {

    private String hersteller;

    private int leistung;

    private boolean istGestartet;

    public Triebwerk(String hersteller, int leistung) {
        this.hersteller = hersteller;
        this.leistung = leistung;
        this.istGestartet = false;
    }

    public void starten() {
        System.out.println("Triebwerk " + hersteller + " startet mit " + leistung + "PS");
        this.istGestartet = true;
    }

    public boolean istGestartet() {
        return istGestartet;
    }
}
