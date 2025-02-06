package rpg;

public class Main {
    public static void main(String[] args) {
        Raum start = new Raum("start", false);
        Raum keller = new Raum("keller", true);
        Raum dach = new Raum("dach", true);

        start.raumHinzufuegen(keller);
        start.raumHinzufuegen(dach);
        keller.raumHinzufuegen(start);
        dach.raumHinzufuegen(start);

        Spieler spieler = new Spieler("NEUN", start);
        spieler.show();
        spieler.raumWechseln("keller");
        spieler.show();
        spieler.raumWechseln("start");
        spieler.show();
        spieler.raumWechseln("dach");
        spieler.show();
        spieler.raumWechseln("start");
        spieler.raumWechseln("dach");


    }
}
