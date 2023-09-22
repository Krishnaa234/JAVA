'''
2D Flip-Flop Array with dimension 5 × 5, 
which replaces all input elements with values 0 by 1 and 1 by 0.
INPUT:
               00001
               00001
               00001
               00001
               00001

OUTPUT:

               11110
               11110
               11110
               11110
               11110
'''
import java.util.Scanner;
public class Compliment_Of_Binary_Matrix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	  char original[][]= new char[5][5];

		for(int line=0;line<5; line++){
			String input = sc.nextLine();
			char seq[] = input.toCharArray();
			if(seq.length==5){
				for(int i=0;i<5;i++){
					if(seq[i]=='0' || seq[i]=='1'){
						original[line][i]=seq[i];
						if(line==4 && i==4)
							flipflop(original);
					}
					else{
						System.out.print("Only 0 and 1 supported.");
						break;
					}
				}
			}else{
				System.out.print("Invalid length");
				break;
			}

		}
	}
	static void flipflop(char[][] flip){
		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){
				if(flip[i][j]=='1')
					flip[i][j]='0';
				else
					flip[i][j]='1';
			}
		}

		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){
				System.out.print(flip[i][j]);
			}
			System.out.println();
		}
  }
}
