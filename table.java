import java.util.*;
public class table {
    public static void main(String args[]) {
        System.out.print("Enter the number for table: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        for(int i=1; i<11; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}