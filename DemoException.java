import java.lang.*;
import java.util.*;
import java.io.*;
class IllegalMarksException extends Exception
{
	int marks;
	IllegalMarksException(int marks)
	{
	this.marks=marks;
	}
	public String toString() //To Return String
	{
	return "IllegalMarksException "+marks;
	}
}
class DemoException
{
	public static int getMarks() throws IllegalMarksException,IOException	
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	int marks;
	System.out.print("Enter the marks :");
	marks=Integer.parseInt(br.readLine());
	if(marks < 0)
		throw new IllegalMarksException(marks);
	else
		return marks;
	}
	public static void main(String[] args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rno,marks;
		try
		{
			System.out.println("Enter the Roll Number"); //Roll Number Input	
			rno=Integer.parseInt(br.readLine());
			marks=getMarks();
			System.out.println("Mark Sheet");
			System.out.println("Roll No : "+rno);
			System.out.println("Marks = "+marks);
			if(marks > 40)
				System.out.println("RESULT : PASS ");
			else
				System.out.println("RESULT : FAIL ");
		}	
		catch(IOException ioe)
		{		
			System.out.println("IO ERROR. EXITING");
		}
		catch(IllegalMarksException ime)
		{
			System.out.println("\nILLEGAL MARKS ENTERED .EXITING\t"+ime);
		}
	}
}

