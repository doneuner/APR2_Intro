package kap10;

public class Adventkalender {

    /**
     * Anzahl an Reihen im Kalender
     */
    public static int REIHEN = 4;

    /**
     * Anzahl an Fenster in einer Reihe
     */
    public static int SPALTEN = 6;

    /**
     * array mit boolean fuer die Fenster, true wenn geoeffent
     */
    // TODO

    /**
     * prueft ob eine Fensternummer gueltig ist
     * Zusatz: Vergleiche das heutige Datum mit der Fensternummer (kein oeffnen zukuenftiger Fenster)
     * @param fensterNummer 1 - 24 ist gueltig
     * @return true wenn gueltig
     */
    private boolean istFensterNummerGueltig(int fensterNummer) {
        // TODO
        return false;
    }

    /**
     * zeichnet eine Strichreihe
     * +----+ +----+ +----+ +----+ +----+ +----+
     */
    private void zeicheStrichReihe() {
        // TODO
    }

    /**
     * zeichnet ein Fenster, z.B.  | 12 | oder |  6 | oder |    |
     * @param fensterNummer 1 - 24
     */
    private void zeicheFensterInhalt(int fensterNummer) {
        // TODO
    }

    /**
     * oeffne ein Fenster
     * @param fensterNummer 1 - 24
     */
    public void oeffneFenster(int fensterNummer) {
        // TODO
    }

    /**
     * gibt true zurueck wenn das Fenster geöffnet wurde
     * @param fensterNummer (1-24)
     * @return true wenn offen
     */
    private boolean istFensterGeoffnet(int fensterNummer) {
        // TODO
        return false;
    }

    /**
     * Methode zum Zeichnen eines Adventkalender
     * Hinweis: 4 Reihen, je 6 Spalten (Fenster)
     */
    public void zeichneAdventkalender() {
        // TODO
    }


    public static void main(String[] args) {

        // Eingabeschleife zum Öffnen der Fenster
        Adventkalender k = new Adventkalender();
        k.zeichneAdventkalender();
        k.oeffneFenster(1);
        k.zeichneAdventkalender();
        k.oeffneFenster(29);
        k.oeffneFenster(19);
        k.zeichneAdventkalender();
    }
}
