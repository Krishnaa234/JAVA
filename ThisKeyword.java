//program to check which person is elder
import java.util.Scanner;
class comp {
    int age;
    String nm;
    public void read_data(String n, int a) {
        nm  = n;
        age = a;
    }
    public comp elder(comp k) {
        if(age>k.age)
            return(this);
        else
            return(k);
    }
    public void show_result() {
        System.out.println("The elder person is "+nm + " with the age "+age);
    }
}
public class ThisKeyword {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name and age of 1st person: ");
        String n1 = in.next();
        int a1 = in.nextInt();
        System.out.print("Enter name and age of 2nd person: ");
        String n2 = in.next();
        int a2 = in.nextInt();
        comp c1 = new comp();
        comp c2 = new comp();
        comp c3 = new comp();
        c1.read_data(n1,a1);
        c2.read_data(n2,a2);
        c3 = c1.elder(c2);
        c3.show_result();
        in.close();
    }
}