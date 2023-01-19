package week03_review;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // in: system input function // \n
        // Scanner is used for input that's why we can not use "System.out"
        System.out.println("Enter an integer: ");
        // input.nextInt();//it's waiting for me to write something on the console
        int num = input.nextInt(); // 12 \n
        System.out.println("You have entered " + num);

        System.out.println("Enter a decimal number: ");
        double num2 = input.nextDouble();

        System.out.println(" You have entered "+ num2);

        System.out.println("Are you employed?");

        String employed = input.nextLine();

        System.out.println( "employed = "+ employed);

        input.close();




    }
}
