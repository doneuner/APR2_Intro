package kap10;

import java.util.Scanner;

public class StringArrayExamples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie die Größe ein:");
        int length = sc.nextInt();

        String[] namenliste = new String[length];

        namenliste[0] = "adf";
        namenliste[100] = "adf";


    }
}
