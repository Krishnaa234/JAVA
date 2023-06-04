import java.util.*;
public class AverageSales {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        int sales=0,avg;
        //int  as=0, alavg=0; 
        int A[][] = new int[5][3];
        for(int i=0; i<5; i++) {
            System.out.print("Enter the monthly sales for "+i+"th salesmen: ");
            for(int j=0; j<3; j++) {
                A[i][j] = in.nextInt();
            }
        }
        System.out.println("The monthly sales of an year are: ");
        for(int i=0; i<5; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.print("Enter salesman number from 0 to 4 for monthly average sales: ");
        int x = in.nextInt();
        while (true) {
            for(int j=0; j<3; j++) {
                sales = sales + A[x][j];
            }
            break;
        }
        avg = sales/3;
        System.out.println("The average monthly sales of "+x+"th salesmen is: "+ avg);
    }
}