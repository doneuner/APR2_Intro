package kap6.flugzeug;

public class Segelflugzeug extends Flugzeug {

    private double segelSpezialEigenschaft;

    public Segelflugzeug() {
        super("afd");
        this.segelSpezialEigenschaft = 1;
    }

    public Segelflugzeug(String kennzeichen, double segelSpezialEigenschaft) {
        super(kennzeichen);
        this.segelSpezialEigenschaft = segelSpezialEigenschaft;
    }

    public void segeln() {
        System.out.println("Segelflugzeug segelt");
    }

    @Override
    public void fliege() {
        System.out.println("Segelflugzeug fliege");
        super.fliege();
    }


}
