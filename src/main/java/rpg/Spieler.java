package rpg;

public class Spieler {
    private Raum aktuellerRaum;

    public Spieler(Raum aktuellerRaum) {
        this.aktuellerRaum = aktuellerRaum;
    }

    public void raumWechseln(String name) {
        if (aktuellerRaum != null) {
            Raum nachbarRaum = aktuellerRaum.getTueren().get(name);

            // raum wechseln
            if (nachbarRaum != null) {
                aktuellerRaum = nachbarRaum;
            }
        }
    }

    public void show() {
        System.out.println("spieler befindet sich in: " +aktuellerRaum.getName());
        System.out.println("türen: ");
        aktuellerRaum.getTueren().keySet().forEach(System.out::println);
    }
}
