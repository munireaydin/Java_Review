package week03_review;
import  java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        System.out.println("Enter a math operator:");
        char operator = input.next().charAt(0);

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("operator = " + operator);


    }
}
