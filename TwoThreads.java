public class TwoThreads extends Thread{  
    public void run(){  
      
    }  
    public static void main(String args[]){  
        TwoThreads t1=new TwoThreads();  
        System.out.println("Name of thread 't1':"+ t1.getName());  
    
        TwoThreads t2=new TwoThreads();  
        System.out.println("Name of thread 't2':"+ t2.getName());
    
        t1.start();  
        t1.setName("Week 6 Assignment Q5");  
    
        t2.start(); 
        t2.setName("Week 6 Assignment Q5 New");  
    
        System.out.println("New name of thread 't1':"+ t1.getName()); 
        System.out.println("New name of thread 't2':"+ t2.getName());
     
     }  
}

/*OUTPUT
Name of thread 't1':Thread-0
Name of thread 't2':Thread-1
New name of thread 't1':Week 6 Assignment Q5
New name of thread 't2':Week 6 Assignment Q5 New
*/
