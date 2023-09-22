//code to develop a BASIC CALCULATOR that can perform operations 
//like Addition, Subtraction, Multiplication and Division.

import java.util.Scanner;
public class Calculate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); 
		int i=0,j=0;
		double output=0;
		char seq[] = input.toCharArray();
		for(int a=0; a<seq.length; a++){
			if(seq[a]=='+'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i+j;
			}else if(seq[a]=='-'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i-j;
			}else if(seq[a]=='/'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i/j;
			}else if(seq[a]=='*'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i*j;
			}
		}

		System.out.print(input+" = " + Math.round(output));
  }
}
