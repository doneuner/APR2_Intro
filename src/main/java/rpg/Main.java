package rpg;

public class Main {
    public static void main(String[] args) {
        Raum start = new Raum("start");
        Raum keller = new Raum("keller");

        start.raumHinzufuegen(keller);
        keller.raumHinzufuegen(start);

        Spieler spieler = new Spieler(start);
        spieler.show();
        spieler.raumWechseln("keller");
        spieler.show();
    }
}
