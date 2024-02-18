//print the max value of the array
public class Max_Item {
    public static void main(String args[]) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));
        System.err.println(For_Some_Range(arr,3,4));
    }
    
    static int max(int[] A) {
        int m=A[0];
        //if arrays is empty take
        // int m = Integer.MIN_VALUE;
        for(int i=1; i<A.length; i++) {
            if(A[i]>m) {
                m = A[i];
            }
        }
        return m;
    }

    // for some particular range
    static int For_Some_Range(int[] B, int start, int end) {
        int m2 = B[start];
        for (int i = start; i <= end; i++) {
            if (B[i] > m2)
                m2 = B[i];
        }
        return m2;
    }
}
