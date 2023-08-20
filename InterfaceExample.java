// Interface ShapeX is created
interface ShapeX {
 public String base = "This is Shape1";
 public void display1();
}

// Interface ShapeY is created which extends ShapeX
interface ShapeY extends ShapeX {
 public String base = "This is Shape2";
 public void display2();
}


// Class ShapeG is created which implements ShapeY
class ShapeG implements ShapeY {
	public String base = "This is Shape3";
  //Overriding method in ShapeX interface
 	public void display1() {
  		System.out.println("Circle: " + ShapeX.base);
 }
 // Override method in ShapeY interface
  	public void display2() {
  		System.out.println("Circle: " + ShapeY.base);
  }
}

public class InterfaceExample{
  public static void main(String args[]) {
    ShapeG C = new ShapeG();
    C.display1();
    C.display2();
  }
}
