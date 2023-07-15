/*print the following pattern
1
12
121
1212
12121
 */
public class pattern1{
    public static void main(String args[]) {
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                if(j==0 || j==2 || j==4)
                    System.out.print("1");
                else
                    System.out.print("2");
            }
            System.out.println();
        }
    }
}