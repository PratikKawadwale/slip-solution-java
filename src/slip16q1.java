// Q1) Write a program to find the Square of given number using function interface
import java.util.*;
interface Square 
{
	int calculate(int x);
}

public class slip16q1
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter NO :: ");
		int a = sc.nextInt();
		Square s = (int x) -> x * x;
		int ans = s.calculate(a);
		System.out.println("Square = "+ans);
   }
}
