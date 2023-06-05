//program which access class members and function calling with argument 
//ex: input radius of circle and calculate it's area and print

import java.util.*;
class circle {
    double ar;
    public double area(double r) {
        ar = 3.14 * r * r;
        return (ar);
    }
}

public class ClassMemWithArgument {
    public static void main(String args[]) {
        System.out.print("Enter radius of circle: ");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        circle obj = new circle();
        System.out.println("The area of circle with radius "+r+" is: "+ obj.area(r));
    }
}