public class Printing
{
	public static void main(String[] args) {
		int[] a = {12, 20, 015};
		for(int i=0; i<a.length; i++) {
		    System.out.print(a[i] + " ");
		}
	}
}

//output: 12 20 13
//015 is in octal so convert it into decimal
// 015 --> number
// 210 --> index
//8 power index X number at the position + same  
