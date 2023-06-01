import java.util.*;
public class AgeMajorMinor {
    public static void main (String args[]) {
        int age[] = new int[10], minor=0, major=0;
        Scanner in = new Scanner (System.in);
        for( int i=0, k=1; i<10; i++,k++) {
            System.out.print("Enter age of "+k+"th person: ");
            age[i] =in.nextInt();
            //For major person
            if(age[i]>=18)
                major++;
            //For minor person
                else 
                minor++;
        }
        System.out.println("The number major person are: "+major);
        System.out.println("The number of minor person are: "+minor);
    }
}