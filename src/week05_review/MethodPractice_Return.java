package week05_review;

public class MethodPractice_Return {
    public static void main(String[] args) {


    }

    public static double calculate(double num1,char mathOperator, double num2){
        double result = 0;

        switch (mathOperator){

            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if (num2 != 0){
                    result = num1/num2;
                }
               break;
/*
            default:
                System.err.println("Invalid operator");
                System.exit(1); // terminates the whole program.everything will stop
*/
        }


        return result;



    }




}
