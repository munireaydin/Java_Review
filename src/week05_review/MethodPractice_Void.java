package week05_review;

public class MethodPractice_Void {

    public static void main(String[] args) {

     calculator(10,'+',20);
     calculator(25,'#',34);
     calculator(23,'/',0);
     calculator(-10,'+',-20);
    }

    public static void calculator(double num1,char mathOperator, double num2){

        if ( num1<0 || num2<0 ){
            System.out.println( num1+ " or " + num2+ " are not positive");
            return; //exit the method
        }

        switch (mathOperator){
            case '+':
                System.out.println("Addition is: " + (num1 + num2));
                break;
            case'-':
                System.out.println("Subtraction is: " + (num1 + num2));
                break;
            case '*':
                System.out.println("Multiplication is: " + (num1 + num2));
                break;
            case '/':
                if (num2!= 0){
                    System.out.println("Division is: " + (num1 + num2));
                }else{
                    System.out.println( num1 + " is not divisible by 0");
                }
                break;
            default:
                System.out.println("Invalid math operator");







        }


    }






}
/*
 Create a method named calculate that accespt three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)

        if the operator is +:
                the method should return the addition of the two numbers

        if the operator is -:
                the method should return the subtraction of the two numbers

        if the operator is *:
                the method should return the multiplication of the two numbers

        If the operator is /:
                if denominator is NOT zero:
                    then the method should return the division

        for any other operators, the method should return 0
 */