/* Q1) Write a program to create parent class College(cno, cname, caddr) and derived class
Department(dno, dname) from College. Write a necessary methods to display College details. */
import java.util.*;
class college
{
	int cno;
	String cname,caddr;
	
}
class department extends college
{
	int dno;
	String dname;
	void accept()
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter college no=");
      cno=sc.nextInt();
      System.out.println("Enter college name=");
      cname=sc.next();
      System.out.println("Enter college address=");
      caddr=sc.next();
      System.out.println("Enter department no=");
      dno =sc.nextInt();
      System.out.println("Enter department name=");
      dname = sc.next();
	}
	void disp()
	{
		System.out.println("college no="+cno);
		System.out.println("college name="+cname);
		System.out.println("college address="+caddr);
		System.out.println("Department no="+dno);
		System.out.println("Deparment name="+dname);
	}
}
public class slip12q1 
{
  public static void main(String[] args) 
  {
	 department ob=new department();
	 ob.accept();
	 ob.disp();
  }
}
