//progarm for parameterized constructor
//To find the volume of cuboid

import java.util.*;
class result {
    double l,b,h;
    result(double a, double d, double c) {
        l=a;
        b=d;
        h=c;
    }
    result() {
        System.out.println("cbciuw");
    }
    public double vol() {
        double v = l*b*h;
        return(v);
    }
}
public class ParameterizedConst {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter cuboid length: ");
        double a = in.nextDouble();
        System.out.print("Enter cuboid breath: ");
        double d = in.nextDouble();
        System.out.print("Enter cuboid heigth: ");
        double c = in.nextDouble();
        in.close();
        result V = new result(a,d,c);
        System.out.print("The volume of cuboid is: "+ V.vol());
    }
}
