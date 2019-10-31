/*
Samyak Gaur
Program to implement basic multithreading
*/
class NewThread implements Runnable {
   	// This is the entry point for the  thread.
   	public void run(){
      		try{
         			for(int i = 5; i > 0; i--) {
            			System.out.println(Thread.currentThread().getName()+":"+i+"th time");
            			// Let the thread sleep for a while.
            			Thread.sleep(500);//sleep for 500 ms 
         			}
     		}//End of try block 	 
		catch (InterruptedException e){
         		System.out.println("Child interrupted.");
     		}//End of catch block
		System.out.println("Exiting child thread.");
   	}//End of function
}

public class ThreadDemo1 {
   public static void main(String args[]) {
      NewThread nt = new NewThread(); // create a new thread
      
      Thread t1 = new Thread(nt,"Demo Thread 1");

      Thread t2 = new Thread(nt,"Demo Thread 2");
      
      System.out.println("Child thread: " + t1);
	 t1.start();
      System.out.println("Child thread: " + t2);
	 t2.start();
      System.out.println("Main thread exiting.");
   }//End of main function
}//End of class 
/*
The output of the following code is:
universe@dell15:~/Desktop/8604$ javac ThreadDemo1.java 
universe@dell15:~/Desktop/8604$ java ThreadDemo1 
Child thread: Thread[Demo Thread 1,5,main]
Child thread: Thread[Demo Thread 2,5,main]
Main thread exiting.
Demo Thread 1:5th time
Demo Thread 2:5th time
Demo Thread 2:4th time
Demo Thread 1:4th time
Demo Thread 2:3th time
Demo Thread 1:3th time
Demo Thread 1:2th time
Demo Thread 2:2th time
Demo Thread 1:1th time
Demo Thread 2:1th time
Exiting child thread.
Exiting child thread.

*/
