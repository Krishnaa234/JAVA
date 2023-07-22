//find the min and max element in the array
import java.util.*;
class find{
    public void dataInput(int arr[], int n) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter array elements:");
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        
        in.close();
        System.out.print("The array is: {");
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " , ");
        }
        System.out.println("}");
    }
    public int findMin(int arr[], int n) {
        int tempMin = arr[0];
        for(int i=1; i<n; i++)
            tempMin = Math.min(tempMin, arr[i]);
        return tempMin;
    }

    public int findMax(int arr[], int n) {
        int tempMax = arr[0];
        for(int j=1; j<n; j++) {
            tempMax = Math.max(tempMax, arr[j]);
        }
        return tempMax;
    }
}

public class array_max_min{
    public static void main(String args[]) {
        find F = new find();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        F.dataInput(arr, n);
        System.out.println("The minimum value in array is: "+ F.findMin(arr, n));
        System.out.println("The maximum value in array is: "+ F.findMax(arr, n));
        in.close();
    }
}