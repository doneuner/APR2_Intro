package kap10;

import java.util.Arrays;
import java.util.Random;

public class Temperaturmesswerte {

    public static void main(String[] args) {

        // double array
        // 365 zufallszahlen, bereich -20 bis 40
        // mittelwert

        double[] messwerte = new double[36500];

        // fuellen
        for (int i = 0; i < messwerte.length; i++) {
            // -20 bis 40
            messwerte[i] = Math.random() * 60 - 20;
        }

        // ausgabe
        for (Double m : messwerte) {
            System.out.println(m);
        }

        // mittelwert:
        double mittelwert = 0;
        for (int i = 0; i < messwerte.length; i++) {
            mittelwert += messwerte[i];
        }
        mittelwert /= messwerte.length;
        System.out.println(mittelwert);

        // mittelwert kurz
        System.out.println(Arrays.stream(messwerte).average().getAsDouble());


        // string array
        // 10 namen eintragen
        // kürzesten namen finden
        // längsten namen finden
        // mittelwert aller namenlängen




    }

}
