package kap6.flugzeug;

import java.util.List;

public class Motorflugzeug extends Flugzeug implements HatEinenMotor {

    private List<Motor> motor;

    public Motorflugzeug(String kennzeichen, List<Motor> motor) {
        super(kennzeichen);
        this.motor = motor;
    }

    public void starteMotor() {
        System.out.println("Starte motor");
    }

}
