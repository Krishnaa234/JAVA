//program to implement super() keyword in constructors in inheritance
import java.util.*;
class A {
    int a;
    A(int x) {
        a=x;
    }
    void show() {
        System.out.println("Value of x: "+a);
    }
}

class B extends A {
    int b;
    B(int x, int y) {
        super(x);
        b=y;
    }
    void display() {
        System.out.println("Value of y: "+b);
    }
}

class C extends B {
    int c;
    C(int x, int y, int z) {
        super(x,y);
        c=z;
    }
    void print() {
        System.out.println("Value of z: "+c);
    }
}

public class Const_Inhertance {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 integer values: \n1st: ");
        int x = in.nextInt();
        System.out.print("2nd: ");
        int y = in.nextInt();
        System.out.print("3rd: ");
        int z = in.nextInt();
        C obj = new C(x,y,z);
        obj.show();
        obj.display();
        obj.print();
        in.close();
    }
}