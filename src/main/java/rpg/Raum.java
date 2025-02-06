package rpg;

import java.util.HashMap;

public class Raum {

    private Spieler gegner;
    private String name;
    private HashMap<String, Raum> tueren;

    public Raum(String name, boolean mitGegner) {
        this.name = name;
        this.tueren = new HashMap<>();
        // gegner hinzufuegen
        if (mitGegner) {
            this.gegner = new Spieler("KI", this); // gegner ist im neuen raum
        }
    }

    public void raumHinzufuegen(Raum raum) {
        this.tueren.put(raum.name, raum);
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Raum> getTueren() {
        return tueren;
    }

    public Spieler getGegner() {
        return gegner;
    }
}
