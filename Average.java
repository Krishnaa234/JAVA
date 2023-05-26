import java.util.*;
public class Average {
    public static void main (String args[]) {
        int t=0, avg, c=0;
        while (true) {
            System.out.print("Enter a number: ");
            Scanner num = new Scanner (System.in);
            int n = num.nextInt();
            if (n<0)
                continue;
            if (n==0)
                break;
            t = t + n;
            c++;
        }
        avg = t/c;
        System.out.println("The average is: "+ avg);
    }
}
