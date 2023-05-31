//Program to print array in descending order
import java.util.*;
public class DescendOrder {
    public static void main (String args[]) {
        int A[] = new int[5];
        Scanner in = new Scanner (System.in);
        for (int i=0; i<5; i++) {
            System.out.print("Enter a number: ");
            A[i] = in.nextInt();
        }
        for (int i = 0; i<5; i++) {
            for (int j=i+1; j<5; j++) {
                if (A[i]<A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        //Printing array
        System.out.println("New descending array is: ");
        for (int i=0; i<5; i++) {
            System.out.print(A[i]+"  ");
        }
    }
}