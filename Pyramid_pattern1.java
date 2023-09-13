'''
Input : 5
Output:  

        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
25
'''
import java.util.*;
public class Pyramid_pattern1 {
    public static void main(String[] args) {
       Scanner inr = new Scanner(System.in);
       System.out.print("Enter height of pyramid: "); 
       int n = inr.nextInt();        
       int k = 0, total=0;
       for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n - i; ++j) {
                System.out.print("  ");
            }
            k = 0;
            while(k != 2 * i - 1) {
                System.out.print("* ");
                total+=1;
                ++k;
            }
            System.out.println();
       }
       System.out.println("Number of stars: " + total);
    }
}
