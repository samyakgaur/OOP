/*
Samyak Gaur 
Program to implement yield function in multithreading 
*/
class NewThread implements Runnable {
   	// This is the entry point for the  thread.
   	public void run(){
      	for(int i = 5; i > 0; i--) {
			try{
					Thread.yield();            			
					System.out.println(Thread.currentThread().getName()+":"+i);
            			// Let the thread sleep for a while.
            			Thread.sleep(500);//sleep for 500 ms
					
			/*
				yield function forces the other thread to execute first on priority so after we encounter this function the control is pushed 					to the for loop in the main function							
			*/ 
     		}//End of try block 	 
			catch (InterruptedException e){
	         		System.out.println("Child interrupted.");
	     	}//End of catch block
			System.out.println("Exiting child thread.");
		}//End of for loop 
   	}//End of function
}//End of class

public class thread2 {
   public static void main(String args[]) {
      NewThread nt = new NewThread(); // create a new thread
      Thread t1 = new Thread(nt,"Demo Thread 1");
      System.out.println("Child thread: " + t1);
	 t1.start();//Thread started
	//After encountering the yield function the processor executes this for loop on priority bases and then the goes back to the child thread
 	for(int i = 5; i > 0; i--) {
		System.out.println("Parent loop executed before the child thread");	
	}//End of for loop
   }//End of main function 
}//End of class

/*
Output of the following code is:
universe@dell15:~/Desktop/8604$ javac thread2.java 
universe@dell15:~/Desktop/8604$ java thread2
Child thread: Thread[Demo Thread 1,5,main]
Parent loop
Parent loop
Parent loop
Parent loop
Parent loop
Main thread exiting.
Demo Thread 1:5
Exiting child thread.
Demo Thread 1:4
Exiting child thread.
Demo Thread 1:3
Exiting child thread.
Demo Thread 1:2
Exiting child thread.
Demo Thread 1:1
Exiting child thread.
universe@dell15:~/Desktop/8604$ 

*/

