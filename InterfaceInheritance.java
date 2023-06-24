//show inheritance of interface to interface
interface I1 {
    void abc();
}
interface I2 extends I1 {
    void pqr();
    void xyz();
}
class Iclass implements I2 {
    public void abc() {
        System.out.println("This is the method of abc");
    }
    public void pqr() {
        System.out.println("This is the method of pqr");
    }
    public void xyz() {
        System.out.println("This is the method of xyz");
    }
}
public class InterfaceInheritance {
    public static void main(String args[]) {
        Iclass obj = new Iclass();
        obj.abc();
        obj.pqr();
        obj.xyz();
    }
}