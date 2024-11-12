package kap6.flugzeug;

public class Flugzeug {

    public String kennzeichen;

    public Flugzeug(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void fliege() {
        System.out.println("Flugzeug fliegt");
    }
}
