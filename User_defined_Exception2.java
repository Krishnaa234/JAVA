//throws exception if quantity is less than 10 and unit price is less than 0
import java.util.*;
class xyz extends Exception {
    public String toString() {
        return "Not acceptable data";
    }
}

public class User_defined_Exception2 {
    public static void main(String args[]) {
        int qty, up, amt;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the quantity sold: ");
            qty = in.nextInt();
            System.out.print("Enter unit price: ");
            up = in.nextInt();
            in.close();
            if(qty<10 || up<0)
                throw new xyz();
            amt =up*qty;
            System.out.println("Amount: "+amt);
        } catch(xyz x) {
            System.out.println(x);
        } catch(Exception e) {}
    }
}