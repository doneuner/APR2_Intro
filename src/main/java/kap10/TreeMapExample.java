package kap10;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {

        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(123);
        zahlen.add(456);
        System.out.println(zahlen.get(0));
        System.out.println(zahlen.get(1));

        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("GB", "London");
        capitalCities.put("AT", "Wien");
        capitalCities.put("AT", "Innsbruck");
        System.out.println(capitalCities.get("AT"));
        System.out.println(capitalCities.get("DE"));

        for(String key : capitalCities.keySet()) {
            System.out.println(capitalCities.get(key));
        }

        capitalCities.forEach((k,v) -> System.out.println(v));



        HashMap<String, Integer> inhabitantsCities = new HashMap<>();
        inhabitantsCities.put("GB", 100987);


        // TreeSet
        TreeSet<String> set = new TreeSet<>();
        set.add("GB");
        set.add("AT");
        set.add("AT");
        set.add("adsf");
        System.out.println(set.contains("AT"));




    }
}
