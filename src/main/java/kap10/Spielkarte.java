package kap10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Spielkarte implements Comparable<Spielkarte> {

    private String bezeichnung;
    private int ordnung;

    public Spielkarte(String bezeichnung, int ordnung) {
        this.bezeichnung = bezeichnung;
        this.ordnung = ordnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getOrdnung() {
        return ordnung;
    }

    public void setOrdnung(int ordnung) {
        this.ordnung = ordnung;
    }

    @Override
    public String toString() {
        return "Spielkarte{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", ordnung=" + ordnung +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Spielkarte that = (Spielkarte) o;
        return Objects.equals(bezeichnung, that.bezeichnung);
    }

    public static void main(String[] args) {


        Spielkarte vier = new Spielkarte("vier", 4);
        Spielkarte fuenf = new Spielkarte("fuenf", 5);

        Spielkarte koenig = new Spielkarte("koenig", 10);
        Spielkarte zehn = new Spielkarte("zehn", 10);
        Spielkarte ass = new Spielkarte("ass", 11);

        Spielkarte vier2 = new Spielkarte("vier", 4);

        System.out.println(vier.equals(fuenf));
        System.out.println(vier.equals(vier2));

        List<Spielkarte> karten = new ArrayList<>();
        karten.add(fuenf);
        karten.add(koenig);
        karten.add(zehn);
        karten.add(vier);
        karten.add(ass);

        // anonyme innere klasse
        karten.sort(new Comparator<Spielkarte>() {
            @Override
            public int compare(Spielkarte o1, Spielkarte o2) {
                return o1.bezeichnung.compareTo(o2.bezeichnung);
            }
        });

        // sortierung mit lambda
        karten.sort((o1, o2) -> o1.bezeichnung.compareTo(o2.bezeichnung));

        karten.forEach(k -> System.out.println(k));
    }

    @Override
    public int compareTo(Spielkarte that) {

        if (this.ordnung == 10 && that.ordnung == 10) {

            if (that.bezeichnung.equals("koenig")) {
                return -1;
            }

        }

        return this.ordnung - that.ordnung;

    }
}
