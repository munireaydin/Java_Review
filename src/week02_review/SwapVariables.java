package week02_review;

public class SwapVariables {

    public static void main(String[] args) {

        // with a temporary variable

        int x = 100;
        int y = 200;
        int z = x; // z=100

       // x=   --> assigment operator

        x = y; // x=200,x will have the value of y, x will have lo longer the ORIGINAL value

        y = z; // y will have z's value which is the original value of x

        System.out.println("x = " + x);  // 200
        System.out.println("y = " + y); //100

        System.out.println("--------------------------");

        // without temporary variable

        int a = 10;
        int b = 20;

        a += b;
        a = a + b ;// a= 30 // a is now equal to the sum of original values of a & b
        b = a - b ; // b = 10

        // a = a - b //
        a -=b;




    }
}
