//show the usage of throw
public class Usage_Throw {
    static void demo() {
        try {
            ArithmeticException obj = new ArithmeticException("\nDon't divide number by zero");
            throw obj;
        } catch(ArithmeticException ae) {
            System.out.println("Caught in demo");
            throw ae;
        }
    }
    public static void main(String args[]) {
        try {
            demo();
        } catch(ArithmeticException ae) {
            System.out.println("Recaught in main "+ae);
        }
    }
}