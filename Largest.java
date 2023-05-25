import java.util.*;
public class Largest{
    public static void main(String args[]) {
        Scanner get = new Scanner (System.in);
        System.out.print("Enter 1st value: ");
        double a = get.nextDouble();
        System.out.print("Enter 2nd value: ");
        double b = get.nextDouble();
        System.out.print("Enter 3rd value: ");
        double c = get.nextDouble();
        if (a>b && a>c)
            System.out.print(a + " is largest");
        else if (b>a && b>c)
            System.out.print(b + " is largest");
        else if (c>a && c>b)
            System.out.print(c + " is largest");
        else 
            System.out.print("Some value is equal");
    }
}