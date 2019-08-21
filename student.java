/* 
Samyak Gaur(8604)
Batch B

write a program to input roll number, attendance of the student , display the list of students having attendace less than 75%
*/

import java.util.*;
import java.lang.*;
import java.math.*;


class studentdata {
	int rollno , att;
	String name;
	Scanner sc = new Scanner(System.in);
	studentdata(int a , int b , String n){
		rollno=a;
		att=b;
		name=n;
	}//End of parameterized constructor
	void display(){
			if(att<75)
			System.out.println("Name: "+name+"\t Roll Number: "+rollno+"\t Attendance: "+att);
	}//End of display function
}//End of class studentdata 


public class student{
	static int count;
	public static void main(String args[]){
		int atte,r;
		String n;
		
		studentdata s[] = new studentdata[10];
		int choice;
			int user; 
			Scanner sc1 = new Scanner(System.in);
			while(true){
				System.out.println("\n You can perform following functions: \n 1.Add \n 2.Display \n 3.Exit");
				System.out.print("Enter your choice: ");
				choice = sc1.nextInt();	
				switch(choice){
					case 1:
							System.out.print("Enter the name of the student:");
							n=sc1.next();								
							System.out.print("Enter the roll number of the student:");
							r=sc1.nextInt();
							System.out.print("Enter the Attendance of the student:");
							atte=sc1.nextInt();													
							s[count]= new studentdata(r,atte,n);
							count+=1;
							break;
					case 2:
							for(int i=0;i<count;i++)
								s[i].display();
							break;
					case 3:
							System.exit(0);
							break;
					default:
							System.out.println("Invalid Choice");
							break;
							}	//End of switch case
				}	//End of while loop 
	}//End of main function 
	
}//End of student class


/*
Output of the following code is:
universe@dell15:~/Desktop/8604$ javac student.java
universe@dell15:~/Desktop/8604$ java student

 You can perform following functions: 
 1.Add 
 2.Display 
 3.Exit
Enter your choice: 1
Enter the name of the student:chris
Enter the roll number of the student:1
Enter the Attendance of the student:100

 You can perform following functions: 
 1.Add 
 2.Display 
 3.Exit
Enter your choice: 1
Enter the name of the student:samyak
Enter the roll number of the student:2
Enter the Attendance of the student:10

 You can perform following functions: 
 1.Add 
 2.Display 
 3.Exit
Enter your choice: 2
Name: samyak	 Roll Number: 2	 Attendance: 10



*/
