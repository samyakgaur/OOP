/*
Samyak Gaur 
8604 
code to implement extends keyword i.e inheritance

*/

import java.util.*;
class A{
	protected int i,j;
	
	void readij(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first value:");
		i = in.nextInt();
		System.out.print("Enter second value:");
		j = in.nextInt();
	}	

	void displayij(){
		System.out.println("i = "+i+", j = "+j);
	}
}//class A ends 
//It has 4 members - 2 instance variables and 2 instance method

class B extends A{
	private int k;//private variable

	void computek(){
		k = i+j;
	}//End of addition function 
	void displayk(){
		System.out.println("i+j : "+k);
	}//End of display function 
}//class B ends
//It has 3 instance variable ( 1 its own and 2 inherited)
//and 4 instance methods( 2 its own and 2 inherited


public class inheritdemo{
	public static void main(String [] args){
		B ob = new B();
		ob.readij();
		ob.computek();
		ob.displayij();
		ob.displayk();
	}//End of main function
}//End of main class
/*
Output of the following code is :
universe@dell15:~/Desktop/8604$ javac inheritdemo.java 
universe@dell15:~/Desktop/8604$ java inheritdemo 
Enter first value:1
Enter second value:2
i = 1, j = 2
i+j : 3

*/

