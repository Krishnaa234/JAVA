/* implement hierarchical inheritance on a firm of employee and allowance and deduction

    Allowances          Employee            Deduction
     da, ta,           ecode, emm         pf, it, nsal
    hra, gsal   <---  dept, salary --->  
    grosspay()        input_data()          net_pay()
                        display()       
 */

import java.util.*;

class Employee {
    int ecode, salary;
    String enm, dept;
    Scanner in = new Scanner (System.in);
    public void input_data() {
        System.out.print("Enter the employee code: ");
        ecode = in.nextInt();
        System.out.print("Enter employee name: ");
        enm = in.next();
        System.out.print("Enter department: ");
        dept = in.next();
        System.out.print("Enter salary: ");
        salary = in.nextInt();
    }
    public void display() {
        System.out.println("Employee code is: "+ecode);
        System.out.println("Employee name is: "+enm);
        System.out.println("Department is: "+dept);
        System.out.println("Salary is: "+salary);
    }
}

class Allowances extends Employee {
    double da, ta, hra, gsal;
    public double grosspay() {
        input_data();
        da = (75 * salary)/100;
        ta = (15 * salary)/100;
        hra = (20 * salary)/100;
        gsal = da + ta + hra + salary;
        System.out.println("The gross salary is of the employee is: "+gsal);
        return(gsal);
    }
}

class Deduction extends Employee {
    double pf, it, nsal;
    public void net_pay(double z) {
        pf = (25 * z)/100;
        it = (30 * z)/100;
        nsal = z - pf - it;
        System.out.println("The net salary is: "+nsal);
    }
}

public class Hierarchical_Inheritance {
    public static void main(String args[]) {
        Allowances A = new Allowances();
        double r = A.grosspay();
        Deduction D = new Deduction();
        D.net_pay(r);
    } 
}