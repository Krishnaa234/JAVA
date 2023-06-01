import java.util.*;
public class SmallNumMaxMin {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter only negative number: ");
        System.out.print("Max is: ");
        int max = in.nextInt();
        int min = max;
        System.out.println("Min is: "+ min);
        System.out.println("Zero is end of program & positive number continues till 0 is entered: ");
        while (true) {
            System.out.print("Enter negative number: ");
            int a = in.nextInt();
            if (a>0)
                continue;
            if (a==0)
                break;
            if (a<min)
                min = a;
            if (a>max)
                max = a;
        }
        System.out.println("Greatest number is: "+ max);
        System.out.println("Smallest number is: "+ min);
    }
}
