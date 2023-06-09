//Program to calculate the factorial

class xyz {
    int f, n;
    public xyz() {
        f = 1;
        n = 6;
    }
    public double facto() {
        for(int i=1; i<=n; i++) {
            f = f*i;
        }
        return (f);
    }
}
public class DefaultConst {
    public static void main(String A[]) {
        xyz ob = new xyz();
        double fct = ob.facto();
        System.out.println("The factorial is: "+fct);
    }
}
