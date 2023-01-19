package week06_review;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        for (int m = 2; m >= 0; m--) {

            for (int s = 59; s >0 ; s--) {
                System.out.println(m + " minutes "+ s + " seconds ");
                Thread.sleep(1000); // tek tel sayilarin ciktisini yavas yavas aliyo

            }

        }



    }
}
