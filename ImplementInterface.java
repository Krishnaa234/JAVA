// Interface A is defined with an abstract method run()
interface A {
	  public abstract void run();
}

// Class B is defined which implements A and an empty implementation of run()
class B implements A {
	  public void run() {}
}

// Define a method in MyThread class to print the output

class MyThread implements A{
    public void run() {
      System.out.print("NPTEL Java week-6 new Assignment Q3");
    }
}

public class ImplementInterface {
     public static void main(String[] args) {

       MyThread t = new MyThread();
       t.run();
     }
}
