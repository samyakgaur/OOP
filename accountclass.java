/*
Samyak Gaur(8604)
Batch B

A program to implement class inheritance for a program that implements bank system.
*/


import java.util.*;
import java.lang.*;
import java.math.*;

class account {
	int accno , bal;
	static int count;
	Scanner sc = new Scanner(System.in);
	account(){
		bal=500;
		count+=1;
		accno=1000+count;	
	}//End of the default constructor 
	account(int a){
		bal=a;
		count+=1;
		accno=1000+count;	
	}//End of parameterized constructor
	void display(){
			System.out.println("The balance is :"+bal);
	}//End of display function
	void deposit(){
		int deposit;
		System.out.print("Enter the value to deposit:");
		deposit = sc.nextInt();
		bal+=deposit;
		System.out.print("Enter balance of your account as of now is:"+bal);
	}//End of deposit function
	void withdraw(){
		int withdraw;
		System.out.print("Enter the value to withdraw:");
		withdraw = sc.nextInt();
		bal-=withdraw;
		System.out.print("Enter balance of your account as of now is:"+bal);
	}//End of withdraw function
	void transfer(account x , int a){
		x.bal+=a;
		this.bal-=a;
	}//End of withdraw function
	
}//End of class account 


public class accountclass{
	
	public static void main(String args[]){
		account a1 = new account();
		account a2 = new account();	
		Scanner sc = new Scanner(System.in);
		int choice;
			int user; 
			Scanner sc1 = new Scanner(System.in);
			while(true){
				System.out.println("\n This bank can perform the following tasks: \n 1.Display \n 2.Deposit \n 3.Withdraw \n 4.Transfer  \n 5.Exit");
				System.out.print("Enter your choice ");
				choice = sc1.nextInt();	
				switch(choice){
					case 1:
							System.out.println("Which account holder are you?(1 or 2)");
							user = sc.nextInt();
							switch(user){
								case 1:
										a1.display();	
										break;
								case 2:
										a2.display();	
										break;
								default:
										System.out.println("user not found");					
							}//End of inner switch case	
							break;
					case 2:
							System.out.println("Which account holder are you?(1 or 2)");
							user = sc.nextInt();
							switch(user){
								case 1:
										a1.deposit();	
										break;
								case 2:
										a2.deposit();	
										break;
								default:
										System.out.println("user not found");					
							}//End of inner switch case	
							break;
					case 3:
							System.out.println("Which account holder are you?(1 or 2)");
							user = sc.nextInt();
							switch(user){
								case 1:
										a1.withdraw();	
										break;
								case 2:
										a2.withdraw();	
										break;
								default:
										System.out.println("user not found");					
							}//End of inner switch case	
							break;
					case 4:
							int transferam;
							System.out.println("Welcome to transfer money function!");
							System.out.println("Which account holder are you?(1 or 2)");
							user = sc.nextInt();
							switch(user){
								case 1:
										System.out.println("Please enter the value to transfer");
										transferam=sc.nextInt();
										a1.transfer(a2,transferam);
										break;
								case 2:
										System.out.println("Please enter the value to transfer");
										transferam=sc.nextInt();
										a2.transfer(a1,transferam);
										break;
								default:
										System.out.println("user not found");					
							}//End of inner switch case
								
							break;
					case 5:
							System.exit(0);
							break;
					default:
							System.out.println("Invalid Choice");
							break;
							}	//End of switch case
				}	//End of while loop 
	}//End of main function 
	
}//End of accountclass class

/*
Output for the following code is:


universe@dell15:~/Desktop/8604$ java accountclass

 This bank can perform the following tasks: 
 1.Display 
 2.Deposit 
 3.Withdraw 
 4.Transfer  
 5.Exit
Enter your choice 1
Which account holder are you?(1 or 2)
1
The balance is :500

 This bank can perform the following tasks: 
 1.Display 
 2.Deposit 
 3.Withdraw 
 4.Transfer  
 5.Exit
Enter your choice 4
Welcome to transfer money function!
Which account holder are you?(1 or 2)
1
Please enter the value to transfer
500

 This bank can perform the following tasks: 
 1.Display 
 2.Deposit 
 3.Withdraw 
 4.Transfer  
 5.Exit
Enter your choice 1
Which account holder are you?(1 or 2)
1
The balance is :0

 This bank can perform the following tasks: 
 1.Display 
 2.Deposit 
 3.Withdraw 
 4.Transfer  
 5.Exit
Enter your choice 

*/
