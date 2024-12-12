package kap7.werkstatt;

public class Werkstatt {

    private Roboter roboter;
    private Aufgabe aufgabe;

    public Werkstatt(Roboter roboter, Aufgabe aufgabe) {
        this.roboter = roboter;
        this.aufgabe = aufgabe;
    }

    public void werkstattStarten() {
        System.out.println(roboter.getName() + " " + roboter.getEnergieNiveau());
        System.out.println(aufgabe.getName() + " " + aufgabe.getEnergieBedarf() + " " + aufgabe.istAusgeführt());
        if (roboter.getEnergieNiveau() >= aufgabe.getEnergieBedarf()) {
            roboter.ausführen(aufgabe);
        }
        System.out.println(roboter.getName() + " " + roboter.getEnergieNiveau());
        System.out.println(aufgabe.getName() + " " + aufgabe.getEnergieBedarf() + " " + aufgabe.istAusgeführt());
    }

    public void setAufgabe(Aufgabe aufgabe) {
        this.aufgabe = aufgabe;
    }

    public static void main(String[] args) {

        Roboter r = new Roboter("R2D2", 100, 0);
        Aufgabe a1 = new Aufgabe("Schweißen", 60);
        Aufgabe a2 = new Aufgabe("Putzen", 50);

        Werkstatt w = new Werkstatt(r, a1);
        w.werkstattStarten();
        w.setAufgabe(a2);
        w.werkstattStarten();


    }

}
