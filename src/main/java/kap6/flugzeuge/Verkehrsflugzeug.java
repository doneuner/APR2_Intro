package kap6.flugzeuge;

public class Verkehrsflugzeug extends Flugzeug {

    private int passagierKapazitaet;

    public Verkehrsflugzeug(String hersteller, int maxSpeed, String immatNummer, Triebwerk triebwerk, int passagierKapazitaet) {
        super(hersteller, maxSpeed, immatNummer, triebwerk);
        setPassagierKapazitaet(passagierKapazitaet);
    }

    public int getPassagierKapazitaet() {
        return passagierKapazitaet;
    }

    public void setPassagierKapazitaet(int passagierKapazitaet) {
        if (passagierKapazitaet > 0) {
            this.passagierKapazitaet = passagierKapazitaet;
        } else {
            throw new IllegalArgumentException("ungültige Passagieranzahl");
        }
    }

    @Override
    public void fliegen() {
        //System.out.println("Verkehrsflugzeug " + getImmatNummer() + " fliegt, Hersteller: " + getHersteller() + " passagiere: " + passagierKapazitaet);
        super.fliegen();
        System.out.println("Verkehrsflugzeug: " + getPassagierKapazitaet());
    }
}
