package rpg;

import java.util.HashMap;

public class Raum {

    private Spieler spieler;
    private String name;
    private HashMap<String, Raum> tueren;

    public Raum(String name) {
        this.name = name;
        this.tueren = new HashMap<>();
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

}
