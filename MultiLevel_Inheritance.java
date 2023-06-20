/* implement multilevel inheritance in a shop, customer and find the net bill and total discount

    Shop            Customer            Bill
     pcode       up (unit price)        dis
                 qty (quantity)         amt
      pnm             bamt            dis_cal()
   input_data()    get_data()         billing()
    display()        show()
 */

import java.util.*;

class Shop {
    Scanner in = new Scanner(System.in);
    int pcode;
    String pnm;
    public void input_data() {
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

class Customer extends Shop {
    double up, bamt;
    int qty;
    public double get_data() {
        input_data();
        System.out.print("Enter unit price of the product: ");
        up = in.nextDouble();
        System.out.print("Enter quantity purchased: ");
        qty = in.nextInt();
        bamt = up * qty;
        return(qty);
    }
    public void show() {
        display();
        System.out.println("The product "+pnm+" purchased at a unit price of "+up+" at "+qty+" quantity.");
    }
} 

class Bill extends Customer {
    double dis, amt, q;
    public void discount_cal() {
        q = get_data();
        show();
        if(q>100)
            dis = bamt * 0.30;
        else if(q>50)
            dis = bamt * 0.20;
        else if(q<=50)
            dis = bamt * 0.10;
        amt = bamt - dis;
    }
    public void billing() {
        System.out.println("The total bill is:");
        System.out.println("Product name       Unit price        Number of products");
        System.out.println(pnm+ "             $"+up+"                 "+qty);
        System.out.println("-------------------------------------------");
        System.out.println("Total price                             $"+bamt);
        System.out.println("Discount                                $"+dis);
        System.out.println("Net bill                                $"+amt);
    }
}
public class MultiLevel_Inheritance {
    public static void main(String args[]) {
        Bill B = new Bill();
        B.discount_cal();
        B.billing();
    }
}