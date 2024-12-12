package kap7.werkstatt;

public class Aufgabe {
    private String name;
    private int energieBedarf;
    private boolean istAusgeführt;

    public Aufgabe(String name, int energieBedarf) {
        this.name = name;
        this.energieBedarf = energieBedarf;
        this.istAusgeführt = false;
    }

    public void ausgeführt() {
        istAusgeführt = true;
        System.out.println("Die Aufgabe '" + name + "' ist erfolgreich ausgeführt worden.");
    }

    public int getEnergieBedarf() {
        return energieBedarf;
    }

    public String getName() {
        return name;
    }

    public boolean istAusgeführt() {
        return istAusgeführt;
    }
}
