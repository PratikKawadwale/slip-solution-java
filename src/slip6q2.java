/* Q2) Create an abstract class “order” having members id, description. Create two subclasses
“Purchase Order” and “Sales Order” having members customer name and Vendor name
respectively. Define methods accept and display in all cases. Create 3 objects each of Purchase
Order and Sales Order and accept and display details */
import java.util.*;
abstract class order
{
	int id;
	String des;
	public order(int id,String des)
	{
		this.id=id;
		this.des=des;
	}
	void disp()
	{
		System.out.println("\n order id="+id);
		System.out.println("\n description="+des);
	}
}
class purchesorder extends order
{
    String vn;
	public purchesorder(int id, String des,String vn)
	{
		super(id, des);
		this.vn=vn;
	}
	void disp()
	{
		super.disp();
		System.out.println("\n vendor name="+vn);
	}
	
}
class salesorder extends order
{
	String cn;
	public salesorder(int id, String des,String cn) 
	{	
		super(id, des);
		this.cn=cn;
	}
    void disp()
    {
    	super.disp();

    	System.out.println("Customer name="+cn);
    }
	
}
public class slip6q2 
{
   public static void main(String[] args) 
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter no of order=");
	 int n=sc.nextInt();
	 
	 purchesorder obp[]=new purchesorder[n];
	 salesorder obs[]=new salesorder[n];
	 
	 for(int i=0;i<n;i++)
	 {
		 System.out.println("Enter order id=");
		 int id=sc.nextInt();
		 System.out.println("Enter Description=");
		 String des=sc.next();
		 System.out.println("Enter customer name=");
		 String cn=sc.next();
		 System.out.println("Enter vendor name=");
		 String vn=sc.next();
		 
		 obp[i]=new purchesorder(id,des,vn);
		 obs[i]=new salesorder(id,des,cn);
	 }
	 System.out.println("\n purches order details=");
	 for(int i=0;i<n;i++)
	 {
		 System.out.println();
		 obp[i].disp();
	 }
	 System.out.println("\n sales order details=");
	 for(int i=0;i<n;i++)
	 {
		 System.out.println();
		 obs[i].disp();
	 }
}
}
