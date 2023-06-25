//use of throws in exception handling
class Usage_Throws {
    static void demo() throws ArithmeticException {
        int a = 45, b = 0,c;
        c = a/b;
        System.out.println("Value of c: "+c);
    }
    public static void main(String args[]) {
        try {
            demo();
        } catch(ArithmeticException ae) {
            System.out.println("Caught in main: "+ae);
        }
    }
}