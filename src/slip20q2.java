/*Q2) Write a package for Operation, which has two classes, Addition and Maximum. Addition has
two methods add () and subtract (), which are used to add two integers and subtract two,
float values respectively. Maximum has a method max () to display the maximum of two
integers */
import java.util.Scanner;
import Slip20.Maximum;

public class slip20q2 
{
	public static void main (String args[])
	{
		int n1,n2;
		float num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no=");
		n1=sc.nextInt();
		System.out.println("Enter second no=");
		n2=sc.nextInt();
		System.out.println("Enter third no=");
		num1=sc.nextFloat();
		System.out.println("Enter fourth no=");
		num2=sc.nextFloat();
		Maximum ob1=new Maximum(n1,n2,num1,num2);
		ob1.add();
		ob1.sub();
		ob1.max();
		
		sc.close();
	}
}