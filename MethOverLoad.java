//write a program to calculate area of circle and rectangle using method overloading

import java.util.*;
class calc {
    public double area(double R) {
        double ar = 3.14 * R * R;
        return(ar);
    }
    public double area(double l, double w) {
        double ar = l * w;
        return (ar);
    }
}

public class MethOverLoad {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter radius of circle: ");
        double r = in.nextDouble();
        calc c = new calc();
        System.out.println("The area of circle is: "+c.area(r));
        System.out.print("Enter length of rectangle: ");
        double x = in.nextDouble();
        System.out.print("Enter bredth of rectangle: ");
        double y = in.nextDouble();
        System.out.println("The area of rectangle is: "+c.area(x,y));
    }
}
