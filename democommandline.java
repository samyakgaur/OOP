
import java.util.*;
import java.lang.*;

class LessNumberofArgs extends Exception{
    String s;
    int a;
	LessNumberofArgs(String s,int a){
		this.s=s;
		this.a=a;
	}
	public String toString(){
		return a+" "+s+" Enter Atleast Five Numbers";
	}
}

class democommandline{
	public static void main(String args[]){
    	try{
    			if(args.length<5){
    				throw new LessNumberofArgs("Too Few Arguments",args.length);
    			}
    			else{
    				double sum=0.0;
    				for(int i=0;i<args.length;i++){
    					sum=sum+Integer.parseInt(args[i]);
    				}
    				System.out.println("Sum is "+sum);
    			}
    	 }
      catch(LessNumberofArgs lae){
      	 System.out.println(lae);
      }
      catch(NumberFormatException e){
      	System.out.println(e);
      }
      System.out.println("After try-catch");
   }
}
      	
