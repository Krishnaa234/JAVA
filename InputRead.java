//Write the appropriate code to read the 3 integer values and find their sum.

import java.util.*;
public class InputRead{ 
        public static void main (String[] args){
          int i,n=0,sum=0;
          Scanner in = new Scanner(System.in);
          for(i=0;i<3;i++)
          {
              n = in.nextInt();
              sum = sum+n;
          }
          System.out.println(sum);
  }
}
