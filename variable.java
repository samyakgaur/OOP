/* 
Samyak Gaur(8604)
Batch B

A program to display global,instance and local variable and study its scope
*/
import java.lang.*;
class variable
{
	static int globalv = 100;						// global variable 
	int instance = 200;								// instance variable 
	public static void main(String args[])
	{
		variable obj=new variable();
		int localvar=10;							// local variable 
		System.out.println("local variable: "+localvar); 	
		System.out.println("instance variable: "+obj.instance);
		System.out.println("global varibale: "+globalv);		
	}
}

/*
/*
Output is as follows :

universe@dell15:~/Desktop/8604$ javac variable.java
universe@dell15:~/Desktop/8604$ java variable
local variable: 10
instance variable: 200
global variable: 100
*/