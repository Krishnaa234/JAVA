import java.util.*;
public class greatest_num {
    public static void main(String args[]) {
        System.out.print("Enter number a: ");
        Scanner num = new Scanner(System.in);
        float a = num.nextFloat();
        System.out.print("Enter number b: ");
        float b = num.nextFloat();
        if (a==b) {
            System.out.println("Numbers are same.");
        }
        else if (a>b) {
            System.out.println("A is greater.");
        }
        else {
            System.out.println("B is greater.");
        }
    }
}
