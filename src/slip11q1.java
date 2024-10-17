/*Q1) Define an interface “Operation” which has method volume( ).Define a constant PI having a value
3.142 Create a class cylinder which implements this interface (members – radius, height). Create
one object and calculate the volume */
import java.util.*;
interface Operation
{
	final static double pi=3.14;
	void area();
	void volume();
}
class cylinder implements Operation
{
	double r,h;
	public cylinder()
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter redius and hieght=");
        r=sc.nextDouble();
        h=sc.nextDouble();    
	}
	public void area()
	{
		double a=(2*pi*r*h)+(2*pi*r*h);
		System.out.println("the area of cylinder is " +a);
	}
	public void volume()
	{
		double v=pi*r*r*h;
		System.out.println("the volume of cylinder is "+v);
	}
}
public class slip11q1 
{
 public static void main(String[] args)
 {
    cylinder ob=new cylinder();
    ob.area();
    ob.volume();
}  
}
