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

    public static void main(String[] args) {

        int x = 5;
        double y = 4.4;

        Bruch b1 = new Bruch(1,2);

        b1.zaehler = 0;

        b1.zeigeBruch();

        b1 = null;

        b1 = new Bruch(0,0);

        Bruch b2 = b1;

        String s = "abc";

    }

}
