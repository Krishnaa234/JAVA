import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int m=0;
        for(int i=0; i<nums.length; i++) {
            m = m ^ nums[i] ^ (i+1); //bitwise XOR operator
        }
        return m;
    }
}

public class Find_Missing_Number{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num[] = new int[n];
        Solution S = new Solution();
        S.missingNumber(num);
    }
}
