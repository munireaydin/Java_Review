package week07_review;
import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        int result = 0;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
                result ++;
            }

        }


        System.out.println(result);










    }
}
/*
 Input:
    abc hi how

  Output:
    1

 Input:
    hihi bye

  Output:
    2
     Input:
    apple

  Output:
    0
 */