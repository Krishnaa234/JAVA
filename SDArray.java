import java.util.*;
public class SDArray {
    public static void main (String args[]) {
        int i,t=0;
        Scanner in = new Scanner (System.in);
        int num[] = new int[5];
        for (i=0; i<=4; i++) {
            System.out.print("Enter marks of subject: ");
            num[i] = in.nextInt();
            t = t + num[i];
        }
        double a = t/5;
        System.out.println("Total is: "+ t);
        System.out.println("The average is: "+ a);
        for(i=0; i<=4; i++) {
            System.out.println("Marks are: "+ num[i]);
        }
    }
}
