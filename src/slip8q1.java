/* Q1) Create a class Sphere, to calculate the volume and surface area of sphere.
(Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r)) */
import java.util.*;
class sphere
{
	sphere()
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter redius=");
	 Double r=sc.nextDouble();
     Double area=4*3.14*(r*r);
     Double volume=(4/3)*3.14*(r*r*r);
     System.out.println("Area="+area);
     System.out.println("Volume="+volume);
	}
}
public class slip8q1 
{
 public static void main(String[] args) 
 {
	sphere ob=new sphere();
	
 }
}
