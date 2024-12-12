package kap7.werkstatt;

public class Roboter {
    private String name;
    private int energieNiveau;
    private int geschwindigkeit;

    public Roboter(String name, int energieNiveau, int geschwindigkeit) {
        this.name = name;
        this.energieNiveau = energieNiveau;
        this.geschwindigkeit = geschwindigkeit;
    }

    public void ausführen(Aufgabe aufgabe) {
        if (energieNiveau >= aufgabe.getEnergieBedarf()) {
            energieNiveau -= aufgabe.getEnergieBedarf();
            System.out.println(name + " führt die Aufgabe '" + aufgabe.getName() + "' aus.");
            aufgabe.ausgeführt();
        } else {
            System.out.println(name + " hat nicht genug Energie, um die Aufgabe '" + aufgabe.getName() + "' auszuführen.");
        }
    }

    public int getEnergieNiveau() {
        return energieNiveau;
    }

    public String getName() {
        return name;
    }
}
