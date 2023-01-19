package week03_review;
import  java.util.Scanner;
public class NextLineMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //  Munire aydin\n

        System.out.println("fullName = " + fullName);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //29

        input.nextLine(); // before we use the nextLine method!!
                          // in order to clear the scanner
        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("schoolName = " + schoolName);





    }
}
