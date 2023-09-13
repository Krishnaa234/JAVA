'''
input: 5
output: 
        1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
95
'''
import java.util.*;
  public class Pyramid_Pattern3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	      int n = inr.nextInt();
        int k = 1,total=0;
        for(int i = 1; i <= n; ++i, k = 1)
        {
              for(int j = 1; j <= n-i; ++j)
              {
                  System.out.print("  ");
              }
              while(k <= 2 * i - 1) {
                  System.out.print(k+" ");
                  total = total + k;
                  ++k;
              }
              System.out.println();
        }
        System.out.println(total);
    }
}
