package kap10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        int[] array = new int[10];
        array[0] = 1; // set oder add
        System.out.println(array[0]); // get

        ArrayList<String> namen = new ArrayList<>();
        namen.add("John");
        namen.add("Jane");
        namen.add("Bob");
        namen.add(0, "Max");
        System.out.println(namen.size());

        System.out.println(namen.get(3));
        namen.set(3, "Nicht mehr Bob");
        System.out.println(namen.get(3));

        namen.remove("Max");

        // mittelwert variante 1
        double d = 0;
        for (int i = 0; i < namen.size(); i++) {
            d += namen.get(i).length();
        }
        double mittelwert = d/namen.size();
        System.out.println(mittelwert);

        // mittelwert variante 2
        mittelwert = namen.
                stream().
                mapToInt(n -> n.length()).
                average().
                getAsDouble();




    }

}
