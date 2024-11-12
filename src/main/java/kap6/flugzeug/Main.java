package kap6.flugzeug;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Flugzeug f1 = new Flugzeug("IM");
        f1.fliege();

        // ------------
        System.out.println("-----------------");

        Segelflugzeug f2 = new Segelflugzeug("LA", 23);
        f2.fliege();
        System.out.println("-----------------");
        f2.segeln();

        System.out.println("-----------------");
        Motorflugzeug f3 = new Motorflugzeug("RE", new ArrayList<>());
        f3.starteMotor();
        f3.fliege();
    }
}
