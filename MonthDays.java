import java.util.*;
public class MonthDays {
    public static void main (String args[]) {
        System.out.print("Enter the month number: ");
        Scanner mon = new Scanner (System.in);
        int n = mon.nextInt();
        switch (n) {
            case 1,3,5,7,8,10,12: System.out.print("Number of day in this month are 31.");
                break;
            case 4,6,9,11: System.out.print("Number of days in this month are 30.");
                break;
            case 2: System.out.print("Number of days in this month are 28/29.");
                break;
            default: System.out.print("Month number doesn't exists.");
        }
    }
}
