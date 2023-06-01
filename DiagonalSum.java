import java.util.Scanner;
public class DiagonalSum {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        int A[][] = new int[4][4], d1=0, d2=0;
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print("Enter matrix elements in row by row fasion: ");
                A[i][j] = in.nextInt();
            }
        }
        System.out.println("The 4x4 matrix is: ");
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<4; i++) {
            for(int j=0; j<4; j++) {
                if(i==j) 
                    d1 = d1 + A[i][j];
                if ((i+j)==3)
                    d2 = d2 +A[i][j];
            }
        }
        System.out.print("The diagonal sum is: "+ (d1+d2));
    }
}