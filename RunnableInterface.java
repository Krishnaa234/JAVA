//a thread class Question62 is created using the Runnable interface Complete the main() to create a thread object of the class Question62 and run the thread
public class RunnableInterface implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.print(Thread.currentThread().getName() + " has ended.");  
    }
   
    public static void main(String[] args) 
    {  
        RunnableInterface ex = new RunnableInterface();  
        Thread t0= new Thread(ex);  
        t0.start();  
        System.out.println("Welcome to Java Week 6 New Question.");  
        t0.setName("Main Thread");
    }
}

/*-----------------OUTPUT-------------------

Welcome to Java Week 6 New Question.

Main Thread has ended.
*/
