import java.util.*;
public class sum_of_first_n {
    public static void main(String args[]) {
        System.out.print("Enter last limit of number: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++) {
            sum = sum + i;
            System.out.println("Intermediate sum: " + sum);
        }
        System.out.println("Total sum: " + sum);
    }
}
