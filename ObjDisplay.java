//predict the output

class X {
    static {
        Y.display();
    }
}
class Y extends X {
    static void display() {
        System.out.println("Java");
    }
}

public class Main{
    public static void main(String args[])  {
        Y.display();
    }
}

//Output:
//Java
//Java
