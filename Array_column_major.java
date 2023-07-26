/*package whatever //do not write package name here 
Print the elements of the 2D array in column-major order.

Sample:
Input: Arr[3][3] = {{1,2,3}, {4,5,6}, {7,8,9}}
Output: 1 4 7 2 5 8 3 6 9
*/
import java.util.*;
class Array_column_major {
	public static void main (String[] args) {
		int[][] Arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		for(int i=0; i<3; i++) {
		    for(int j=0; j<3; j++) {
		        System.out.print(Arr[j][i] + " ");
		    }
		}
	}
}
