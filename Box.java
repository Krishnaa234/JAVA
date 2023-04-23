//import java.util.Scanner;
public class Box {
    double H;
    double B;
    double L;
}
class BoxDemo {
    public static void main(String args[]) {
        Box myobj = new Box();
        myobj.H = 10;
        myobj.B = 20;
        myobj.L = 10;
        double Vol = myobj.H * myobj.B * myobj.L;
        System.out.println(Vol);
    }
}