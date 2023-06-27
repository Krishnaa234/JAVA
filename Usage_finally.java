//demonstrate the use of keyword "finally" in exception handling

public class Usage_finally {
    static void method_A() {
        try {
            System.out.println("Method a executed");
            throw new ArithmeticException();
        }
        finally {
            System.out.println("Finally of method A");
        }
    }
    
    static void method_B() {
        try {
            System.out.println("Method B executed");
            return;
        }
        finally {
            System.out.println("Finally of method B");
        }
    }
    
    static void method_C() {
        try {
            System.out.println("Method C executed");
        }
        finally {
            System.out.println("Finally of method C");
        }
    }
    public static void main(String args[]) {
        try {
            method_A();
        } catch(ArithmeticException ae) {
            System.out.println("Exception caught");
        }
        method_B();
        method_C();
    }
}