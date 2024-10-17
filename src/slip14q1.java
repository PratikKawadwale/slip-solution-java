/* Q1) Write a program to accept a number from the user, if number is zero then throw user defined
exception “Number is 0” otherwise check whether no is prime or not (Use static keyword). */
import java.util.*;
class slip14 extends Exception
{
	
}
public class slip14q1 
{
   static int f=0;
   public static void main(String[] args) 
   {
	  int no,i,j;
	  Scanner sc=new Scanner(System.in);
	  try
	  {
		  System.out.println("Enter no");
		  no=sc.nextInt();
		  
		  if(no==0)
		    throw new slip14();
		  if(no>0)
		  {
			  for(i=2;i<=no/2;i++)
			  {
				  if(no%i==0)
				  {
					  f++;
				  }
			  }
		  }
		  if(f==0)
		      System.out.println("No is prime");
		  else
			  System.out.println("no is not prime");
	  }
	  catch(slip14 ob)
	  {
		  System.out.println("no can not be zero");
	  }
   }
}
