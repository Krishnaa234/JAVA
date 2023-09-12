//Replace the char in string "s1" with the char 'a' at index "n"  and print the modified string

import java.util.*;
public class replace_char_at_index {  
    public static void main(String[] args) { 
        try{	
    	      String s1="NPTELJAVA"; 
            Scanner inr = new Scanner(System.in);
    	      int n = inr.nextInt();
            char c='a';
    			  byte[] barr=s1.getBytes();
            byte b1 = (byte) c;
            barr[n]=b1;
        		System.out.print(new String(barr));
	     }
       catch (Exception e){
            System.out.println("exception occur");
	     }	   
    }  
}
