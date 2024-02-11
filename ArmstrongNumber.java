import java.util.*;

public class ArmstrongNumber
{
    
	public static void main(String[] args) {
  		System.out.println("Hello World");
  		Scanner in = new Scanner(System.in);
  		System.out.print("Enter number: ");
  		int num = in.nextInt();
  		System.out.println(isArmstrong(num));
	}
	
	static boolean isArmstrong(int n) {
	    int org = n;
	    int sum = 0;
	    while(n>0) {
	        int rem = n%10;
	        int cube = rem*rem*rem;
	        sum = sum + cube;
	        n = n/10;
	    }
	    return sum==org;
	}
}
