'''
Write a program to display any digit(n) from 0-9 represented as a "7 segment  display

input : 5
output :
 _ 
|_ 
 _|

input : 4
output :

|_|
  |
'''
import java.util.*;
public class SevenSegmentDisplay {
     private static final Map<Integer,Integer> encodings=new HashMap<Integer,Integer>();
     static {
        encodings.put(0, 0x7E);
        encodings.put(1, 0x30);
        encodings.put(2, 0x6D);
        encodings.put(3, 0x79);
        encodings.put(4, 0x33);
        encodings.put(5, 0x5B);
        encodings.put(6, 0x5F);
        encodings.put(7, 0x70);
        encodings.put(8, 0x7F);
        encodings.put(9, 0x7B);
    }

    public static void printDigit(int digit)
    {
        int code = encodeDigit(digit);
        char[] bits = String.format("%7s",Integer.toBinaryString(code)).replace(' ','0').toCharArray();

        lightSegmentDisp(bits[0] == '1', " _ \n", "   \n");
        lightSegmentDisp(bits[5] == '1', "|", " ");
        lightSegmentDisp(bits[6] == '1', "_", " ");
        lightSegmentDisp(bits[1] == '1', "|\n", " \n");
        lightSegmentDisp(bits[4] == '1', "|", " ");
        lightSegmentDisp(bits[3] == '1', "_", " ");
        lightSegmentDisp(bits[2] == '1', "|\n", " \n");
    }

    private static void lightSegmentDisp(boolean On, String onVal, String offVal)
    {
        System.out.print(On ? onVal : offVal);
        try {
            Thread.sleep(0);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int encodeDigit(int d) {
        return encodings.containsKey(d) ? encodings.get(d) : 0x00;
    }
   public static void main(String[] args) throws Exception {
           Scanner inr = new Scanner(System.in);
	   	   int n = inr.nextInt();
           printDigit(n);    
    }
}
