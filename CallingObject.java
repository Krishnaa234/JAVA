//program to find the tallest person among 3 people
import java.util.*;
class person {
    String nm;
    int h;
    public void read_value(String n, int H) {
        nm = n;
        h = H;
    }
    public person taller(person a, person b) {
        if(h>a.h && h>b.h)
            return(this);
        else if(a.h>h && a.h>b.h)
            return(a);
        else
            return(b);
    }
    public void result() {
        System.out.println("The tallest person is "+nm+" with height "+h);
    }
}
public class CallingObject {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name and height of 1st person: ");
        String n1 = in.next();
        int h1 = in.nextInt();
        System.out.print("Enter the name and height of 2nd person: ");
        String n2 = in.next();
        int h2 = in.nextInt();
        System.out.print("Enter the name and height of 3rd person: ");
        String n3 = in.next();
        int h3 = in.nextInt();
        in.close();
        person p1 = new person();
        person p2 = new person();
        person p3 = new person();
        person p4 = new person();
        p1.read_value(n1, h1);
        p2.read_value(n2, h2);
        p3.read_value(n3, h3);
        p4 = p1.taller(p2,p3);
        p4.result();
    }
}