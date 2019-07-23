/* 
Samyak Gaur(8604)
Batch B

A program to print a star pattern implementing nested loops
*/

import java.lang.*;
class Starpattern
{ 
	public static void main(String args[])
	{
		for(int i=0 ; i<5 ;i++)
		{
			for(int j=0 ; j<i ;j++)
			{
			 
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}

/*
Output is as follows :

universe@dell15:~/Desktop/8604$ javac Starpattern.java
universe@dell15:~/Desktop/8604$ java Starpattern
*
**
***
****
*****

universe@dell15:~/Desktop/8604$
*/