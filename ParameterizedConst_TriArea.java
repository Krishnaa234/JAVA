//program to find area of triangle using parameterized constructor
import java.util.Scanner;
class Area {
    double x,y,vol;
    Area(double h, double b) {
        x = h;
        y = b;
    }
    public double result() {
        vol = (x * y)/2;
        return(vol);
    }
}
public class ParameterizedConst_TriArea {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height of triangle: ");
        double H = in.nextDouble();
        System.out.print("Enter base of triangle: ");
        double B = in.nextDouble();
        in.close();
        Area ob = new Area(H,B);
        System.out.print("The area of triangle is: "+ ob.result());
    }
}