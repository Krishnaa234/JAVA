'''
input: 8
output :
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 
'''
import java.util.*;
public class Pyramid_Pattern2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	    int l = inr.nextInt();
      int i,j,r=l-1;
        for(i=0;i<l;i++)
        {
          for(j=0;j<r;j++)
          {
              System.out.print(" ");
          }
          for(j=0;j<=i;j++)
          {
              System.out.print("* ");
          }
          System.out.print("\n");
          r--;
        }
    }
}
