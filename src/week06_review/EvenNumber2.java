package week06_review;

import java.util.Scanner;

public class EvenNumber2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num= 0;

        do{
            System.out.println("Enter a number:");
            num = input.nextInt();
        }while (num %2 !=0);

        System.out.println(num);


    }
}
