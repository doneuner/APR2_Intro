package kap6;

import java.util.Scanner;

public class Bruch {

    private int zaehler;
    private int nenner;
    Spielfarben farbe;

    static int anzahlBrueche = 0;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
        this.farbe = Spielfarben.PIK;
        anzahlBrueche++;
    }

    public static void clearAnzahlBrueche() {
        anzahlBrueche = 0;
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public static void main(String[] args) {
        System.out.println(Bruch.anzahlBrueche);
        Bruch b1 = new Bruch(1,2);
        System.out.println(Bruch.anzahlBrueche);
        Bruch b2 = new Bruch(1,3);
        System.out.println(Bruch.anzahlBrueche);

        Bruch.clearAnzahlBrueche();

        double x = Double.parseDouble("123.3");

        double y = Math.sqrt(4);


        b1.nenner = 4;

    }
}
