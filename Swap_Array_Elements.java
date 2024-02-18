//swap first and last array element till the center of the array 
//start++ and end--
// TWO POINTER METHOD

import java.util.*;

public class Swap_Array_Elements {
    public static void main(String args[]) {
        int[] arr = {1, 3, 23 ,9 ,18,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] A){
        int s = 0, e = A.length -1; //last index is 1 less than the array length
        while(s<e){
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
    }
}
