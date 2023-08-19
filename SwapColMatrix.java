import java.util.*;
class Swap{
    static void interchange(int a[][],int r, int c){  
        
        for(int i = 0;i<r;i++){
            int temp = a[i][0];
            a[i][0] = a[i][c-1];
            a[i][c-1] = temp;
        }

        //printing of array
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
    }
}
public class SwapColMatrix{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int a[][] = new int[row][col];
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        a[i][j] = in.nextInt();
      }
    }
    Swap obj = new Swap();
    obj.interchange(a, row, col);
  }
}
