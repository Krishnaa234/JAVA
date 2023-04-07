import java.util.*;

public class if_adult_or_not {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = a.nextInt();

        if (age>18) {
            System.out.println("Adult.");
        }
        else {
            System.out.println("Not Adult.");
        }
    }
}
