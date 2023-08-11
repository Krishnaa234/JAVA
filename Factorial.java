//Create a program to find the factorial of a given number.
import java.util.*;
class fact{
    public int find_fact(int num) {
        int f=1;
        for(int i=1; i<=num; i++) {
            f = f * i;
        }
        return f;
    }
}
public class Factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to find factorial: ");
        int n = in.nextInt();
        fact F = new fact();
        System.out.println("The factorial is: " + F.find_fact(n));
        in.close();
    }
}
