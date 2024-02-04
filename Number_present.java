import java.util.Scanner;

class Number_present {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.print("Enter key: ");
        int k = in.nextInt();
        int count = 0;
        while(num != 0) {
            int rem = num % 10;
            if(rem == k)
                count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
