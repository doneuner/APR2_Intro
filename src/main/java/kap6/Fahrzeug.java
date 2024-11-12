package kap6;

public class Fahrzeug {

    protected String marke;
    private Motor motor;

    public Fahrzeug(String marke) {
        this.marke = marke;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
}
