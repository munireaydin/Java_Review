package week07_review;
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of item 1");
        String answer = input.next();

        System.out.println("Enter the price of the " + answer);
        double price = input.nextDouble();

        System.out.println("How many "+ answer + " will you buy?");
        int amount = input.nextInt();

        System.out.println("Do you want to add more items to the shopping list?");
        String ans = input.next();

        int num = 2;

        while(ans.equals("yes")){
            System.out.println("Enter the name of item " + num);
            answer = input.next();
            num++;

            System.out.println("Enter the price of the " + answer);
            price = input.nextDouble();

            System.out.println("How many "+ answer + " will you buy?");
            amount = input.nextInt();

            System.out.println("Do you want to add more items to the shopping list?");
            ans = input.next();
        }




    }
}
