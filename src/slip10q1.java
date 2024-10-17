//Q1) Write a program to find the cube of given number using functional interface.
import java.util.*;
interface cube
{
	void cube();
}
class q1 implements cube
{
	public void cube()
	{
		System.out.println("Enter no=");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		double cube=c*c*c;
		System.out.println("Cube of no="+cube);
	}
}
public class slip10q1
{
   public static void main(String[] args) 
   {
	  q1 ob=new q1();
	  ob.cube();
   }
}
