package kap10;

import java.util.Scanner;

public class Cli {

    public static void main(String[] args) {

        cliUnSafe();
//        cliSafe();
  //      cliExceptionHandling();
    }

    public static void cliUnSafe() {
        Scanner scan = new Scanner(System.in);
        String input = "";
        int[] zahlen = new int[10];

        do{
            System.out.println("Enter command: add 34 0, get 0, exit");
            input = scan.nextLine();

            String[] parts = input.split(" ");
            String cmd = parts[0];

            // get value at position
            if (cmd.equals("get")) {
                int index = Integer.parseInt(parts[1]);
                System.out.println("Wert an Position " + index + " ist: " + zahlen[index]);
            }

            // add value at position
            if (cmd.equals("add")) {
                int value = Integer.parseInt(parts[1]);
                int index = Integer.parseInt(parts[2]);
                zahlen[index] = value;
            }

            System.out.println("---------------------------");
            for (int i = 0; i < zahlen.length; i++) {
                System.out.print(zahlen[i] + " ");
            }
            System.out.println();

        }while(!input.equals("exit"));
    }

}
