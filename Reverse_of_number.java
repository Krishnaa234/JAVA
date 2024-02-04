import java.util.Scanner;

class Reverse_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int ans = 0;
        while(num!=0){
            int rem = num % 10;
            num/=10;
            ans = 10 * ans + rem;
        }
        System.out.print(ans);
    }
}
