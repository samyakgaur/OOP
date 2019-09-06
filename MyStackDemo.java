import java.util.*;
import java.io.*;
import java.lang.*;

class MyStack
{
  int []a;
  int top;
MyStack()
{
  a=new int[5];
  top=-1;
}
MyStack(int n)
{
  a=new int [n];
  top=-1;
}
void push(int ele)
  {
	if(top==a.length-1)
	{
	System.out.println("stack is full");
	}
	else
	a[++top]=ele;
  }
int pop()
{
	if(top==-1)
	{
	System.out.println("Stack is empty");
	return -1;
	}
	else
	return a[top--];
}
boolean isEmpty()
{
	return top==-1;
}
int peek()
{
	if(isEmpty()){
		System.out.println("Stack is empty");
		return -1;
	}
	else
		return a[top];
}

void display(){
	for(int i=top;i>=0;i--){
		System.out.println(a[i]);
	}
}
}//End of class

class MyStackDemo
{
public static void main(String args[])throws IOException
{
	Scanner sc = new Scanner(System.in);
	MyStack s = new MyStack();
	// s= MyStack();
	while(true){
		System.out.println(" 1.PUSH \n 2.POP \n 3.isEmpty \n 4.Peek \n 5.Display");
		System.out.print("Enter the choice:");
		int n=sc.nextInt();
		switch(n){
			case 1:
				System.out.print("enter the element to be inserted:");
				int b=sc.nextInt();
				s.push(b);
				break;
			case 2:	
				int a=s.pop();
				System.out.print("Popped element is:"+a);
				break;
			case 3:
				int c = s.peek();
				System.out.print("Popped element is:"+c);
				break;
			case 4:
				s.display();
				break;
			default:
				System.out.println("Enter a valid choice");
		}//End of switch case 
	}//End of while loop 
}//End of main 
}//End class 


