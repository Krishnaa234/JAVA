//calculate area of triangle and simple interest in 2 different class.
//show the use of super() keyword
import java.util.*;
class tri {
    double b,h,ar;
    tri(double x, double y) {
        b=x;
        h=y;
    }
    void area() {
        ar = (b*h)/2;
        System.out.println("Area of triangle is: "+ar);
    }
}

class SI extends tri {
    double p,r,t,si;
    SI(double x, double y, double z) {
        super(x,y);
        p=x;
        r=y;
        t=z;
    }
    void simint() {
        si = (p*r*t)/100;
        System.out.println("The simple interest is: "+si);
    }
}

public class Constructor_Inheritance {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of base/principle: ");
        double d1 = in.nextDouble();
        System.out.print("Enter value of height/rate: ");
        double d2 = in.nextDouble();
        System.out.print("Enter value of time for simple interest: ");
        double t = in.nextDouble();
        SI s = new SI(d1,d2,t);
        s.area();
        s.simint();
        in.close();
    }
}