// Samyak Gaur 
// Roll no: 8604 Batch B
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
