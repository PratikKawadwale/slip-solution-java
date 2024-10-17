/* Q2) Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
Positive(+) and Need to Hospitalized” otherwise display its information. */
import java.util.*;
class covid extends Exception
{
	public String toString()
	{
		return "Patient is Covid Positive(+) and Need to Hospitalized";
	}
}
class patient 
{
	String pname;
	int age,olevel,hrct;
    void accept()
    {
    	try 
    	{
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter name age oxy level hrct");
    	  pname=sc.next();
    	  age=sc.nextInt();
    	  olevel=sc.nextInt();
    	  hrct=sc.nextInt();
    	  if(olevel<95 &&hrct>=10)
    		  throw new covid();
    	    System.out.println("patient name="+pname);
    	    System.out.println("patient age="+age);
    	    System.out.println("patient oxy level="+olevel);
    	    System.out.println("patient hrct="+hrct);
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
}
public class slip3q2 
{
	public static void main(String[] args) 
	 {
		patient ob=new patient();
		ob.accept();
		
	
	}
}
