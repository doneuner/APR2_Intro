package kap6.flugzeuge;

public class Main {
    public static void main(String[] args) {

        Triebwerk t1 = new Triebwerk("RoolsRoyce", 2000);

        Flugzeug f1 = new Flugzeug("Boeing", 250, "AT-123", t1);
        f1.fliegen();
        t1.starten();
        f1.fliegen();

        Triebwerk t2 = new Triebwerk("RoolsRoyce", 2000);
        Flugzeug f2 = new Verkehrsflugzeug("Airbus", 500, "AT-456", t2, 350);
        f2.fliegen();
        f2.starteAlleTriebwerke();
        f2.fliegen();


    }
}
