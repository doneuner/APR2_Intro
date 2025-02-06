package rpg;

import java.util.Random;

public class Spieler {
    private String name;
    private int energie;
    private Raum aktuellerRaum;

    public Spieler(String name, Raum aktuellerRaum) {
        this.name = name;
        this.energie = 100;
        this.aktuellerRaum = aktuellerRaum;
    }

    public void raumWechseln(String name) {
        if (aktuellerRaum != null) {
            Raum nachbarRaum = aktuellerRaum.getTueren().get(name);

            // raum wechseln
            if (nachbarRaum != null) {
                System.out.println(this.name + " wechselt den Raum von " + aktuellerRaum.getName() + " nach " + nachbarRaum.getName());

                aktuellerRaum = nachbarRaum;

                // gegner im raum vorhanden
                if (aktuellerRaum.getGegner() != null) {
                    // gegner greift den spieler an
                    aktuellerRaum.getGegner().angreifen(this);
                }
            }
        }
    }

    public void show() {
        System.out.println("------------------------------------");
        System.out.println("- Spieler: " + name + " " + energie + "HP");
        System.out.println("- Raum: " +aktuellerRaum.getName());
        System.out.print("- Türen: ");
        aktuellerRaum.getTueren().keySet().forEach(k -> System.out.print(k + " "));
        System.out.println("\n------------------------------------");
    }

    public void angreifen(Spieler gegner) {
        System.out.print(name + " attackiert " + gegner.name);

        Random r = new Random();
        gegner.energie -= r.nextInt(10, 50);

        if (gegner.energie <= 0) {
            gegner.energie = 0;
            System.out.print(" - besiegt -");
        }

        System.out.println(" " + gegner.energie + "HP");
    }
}
