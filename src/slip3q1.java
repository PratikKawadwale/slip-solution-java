/* Q1) Write a program to accept ‘n’ name of cities from the user and sort them in ascending
order. */
import java.util.*;
public class slip3q1 
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter limit:");
	int n=sc.nextInt();
	String cities[]=new String[n];
	System.out.println("Enter"+n+"Citie Name");
	for(int i=0;i<n;i++)
	{
		cities[i]=sc.next();
	}
	for(int i=0;i<n;i++)
	{
		String temp;
		for(int j=0;j<n-i-1;j++)
		{
			if((cities[j].compareTo(cities[j+1]))>0)
			{
				temp=cities[j];
				cities[j]=cities[j+1];
				cities[j+1]=temp;
			}
		}
	}
	System.out.println("\nCities Name in Sorted Order");
	for(int i=0;i<n;i++)
	{
		System.out.println(cities[i]);
	}
  }
}
