package kap6.flugzeuge;

import javax.swing.plaf.basic.BasicTreeUI;

public class Flugzeug {

    private String hersteller;

    private int maxSpeed;

    private String immatNummer;

    private Triebwerk triebwerk;

    public Flugzeug(String hersteller, int maxSpeed, String immatNummer, Triebwerk triebwerk) {
        this.hersteller = hersteller;
        setMaxSpeed(maxSpeed);
        this.immatNummer = immatNummer;
        this.triebwerk = triebwerk;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            //System.out.println("fehlermeldung");
            throw new IllegalArgumentException("ungültiger MaxSpeed");
        }
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getImmatNummer() {
        return immatNummer;
    }

    public void setImmatNummer(String immatNummer) {
        this.immatNummer = immatNummer;
    }

    public void fliegen() {
        if (triebwerk != null && triebwerk.istGestartet()) {
            System.out.println("Flugzeug " + immatNummer + " fliegt, Hersteller: " + hersteller);
        } else if(triebwerk != null && !triebwerk.istGestartet()) {
            System.out.println("bitte zuerst triebwerk starten");
        }
    }

    public void starteAlleTriebwerke() {
        triebwerk.starten();
    }

}
