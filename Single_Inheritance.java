/* implement single inheritance to find the total amount of bill to be paid
    Product         Bill
     pcode       up (unit price)
                 qty (quantity)
      pnm           bamt
   read_data()   input_data()
    display()     billing()
 */
import java.util.*;
class Product {
    int pcode;
    String pnm;
    Scanner in = new Scanner(System.in);
    public void read_data() {
        System.out.print("Enter 6 digit product code: ");
        pcode = in.nextInt();
        System.out.print("Enter product name: ");
        pnm = in.next();
    }
    public void display() {
        System.out.println("The product code is: "+pcode);
        System.out.println("The product name is: "+pnm);
    }
} 

class Bill extends Product{
    double up;
    double bamt;
    int qty;
    public void input_data() {
        System.out.print("Enter unit price of the product: ");
        up = in.nextDouble();
        System.out.print("Enter quantity purchased: ");
        qty = in.nextInt();
        bamt = up * qty;
    }
    public void billing() {
        System.out.println("The total bill is:");
        System.out.println("Product name       Unit price        Number of products");
        System.out.println(pnm+ "               $"+up+"                 "+qty);
        System.out.println("-------------------------------------------");
        System.out.println("Net bill                                $"+bamt);
    }
}

public class Single_Inheritance {
    public static void main(String args[]) {
        Bill B = new Bill();
        B.read_data();
        B.input_data();
        B.display();
        B.billing();
    }
}