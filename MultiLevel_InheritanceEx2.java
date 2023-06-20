/*
    Stutend         Marks           Result
      rno          m1,m2,m3          per
      nm             tot             gd
  input_data()    get_data()      grade_cal()
    display()       show()        mark_sheet()
 */

import java.util.*;
class Student {
    int rno;
    String nm;
    Scanner in = new Scanner (System.in);
    public void input_data() {
        System.out.print("Enter student name: ");
        nm = in.next();
        System.out.print("Enter roll number: ");
        rno = in.nextInt();
    }
    public void display() {
        System.out.println("The student is "+nm+" of roll number "+rno);
    }
}

class Marks extends Student {
    int m1,m2,m3,tot;
    public double get_data() {
        input_data();
        System.out.print("Enter 1st subject marks out of 50: ");
        m1 = in.nextInt();
        System.out.print("Enter 2nd subject marks out of 50: ");
        m2 = in.nextInt();
        System.out.print("Enter 3rd subject marks out of 50: ");
        m3 = in.nextInt();
        tot = m1+m2+m3;
        return(tot);
    }
    public void show() {
        display();
        System.out.println("Total marks is "+tot);
    }
}

class Result extends Marks {
    double per;
    char gd;
    public char grade_cal() {
        get_data();
        per = (tot * 100)/150;
        if(per>60)
            gd = 'A';
        else if(per>40)
            gd = 'B';
        else
            gd = 'C';
        return(gd);
    }
    public void marks_sheet() {
        show();
        System.out.println("Marksheet of student: "+nm);
        System.out.println("Subject          Marks obtained ");
        System.out.println("Subject 1               "+m1);
        System.out.println("Subject 2               "+m2);
        System.out.println("Subject 3               "+m3);
        System.out.println("-----------------------------");
        System.out.println("Total marks:          "+tot);
        System.out.println("Percentage:           "+per);
        System.out.println("Grades:               "+gd);
    }
}
public class MultiLevel_InheritanceEx2 {
    public static void main(String args[]) {
        Result R = new Result();
        R.grade_cal();
        R.marks_sheet();
    }
}
