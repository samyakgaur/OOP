import java.lang.*;
import java.util.*;
import java.io.*;
class invalidexception extends Exception{
    // invalidexception(){}
    invalidexception(String s){
            super(s);
        }
    public String toString(){
        return "Candidate is not an Adult";
    }
}//End of class
public class invalidage_super{
    static void validate (int age) throws invalidexception{
        if (age<18)
            throw new invalidexception("You are not allowed to vote");
        else 
            System.out.println("You can vote ");
    }//end of validate function 
    public static void main(String args[])
    {
        try{
            Scanner sc= new Scanner(System.in);
            System.out.print("Please enter your age:");
            int age = sc.nextInt();
            validate(age);
        }//End of try block
        catch(invalidexception e){
         	System.out.println("Exception occured: "+e);
      	    }
	    catch(InputMismatchException e){
		    System.out.println("Age is integer value \n"+e);
            }
        System.out.println("rest of the code..."); 
    }//End of main function 
}//end of parent class