/*
Samyak Gaur(8604)
Batch B

A program to display maximum and minimum element in an array;
*/


import java.util.*;
import java.lang.*;
import java.math.*;

class arraydata{
	static int max(int d[]){
		int maxnum=d[0];
		for(int i=0;i<10;i++){
			if(d[i]>maxnum)
				maxnum=d[i];
						
		}//End of for loop
	return maxnum;	
	}//End of max function
	
	static int min(int d[]){
		int minnum=d[0];
		for(int i=0;i<10;i++){
			if(d[i]<minnum)
				minnum=d[i];
						
		}//End of for loop
	return minnum;	
	}//End of max function

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];

		int maxnum,minnum;
		for(int i=0;i<10;i++){
			System.out.print("Enter element "+i+":");
			a[i]=sc.nextInt();
		}//End of input for loop
		maxnum=max(a);
		minnum=min(a);
		System.out.print("Largest Number "+maxnum);
		System.out.print("Smallest Number "+minnum);
	}//End of mains function 
}//End of arraydata class
