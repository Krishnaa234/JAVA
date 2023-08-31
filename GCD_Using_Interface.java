//This program is to find the GCD (greatest common divisor) of two integers writing a recursive function findGCD(n1,n2). 
//Your function should return -1, if the argument(s) is(are) other than positive number(s).

import java.util.Scanner;

interface GCD {
    public int findGCD(int n1,int n2);
}

//Create a class B, which implements the interface GCD.

class B implements GCD {
  	int gcd=1;
    public int findGCD(int n1, int n2) {
      if(n1%2!=0 || n2%2!=0)
        return -1;
      else if(n1==0)
        return n2;
      else if(n2==0)
        return n1;
      else {
        for(int i = 1; i <= n1 && i <= n2; i++)  
        {  
            if(n1%i==0 && n2%i==0)  
              gcd = i;
        }
        return gcd;  
      }
    }
}

public class GCD_Using_Interface{ 
    public static void main (String[] args){ 
		      B a = new B();
	        Scanner sc = new Scanner(System.in);  
	        int p1 = sc.nextInt();
	        int p2 = sc.nextInt();
	        System.out.print(a.findGCD(p1,p2)); 
    } 
}
