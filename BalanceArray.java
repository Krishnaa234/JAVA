//ind minimum value that can be added to an element so that array become balanced. 
//An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.

class Solution
{
    long minValueToBalance(long a[] ,int n)
    {       
        int m=n/2;
        long sumf=0, suml=0, diff=0;
        for(int i=0; i<m; i++) {
            sumf = sumf + a[i];
        }
        for(int j=m; j<n; j++) {
            suml = suml + a[j];
        }
        
        if(sumf == suml){
            return sumf;
        }
            
        else if(suml>sumf) {
            diff = suml - sumf;
            sumf = sumf + diff;
            return diff;
        }
        else {
            diff = sumf - suml;
            suml = suml + diff;
            return diff;
        }
    }
}
