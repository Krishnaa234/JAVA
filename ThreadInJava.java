// Write the appropriate code to extend the Thread class to complete the class.
public class ThreadInJava extends Thread{
  public void run()
  {
		System.out.print("Thread is Running.");
	}
  
  public static void main(String args[]){  
		Question61 thread=new Question61();  
    // Start the thread
		thread.start();
	}  
}
