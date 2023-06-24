//implement try with multiple catch 
//division of 2 arrays with respective element and storing in a new array 
import java.util.*;
class xyz {
    //initializing 3 arrays
    int x[] = new int[5];
    int y[] = new int[5];
    int z[] = new int[5];
    int i;
    public void division() {
        Scanner in = new Scanner(System.in);
        try {
            for(i=0; i<5; i++) {
                System.out.print("Enter 5 number as numerator: ");
                x[i] = in.nextInt();
            }
            for(i=0; i<5; i++) {
                System.out.print("Enter 5 number as denomenater: ");
                y[i] = in.nextInt();
            }
            for(i=0; i<5; i++) {
                z[i] = x[i]/y[i];
            }
            for(i=0; i<5; i++) {
                System.out.println("Result of division is: "+z[i]);
            }
        } catch(ArithmeticException ae) {
            System.out.println("Can not divide by zero");
        } catch(ArrayIndexOutOfBoundsException aio) {
            System.out.println("Array size not exist");
        }
        in.close();
    }
}   
public class Multiple_Catch {
    public static void main(String args[]) {
        xyz m = new xyz();
        m.division();
    }
}