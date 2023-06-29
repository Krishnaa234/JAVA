//user input ID and password for login 
//3 trials for wrong password
import java.util.*;
class Login extends Exception {
    public String toString() {
        return "Incorrect password";
    }
    public static void main(String A[]) {
        int i=1;
        String uid, pwd;
        while(i<=3) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter user name: ");
                uid = in.next();
                System.out.print("Enter password: ");
                pwd = in.next();
                if(!uid.equals("Krishna")) 
                    throw new Login();
                if(!pwd.equals("21cse066"))
                    throw new Login();
                else {
                    System.out.println("You are logged in...");
                    return;
                }
            } catch(Login me) {
                System.out.println(me);
            } catch(Exception e) {} 
            i++;
        }
    }
}