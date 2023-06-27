//demonstrate the user defined exception handling mechanism
import java.util.*;
class xyz extends Exception {
    public String toString() {
        return "Less than 10";
    }
}
class pqr extends Exception {
    public String toString() {
        return "Greater than 10";
    }
}
public class User_Defined_Exception {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a = in.nextInt();
            in.close();
            if(a>10)
                throw new pqr();
            else if(a<10)
                throw new xyz();
            else
                System.out.print("Perfect 10");
        } catch(xyz me) {
            System.out.println(me);
        } catch(pqr ae) {
            System.out.println(ae);
        }
    }
}