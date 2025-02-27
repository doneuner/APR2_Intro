package kap11;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextDateiDemo {

    public static void main(String[] args) {

        String fileName = "daten.txt";

        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

        try (FileReader reader = new FileReader(fileName, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line: " + line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            bufferedWriter.write("Hello Wo\nrld");
            bufferedWriter.write("Hello World");
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
