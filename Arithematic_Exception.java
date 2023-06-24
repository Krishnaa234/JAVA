//implement arithmetic exception
import java.util.*;
class xyz {
    int x,y,z;
    xyz(int a, int b) {
        x= a;
        y = b;
    }
    public void division() {
        try {
            z = x/y;
            System.out.println("Result of division is: "+z);
        } catch (ArithmeticException ae) {
            System.out.println("Entered denominator as 0");
        }
    }
}
public class Arithematic_Exception {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of numerator: ");
        int a = in.nextInt();
        System.out.print("Enter value of denominator: ");
        int b = in.nextInt();
        xyz obj = new xyz(a,b);
        obj.division();
        in.close();
    }
}