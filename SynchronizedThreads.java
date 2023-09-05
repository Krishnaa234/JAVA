class Pair {
    private int a, b;
    public Pair() {
        a = 0;
        b = 0;
    }
// Returns the sum of a and b (reader)
// Should always return an even number.
    
    public int sum() {
    	  return(a+b);
    }
    
    // Increments both a and b. (writer)
    
    public synchronized void inc() {
        a++;
      	b++;
    }
}

public class SynchronizedThreads extends Thread {
    public final int COUNT = 1000;
    private Pair pair;
    // Ctor takes a pointer to the pair we use
    public SynchronizedThreads(Pair pair) {
        this.pair = pair;
    }
    // Send many inc() messages to our pair
    public void run() {
        for (int i=0; i<COUNT; i++) {
            pair.inc();
        }
    }
    public static void main(String args[]) {
        Pair pair = new Pair();
        SynchronizedThreads w1 = new SynchronizedThreads(pair);
        SynchronizedThreads w2 = new SynchronizedThreads(pair);
        SynchronizedThreads w3 = new SynchronizedThreads(pair);
        w1.start();
        w2.start();
        w3.start();
        
        // the 3 workers are running
        // all sending messages to the same object
        // we block until the workers complete
        
        try {
            w1.join();
            w2.join();
            w3.join();
        }
        catch (InterruptedException ignored) {}
                
        System.out.println("Final sum:" + pair.sum());
    }
}
