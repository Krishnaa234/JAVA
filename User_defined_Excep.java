//input 3 subject marks and find the grade
//exception handling when marks are less than 0 and more than 50
import java.util.*;
class less extends Exception {
    public String toString() {
        return "Marks less than 0";
    }
}
class more extends Exception {
    public String toString() {
        return "Marks more than 50";
    }
}
public class User_defined_Excep {
    public static void main(String args[]) {
        int a,b,c;
        double p;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter marks out of 50");
            System.out.print("Enter marks of 1st subject: ");
            a = in.nextInt();
            System.out.print("Enter marks of 2nd subject: ");
            b = in.nextInt();
            System.out.print("Enter marks of 3rd subject: ");
            c = in.nextInt();
            in.close();
            if(a<0 || b<0 || c<0)
                throw new less();
            else if(a>50 || b>50 || c>50)
                throw new more();
            p = (a+b+c)*100/150;
            System.out.println("The percentage is: "+p);
            System.out.print("The grade is: ");
            if(p>=60)
                System.out.print("A");
            else if(p>50)
                System.out.print("B");
            else if(p>40)
                System.out.print("C");
            else
                System.out.print("D");
        } catch(less l) {
            System.out.print(l);
        } catch(more m) {
            System.out.print(m);
        } catch(Exception e) {}
    }
}