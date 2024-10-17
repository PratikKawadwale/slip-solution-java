/* Q1) Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
information using toString(). */
import java.util.*;
class emp
{
	int id,sal;
	String ename,des;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id=");
		id=sc.nextInt();
		System.out.println("Enter emp name");
		ename=sc.next();
		System.out.println("Enter des=");
		des=sc.next();
		System.out.println("Enter sal=");
		sal=sc.nextInt();
	}
	public String toString()
	{
		return "\n emp id="+id+"\n emp name="+ename+"\n emp desi="+des+"\n emp sal"+sal;
	}
}
public class slip6q1 
{
   public static void main(String[] args) 
   {
	  emp ob=new emp();
	  ob.accept();
		System.out.println(ob);
}
}
