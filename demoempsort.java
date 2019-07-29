/* 
Samyak Gaur(8604)
Batch B

A Program to create a employee database and print it in ascending order of their salary 
*/
import java.lang.*;
import java.math.*;
import java.util.*;
import java.io.*;
class empsort
{
	int id;
	float sal;
	static int count;
	empsort(){
		id=0;
		sal=0.0f;
	}//End of the default constructor
	empsort(float sal){
		count++;
		this.id=count;
		this.sal=sal;
	}//End of parameterized constructor
	void display(){
		System.out.println("employee id is: "+id);
		System.out.println("employee salary is: "+sal);
	}//End of display function
}// End of empsort class 
class demoempsort 
{	
	public static void main(String args[])
		{
			float s; 
			empsort[] e = new empsort[3];
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<e.length;i++){
				System.out.println("Enter employee salary: ");
				s=sc.nextFloat();
				e[i]= new empsort(s);
			}//End of for loop for input
			empsort temp = new empsort();
			for(int j=0;j<e.length;j++){
				for(int k=0;k<(e.length-1);k++){
					if(e[k].sal>e[k+1].sal){
						temp=e[k];
						e[k]=e[k+1];
						e[k+1]=temp;
					}//End of if condition for sorting										
				}//End of k loop for sorting
			}//End of j loop for sorting */  	
			for(int i=0;i<e.length;i++)
				e[i].display();
			//End of i loop for display	
		}	//End of main	
}//End of class demoempsort
/*
Output of the following code is:
universe@dell15:~/Desktop/8604$ javac demoempsort.java
^[[Auniverse@dell15:~/Desktop/8604$ java demoempsort
Enter employee salary: 
4
Enter employee salary: 
2
Enter employee salary: 
1
employee id is: 3
employee salary is: 1.0
employee id is: 2
employee salary is: 2.0
employee id is: 1
employee salary is: 4.0
	
*/
