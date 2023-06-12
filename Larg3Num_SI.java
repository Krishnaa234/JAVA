//program to find largest number between 3 numbers and calculating Simple Interest
 
import java.util.*;
public class Larg3Num_SI {
    static void find(double x, double y, double z) {
        if(x>y && x>z)
            System.out.println(x + " is greatest");
        else if(y>x && y>z) 
            System.out.println(y + " is greatest");
        else 
            System.out.println(z + " is greatest");
    }
    static void find(double P, double R, int T) {
        double SI = (P*R*T)/100;
        System.out.println("Simple interest is: "+SI);
        System.out.println("You exit");
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers: \n1st: ");
        double a = in.nextDouble();
        System.out.print("2nd: ");
        double b = in.nextDouble();
        System.out.print("3rd: ");
        double c = in.nextDouble();
        find(a,b,c);
        System.out.println("For Simple interest: ");
        System.out.print("Enter principle: ");
        double p = in.nextDouble();
        System.out.print("Enter rate: ");
        int r = in.nextInt();
        System.out.print("Enter time: ");
        int t = in.nextInt();
        in.close();
        find(p,r,t);
    }
}
