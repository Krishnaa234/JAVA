//prime number
import java.util.*;
public class PrimeNum{
    public static void main(String rags[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enetr a number to check: ");
        int n = in.nextInt();
        int count=0, m;
        if(n==2) {
            System.out.print(n + " is a prime number");
        }
        else {
            for(int i=1; i<=n; i++) {
                if(n%i==0)
                    count++;
            }
            if(count==2)
                System.out.println(n + " is a prime number");
            else
                System.out.println(n + " is not a prime number");
        }
    }
}