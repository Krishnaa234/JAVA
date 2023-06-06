//input 3 ages and names and check which are same. Solve using class object as parameters  
import java.util.*;
class same_age {
    int age;
    String name;
    public void read_data(int a, String b) {
        age = a;
        name = b;
    }
    public boolean check_age(same_age s) {
        if (age == s.age)
            return true;
        else 
            return false;
    }
}

public class ObjAsParameter {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        same_age ob1 = new same_age();
        same_age ob2 = new same_age();
        same_age ob3 = new same_age();

        System.out.print("Enter age and name of 1st person: ");
        int a1 = in.nextInt();
        String s1 = in.next();    
        System.out.print("Enter age and name of 2nd person: ");
        int a2 = in.nextInt();
        String s2 = in.next();
        System.out.print("Enter age and name of 3rd person: ");
        int a3 = in.nextInt();
        String s3 = in.next();

        ob1.read_data(a1,s1);
        ob2.read_data(a2,s2);
        ob3.read_data(a3,s3);

        System.out.println("The ages of "+s1+" and "+s2+" are equal: "+ob1.check_age(ob2));
        System.out.println("The ages of "+s2+" and "+s3+" are equal: "+ob2.check_age(ob3));
        System.out.println("The ages of "+s3+" and "+s1+" are equal: "+ob3.check_age(ob1));
    }
}