import java.util.*;
public class switch_case {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.print("Press button: ");
        int button = num.nextInt();
        switch (button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
        }
    }
}
