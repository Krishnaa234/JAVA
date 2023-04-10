import java.util.*;
public class calculator {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = num.nextInt();
        System.out.print("Enter value of b: ");
        int b = num.nextInt();
        System.out.print("Enter 1 for addition \n2 for Subtraction \n3 for Multiplication \n4 for Division \n5 for Remainder\n");
        System.out.print("Enter your choice: ");
        int x = num.nextInt();
        switch (x) {
            case 1: System.out.println("Addition is: ");
            System.out.print(a + b);
            break;
            case 2: System.out.println("Subtraction is: ");
            System.out.print(a - b);
            break;
            case 3: System.out.println("Multiplication is: ");
            System.out.print(a * b);
            break;
            case 4: if (b==0) {
                System.out.println("B can not be 0. Enter again.");
            } else {
                System.out.println("Division is: ");
                System.out.print(a/b);
            }
            break;
            case 5: if (b==0) {
                System.out.println("B can not be 0. Enter again.");
            } else {
                System.out.println("Remainder is: ");
                System.out.print(a%b);
            }
            break;
            default: System.out.println("Entered a wrong input");
        }
    }
}