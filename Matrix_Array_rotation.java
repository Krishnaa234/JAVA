'''
perform a 45 degree anti clock wise rotation with respect to the center of a 5 × 5 2D 
Array as shown below:
INPUT:        00100
              00100
              11111
              00100
              00100

OUTPUT:       10001
              01010
              00100
              01010
              10001
'''
import java.util.Scanner;
public class Matrix_Array_rotation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	  char arr[][]= new char[5][5];
			for(int line=0;line<5; line++){
				String input = sc.nextLine();
				char seq[] = input.toCharArray();
				if(seq.length==5){
					for(int i=0;i<5;i++){
						arr[line][i]=seq[i];
					}
				}else{
					System.out.print("Wrong Input!");
					System.exit(0);
				}
			}
			char tra[][] = new char[5][5];
			String outer[]={"00","10","20","30",
							"40","41","42","43",
							"44","34","24","14",
							"04","03","02","01"};

			String inner[]={"11","21","31","32",
							"33","23","13","12"};

			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					for(int k=0; k<outer.length; k++){
						char indices[]=outer[k].toCharArray();
						int a = Integer.parseInt(String.valueOf(indices[0]));
						int b = Integer.parseInt(String.valueOf(indices[1]));
						if(a==i && b==j){
							if(k==15){k=1;}
							else if(k==14){k=0;}
							else {k+=2;}
							indices=outer[k].toCharArray();
							a = Integer.parseInt(String.valueOf(indices[0]));
							b = Integer.parseInt(String.valueOf(indices[1]));
							tra[a][b] = arr[i][j];
							break;
						}
					}
					for(int k=0; k<inner.length; k++){
						char indices[]=inner[k].toCharArray();
						int a = Integer.parseInt(String.valueOf(indices[0]));
						int b = Integer.parseInt(String.valueOf(indices[1]));
						if(a==i && b==j){
							if(k==7){k=0;}
							else {k+=1;}
							indices=inner[k].toCharArray();
							a = Integer.parseInt(String.valueOf(indices[0]));
							b = Integer.parseInt(String.valueOf(indices[1]));
							tra[a][b] = arr[i][j];
							break;
						}
					}
					tra[2][2] = arr[2][2];
				}
			}
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					System.out.print(tra[i][j]);
				}
				System.out.println();
			}
  }
}
