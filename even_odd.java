import java.util.*;
public class even_odd {
    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        if (x%2 == 0) {
            System.out.println("Number is even.\n");
        }
        else {
            System.out.println("Number is Odd.");
        }
    }
}
