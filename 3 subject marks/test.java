//inherit the InputTotalAvgPer class with return percentage
public class test extends InputTotalAvgPer{
    public static void main(String args[]) {
        InputTotalAvgPer obj = new InputTotalAvgPer();
        obj.read_data();
        double p = obj.cal();
        System.out.println("The percentage is: "+p);
    }
}
