//program to find the sum of first 50 even number
class Sum {
    int s;
    Sum() {
        s = 0;
    }
    public int add() {
        for(int i=2; i<=100; i=i+2) {
            s = s + i;
        }
        return(s);
    }
}
public class DefaultConst_EvenSum {
    public static void main(String args[]) {
        Sum S = new Sum();
        System.out.print("The sum of first 50 even numbers is: "+S.add());
    }
}