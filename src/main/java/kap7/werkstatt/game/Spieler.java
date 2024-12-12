package kap7.werkstatt.game;

import java.util.Random;

public class Spieler {

    private String name;
    private int gesundheit;
    private Zauberstab zauberstab;

    public Spieler(String name) {
        this.name = name;
        this.gesundheit = 100;
    }

    public void zauberStabAufnehmen(Zauberstab zauberstab) {
        if (zauberstab != null && zauberstab.getEnergie() > 0) {
            this.zauberstab = zauberstab;
        }
    }

    public void zauberStabAblegen() {
        this.zauberstab = null;
    }

    public void angreifen(Spieler gegner) {
        Random r = new Random();

        int angriff = r.nextInt(10, 30);

        if (this.zauberstab != null && this.zauberstab.getEnergie() > 0) {
            angriff *= 2;
        }

        gegner.gesundheit -= angriff;

        System.out.println(this.name + " greift " + gegner.name + " mit " + angriff + " Energie an.");

        if (gegner.gesundheit < 0) {
            gegner.gesundheit = 0;
        }
    }

    public boolean istKO() {
        return gesundheit <= 0;
    }

    public String getName() {
        return this.name;
    }
}
