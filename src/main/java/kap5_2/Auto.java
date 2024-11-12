package kap5_2;

public class Auto {

    private String marke;
    private int leistung;

    public Auto() {
        this("AASDF", 100);
    }

    public Auto(String marke) {
        this(marke, 100);
    }

    public Auto(String marke, int leistung) {
        this.marke = marke;
        this.setLeistung(leistung);
    }

    public void setLeistung(int leistung) {
        if (leistung >= 0) {
            this.leistung = leistung;
        } else {
            System.out.println("fehler");
            this.leistung = 0;
        }
    }



}
