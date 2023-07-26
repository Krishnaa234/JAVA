/*package whatever //do not write package name here 
Print the elements of the 2D array in row-major order.

Sample:
Input: Arr[3][3] = {{1,2,3}, {7,8,9}, {4,5,6}}
Output: 1 2 3 7 8 9 4 5 6
*/

import java.util.*;

class Array_row_major {
	public static void main (String[] args) {
		int[][] Arr = {{1,2,3}, {7,8,9}, {4,5,6}};
		for(int i=0; i<3; i++) {
		    for(int j=0; j<3; j++) {
		        System.out.print(Arr[i][j] + " ");
		    }
		}
		
	}
}
