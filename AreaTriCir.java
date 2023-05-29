import java.util.*;
public class AreaTriCir {
    public static void main (String args[]) {
        double area;
        System.out.print("Enter 1 to find the area of triangle.\nEnter 2 to find the area of circle: ");
        Scanner in = new Scanner (System.in);
        int c = in.nextInt();
        switch (c) {
            case 1: System.out.print("Enter value of base: ");
                    double b = in.nextDouble();
                    System.out.print("Enter the value of height: ");
                    double h = in.nextDouble();
                    area = (b*h)/2;
                    System.out.print("The area of triangle is: " + area);
                    break;
            case 2: System.out.print("Enter the value of radius: ");
                    double r = in.nextDouble();
                    area = 3.14 * Math.pow(r,2);
                    System.out.print("The area of circle is: " + area);
                    break;
            default: 
                    System.out.print("Entered a wrong value.");
        }
    }
}
