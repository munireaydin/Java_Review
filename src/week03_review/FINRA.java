package week03_review;

public class FINRA {
    public static void main(String[] args) {

        int number = 17;
        String result = "";

        if (number>0) { // it is given in the task that the numbers should be positive

            if (number % 3 == 0 && number % 5 == 0) {

                // false && true = false
                result = "FINRA";
            } else if (number % 3 == 0) {
                result = "FIN";
            } else if (number % 5 == 0) {
                result = "RA";
            } else {
                result = "" + number;
            }

            System.out.println(result);

        }
    }
}
