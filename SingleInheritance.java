/*input roll number,name and three subject marks of a student
and find the grade
 *Student*          *Marks*
    rno           m1, m2, m3
    nm              P, gd
read_data()      input_data()
 display()         result()
*/
import java.util.*;
class Student {
    int rno;
    String nm;
    void read_data() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        nm = in.next();
        System.out.print("Enter roll number of the student: ");
        rno = in.nextInt();
        //in.close();
    }
    void display() {
        System.out.println("Name of student is: "+nm);
        System.out.println("Roll number is: "+rno);
    }
}

class Marks extends Student {
    int m1,m2,m3;
    double p;
    char gd;
    void input_marks() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks for subject 1 out of 50: ");
        m1 = in.nextInt();
        System.out.print("Enter marks for subject 2 out of 50: ");
        m2 = in.nextInt();
        System.out.print("Enter marks for subject 3 out of 50: ");
        m3 = in.nextInt();
        //in.close();
    }
    void result() {
        p = (m1+m2+m3)*100/150;
        if(p<40)
            gd = 'F';
        else if(p<50)
            gd = 'C';
        else if(p<60)
            gd = 'B';
        else
            gd = 'A';
        System.out.println("Percentage is: "+p);
        System.out.println("Grade is: "+gd);
    }
}

public class SingleInheritance {
    public static void main(String args[]) {
        Marks m = new Marks();
        m.read_data();
        m.input_marks();
        m.display();
        m.result();
    }
}