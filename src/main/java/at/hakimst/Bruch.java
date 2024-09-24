package at.hakimst;

public class Bruch {

    public int zaehler;
    public int nenner;

    public Bruch() {
    }

    public Bruch(int zaehler, Integer nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public void zeigeBruch() {
        System.out.println(zaehler + "/" + nenner);
    }

    public int getZaehler() {
        return zaehler;
    }

    public static void main(String[] args) {

        Bruch b1 = new Bruch();
        b1.zaehler = 5;
        b1.nenner = 10;

        Bruch b2 = b1;
        b2.zaehler = 0;

        System.out.println(b1.zaehler);

        int x = b1.getZaehler();
        b1.zeigeBruch();


        b1 = null;
        b2 = null;
        b1 = new Bruch();
        b1.zaehler = 4;
        System.gc();

    }
}
