import java.util.Scanner;

public class DigitCount {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = in.next();
        int count = 0;
        char ch;
        in.close();
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                count = count + 1;
                System.out.println("Digit found at position " + i);
            }
        }
        System.out.println("Number of digits in the string are: " + count);
    }
}