/* 
Samyak Gaur(8604)
Batch B

To create an object and use it follow the given step:
> import java.util.*;
> create object of scanner class 
> to use inbuild method to take input 
*/

import java.util.*;
class program3
{
	public static void main(String[] args)
		{
			int n;
			String s;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			n = sc.nextInt();	
			System.out.print("The entered number is:"+n);
			System.out.print("Enter a string: ");
			s = sc.next();	
			System.out.print("The entered string is:"+s);
		}	//End of main	

}	//End of class program3


/*
Output is as follows :
universe@dell15:~/Desktop$ javac program3.java
universe@dell15:~/Desktop$ java program3
Enter a number: 4
The entered number is: 4
Enter a string: samyak
The entered string is: samyak

*/
