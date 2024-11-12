package kap6;

// Vererbung -> ist eine Art von
// Aggregation -> ist Teil von

public class LKW extends Fahrzeug {

    public LKW() {
        super("Mercedes");
    }

    public LKW(String marke) {
        super(marke);
    }

    public void losfahren() {
        System.out.println("LKW " + marke + " fährt los");
    }

}
