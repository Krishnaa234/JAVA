//Program to print array in Ascending order
import java.util.*;
public class AscendOrder {
    public static void main (String args[]) {
        int A[] = new int[5];
        Scanner in = new Scanner (System.in);
        for (int i=0; i<5; i++) {
            System.out.print("Enter a number: ");
            A[i] = in.nextInt();
        }
        for (int i = 0; i<5; i++) {
            for (int j=i+1; j<5; j++) {
                if (A[i]>A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        //Printing array
        System.out.println("New Ascending array is: ");
        for (int i=0; i<5; i++) {
            System.out.print(A[i]+"  ");
        }
    }
}