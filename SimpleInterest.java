import java.util.*;
public class SimpleInterest {

    //Function to calculate marks total
    static int tm(int a, int b, int c) {
        int to = a+b+c;
        return (to);
    }
    
    //Function to calculate average of marks
    static double avg(int a, int b, int c) {
        int tm = a+b+c;
        double av = (tm)/3;
        return (av);
    }

    //Function to calculate percentage
    static double per(int a, int b, int c) {
        int tm = a+b+c;
        double p = (tm * 100)/150;
        return (p);
    }
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter marks of Maths out of 50: ");
        int m = in.nextInt();
        System.out.print("Enter marks of C out of 50: ");
        int c = in.nextInt();
        System.out.print("Enter marks of JAVA out of 50: ");
        int j = in.nextInt();
        System.out.println("Total marks are: "+tm(m,c,j));
        System.out.println("Average is: "+avg(m,c,j));
        System.out.println("Percentage is: "+per(m,c,j));
    }
}