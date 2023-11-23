/*Given two strings of lowercase English letters,  and , perform the following operations:

1. Sum the lengths of  and .
2. Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
3. Capitalize the first letter in  and  and print them on a single line, separated by a space.
*/
import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int sum = A.length() + B.length();
        
        System.out.println(sum);
        
        int a, l = A.length(), m = B.length();
        if(l<=m)
            a =m;
        else
            a=l;
        
        for(int i=0; i<a; i++) {
            if(A.charAt(i) <= B.charAt(i)) {
                System.out.println("No");
                break;
            }
            else if(A.charAt(i) > B.charAt(i)) {
                System.out.println("Yes");
                break;
            }
        }
        
        String cap = A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(cap);
        
    }
}



