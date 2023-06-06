//input age and unpaid balance of 3 person. Calculate and print average age and average unpaid balance

import java.util.*;
class cal {
    int age, ub;
    public void read_data(int a, int b) {
        age = a;
        ub = b;
    }
    public cal result(cal x, cal y) {
        cal z = new cal();
        z.age = (age + x.age + y.age)/3;
        z.ub = (ub + x.ub + y.ub)/3;
        return(z);
    }
    public void show() {
        System.out.println("the age is: "+age+" unpaid balance is: "+ub);
    }
}
public class ReturnAsObj {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age and unpaid balance of person 1: ");
        int a1 = in.nextInt();
        int u1 = in.nextInt();
        System.out.print("Enter age and unpaid balance of person 2: ");
        int a2 = in.nextInt();
        int u2 = in.nextInt();
        System.out.print("Enter age and unpaid balance of person 3: ");
        int a3 = in.nextInt();
        int u3 = in.nextInt();

        cal c1 = new cal();
        cal c2 = new cal();
        cal c3 = new cal();
        cal c4 = new cal();
    
        c1.read_data(a1, u1);
        System.out.print("For person 1 ");
        c1.show();
        c2.read_data(a2, u2);
        System.out.print("For person 2 ");
        c2.show();
        c3.read_data(a3, u3);
        System.out.print("For person 3 ");
        c3.show();
        c4 = c1.result(c2,c3);
        System.out.print("For average ");
        c4.show();
    }
}