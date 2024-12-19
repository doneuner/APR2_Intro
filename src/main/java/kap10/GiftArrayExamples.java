package kap10;

import kap9.Gift;
import kap9.GiftNameInvalidException;
import kap9.GiftNumberInvalidException;

import java.util.Scanner;

public class GiftArrayExamples {
    public static void main(String[] args) {

        Gift[] gifts = new Gift[10];
        try {
            gifts[4] = new Gift("123", "PS5");
        } catch (GiftNumberInvalidException e) {
            e.printStackTrace();
        } catch (GiftNameInvalidException e) {
            e.printStackTrace();
        }

        int[][] koordinaten = new int[10][10];


    }
}
