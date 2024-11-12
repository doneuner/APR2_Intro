package kap7;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String s1 = "ABC";
        //String s2 = "ABC";//new String("ABC");
        String s2 = new String("ABC");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        Player p1 = new Player("NEUN");
        Player p2 = new Player("NEUN");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p1.equals(p2));

        System.out.println("ABCDE".compareTo("ABCD"));
        System.out.println(s1.indexOf("X"));
        s1 += "adsaf";
        s1.concat("asdf");
        s1 += String.valueOf(4L);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            s1 += "a";
            sb.append(s1);
        }

        Integer i = 5;
        //i = null;

        int j = i;
        j = 0;

        List<Integer> list;

        // Date / Time
        long start = System.nanoTime();

        // komplexe aufgabe

        long end = System.nanoTime();

        long diff = end-start;
        System.out.println(diff);

        System.out.println(Instant.MIN);
        System.out.println(Instant.now().plus(10, ChronoUnit.MINUTES));
    }

}
