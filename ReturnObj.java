//Adding objects of 2 integers returning the result in another object 

import java.util.*;
class xyz {
    int a,b;
    public void read_data(int x, int y) {
        a = x;
        b = y;
    }
    public xyz sum(xyz m) {
        xyz k = new xyz();
        k.a = a + m.a;
        k.b = b + m.b;
        return(k);
    }
    public void show() {
        System.out.println("X is: "+a+" Y is: "+b);
    }
}
public class ReturnObj {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        xyz ob1 = new xyz();
        xyz ob2 = new xyz();
        xyz ob3 = new xyz();

        System.out.print("Enter value of x1 and y1: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("Enter value of x2 and y2: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        
        ob1.read_data(x1, y1);
        ob2.read_data(x2, y2);
        ob3 = ob1.sum(ob2);
        System.out.print("Object 1 is: ");
        ob1.show();
        System.out.print("Object 2 is: ");
        ob2.show();
        System.out.print("Object 3 is: ");
        ob3.show();
    }
}