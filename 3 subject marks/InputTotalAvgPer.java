//program to find 3 students total, average and percentage
import java.util.*;
public class InputTotalAvgPer {
    int a,b,c;
    Scanner in = new Scanner (System.in);
    public void read_data() {
        System.out.print("Enter marks of 3 subjects: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
    }
    public double cal() {
        int t = a + b +c;
        double avg = t/3;
        double per = (t*100)/150;
        System.out.println("The total marks is: "+t);
        System.out.println("The average is: "+avg);
        return(per);
    }
}
