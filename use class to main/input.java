import java.util.*;
public class input {
    int a,b,c;
    public void read_data() {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter 3 integers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
    }
    public void result() {
        int max, min;
        if (a>b) {
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }
        if (c>max) 
            max = c;
        if (c<min)
            min = c;
        System.out.println("The largest number is: "+max);
        System.out.println("The smallest number is: "+min);
    }
}
