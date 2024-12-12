package kap7.werkstatt.game;

import java.util.Scanner;

public class Spiel {

    private Spieler s1;
    private Spieler s2;

    public Spiel(Spieler s1, Spieler s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void spieleBisKO() {

        while (!s1.istKO() && !s2.istKO()) {
            s1.angreifen(s2);

            if (s2.istKO()) {
                System.out.println("Spieler " + s2.getName() + " ist KO");
            } else {
                s2.angreifen(s1);

                if (s1.istKO()) {
                    System.out.println("Spieler " + s1.getName() + "  ist KO");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib den Namen 1 ein:");
        String name1 = scanner.nextLine();

        System.out.println("Gib den Namen 2 ein:");
        String name2 = scanner.nextLine();

        Spieler s1 = new Spieler(name1);
        Spieler s2 = new Spieler(name2);
        s2.zauberStabAufnehmen(new Zauberstab(20));

        Spiel spiel = new Spiel(s1, s2);
        spiel.spieleBisKO();

    }

}
