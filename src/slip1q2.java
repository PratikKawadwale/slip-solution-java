/* Q2) Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of
OfficeStaff and display all details. */
import java.util.*;
abstract class staff
{
  protected int id;
  protected String name;
  staff(int id,String name)
  {
	  this.id=id;
	  this.name=name;
  }
}
class Officestaff extends staff
{
	String dept;
	Officestaff(int id,String name,String dept)
	{
		super(id,name);
		this.dept=dept;
	}
	void disp()
	{
		System.out.println("Staff id:"+id);
		System.out.println("Staff name:"+name);
		System.out.println("Staff dept:"+dept);
	}
}
public class slip1q2 
{
 public static void main(String[] args) 
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of staff=");
   int n=sc.nextInt();
   Officestaff ob[]=new Officestaff[n];
   
   for(int i=0;i<n;i++)
   {
	   System.out.println("Enter id=");
	   int id=sc.nextInt();
	   System.out.println("Enter name=");
	   String nm=sc.next();
	   System.out.println("Enter dept=");
	   String dt=sc.next();
	   ob[i]=new Officestaff(id,nm,dt);
   }
   System.out.println("\nDisplay staff information=");
   for(int i=0;i<n;i++)
   {
	   System.out.println();
	   ob[i].disp();
   }
}
}
