import java.util.*;

class sum {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to be added: ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
