// On the occurrence of such an exception, your program should print “Exception caught: Division by zero.” 
//If there is no such exception, it will print the result of division operation on two integer values.

import java.util.Scanner;
  
public class Zero_Exception {
public static void main(String[] args) { 
    int a, b;
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    b = input.nextInt();
    try {
        if(b==0) {
            ArithmeticException ae = new ArithmeticException();
            throw ae;
        }
        else{
            System.out.println(a/b);
        }
      } 
    catch(ArithmeticException ae) {
        System.out.println("Exception caught: Division by zero.");
    }
  }
}
