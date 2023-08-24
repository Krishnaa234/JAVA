import java.util.*;

class Solution {
    public void rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int[] n = new int[nums.length/2];
        int[] p = new int[nums.length/2];
        int i=0, j=0;

        //for (T element:Collection obj/array)
        //goes till array length
        for(int num:nums) {
            if(num>0) {
                p[i++] = num;
            } else {
                n[j++] = num;
            }
        }

        for(int k=0, l=0; l<nums.length; l=l+2) {
            ans[l] = p[k]; //adding positive element in array ans
            ans[l+1] = n[k]; //adding negative element in array ans
            k++;
        }
        System.out.println();
		    System.out.print("New array is: ");
		    for(int x=0; x<ans.length; x++) {
		        System.out.print(ans[x] + ", ");
		    }
    }
}

public class RearrangeArray
{
  	public static void main(String[] args) {
    		Scanner in = new Scanner(System.in);
    		System.out.print("Enter size: ");
    		int s = in.nextInt();
    		int[] arr = new int[s];
      
    		System.out.print("Enter elements: ");
    		for(int i=0; i<arr.length; i++) {
    		    arr[i] = in.nextInt();
    		}
      
    		System.out.print("Array is: ");
    		for(int i=0; i<arr.length; i++) {
    		    System.out.print(arr[i] + ", ");
    		}
      
    		Solution S = new Solution();
    		S.rearrangeArray(arr);
  	}
}
