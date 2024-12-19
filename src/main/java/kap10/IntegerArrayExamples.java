package kap10;

import java.util.Scanner;

public class IntegerArrayExamples {
    public static void main(String[] args) {

        // noten
        int[] noten = new int[10];
        int[] noten2 = {1,3,4,5,2,3,2};

        noten[0] = 3;
        noten[4] = 5;

        try {
            noten[17] = 4;
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < noten.length) {
            noten[index] = 1;
        } else {
            System.out.println("Invalid index");
        }


    }
}
