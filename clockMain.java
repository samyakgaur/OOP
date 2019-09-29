import java.util.*;

class clock
{
	protected int hh,mm,ss;
	clock()
	{	
		Scanner in = new Scanner(System.in);
		hh=in.nextInt();
		mm=in.nextInt();
		ss=in.nextInt();
		
	}
	 public String toString()
	{
 		return(hh+":"+mm+":"+ss);
	}
}

class digitalClock extends clock
{
	String t;
	digitalClock()
	{
		if(hh>12)
		{
			hh=hh%12;
			t="pm";
		}
		else
			t="am";	
	}
	public String toString()
	{
		
		return(super.toString()+" "+t);
	}
}

public class clockMain
{
	public static void main(String [] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		while(true){
				System.out.println("You can perform the following tasks: \n 1) 24 Hour Analog \n 2) 12 Hour Analog \n 3) Exit");
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();	
				switch(choice){
					case 1:
							System.out.print("Please enter the value of hour minutes seconds :");
							digitalClock a = new digitalClock();
							System.out.println("Time is: "+a);						
							break;
					case 2:
							System.out.print("Please enter the value of hour minutes seconds :");
							clock b = new clock();
							System.out.println("Time is: "+b);
							break;
					case 3:
							System.exit(0);
							break;
					default:
							System.out.println("Invalid Choice");
							break;
							}	//End of switch case
				}	//End of while loop 
	}
}
/*
Output of the following code is:
(base) Samyaks-MacBook-Air:OOP samyakgaur$ javac clockMain.java
(base) Samyaks-MacBook-Air:OOP samyakgaur$ java clockMain
You can perform the following tasks: 
 1) 24 Hour Analog 
 2) 12 Hour Analog 
 3) Exit
Enter your choice: 1
Please enter the value of hour minutes seconds :18
00  
00
Time is: 6:0:0 pm
You can perform the following tasks: 
 1) 24 Hour Analog 
 2) 12 Hour Analog 
 3) Exit
Enter your choice: 2
Please enter the value of hour minutes seconds :1
12
12
Time is: 1:12:12
 */