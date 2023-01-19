package week04_review;

import java.util.Scanner;

public class CombineTwoWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s1 = input.next();
        String s2 = input.next();

        /* // this optional solution
        String result = "";
        if (s1.charAt(s1.length()-1) == s2.charAt(0)) {
            result = s1 + s2.substring(1);
        }

        System.out.println(result);

        */


        if (s1.charAt(s1.length()-1) == s2.charAt(0)){
            System.out.println(s1 + s2.substring(1));
        }else {
            System.out.println(s1 + s2);
        }

    }
}
