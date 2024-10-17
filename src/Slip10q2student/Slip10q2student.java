package Slip10q2student;
class Studentinfo
{
  public int r_no;
  public String name,clas;
  public int a,b,c,d,e,f;
  int sum=0;
  double per;
  public void display()
  {
	  System.out.println("Roll_no="+r_no);
	  System.out.println("Name="+name);
	  System.out.println("class="+clas);
	  System.out.println("---MARKS---");
	  System.out.println("sub1="+a);
	  System.out.println("sub2="+b);
	  System.out.println("sub3="+c);
	  System.out.println("sub4="+d);
	  System.out.println("sub5="+e);
	  System.out.println("sub6="+f);
	  System.out.println("Total="+sum);
	  System.out.println("Percentage="+per);
	  System.out.println("------------");
  }
}
public class Slip10q2student extends Studentinfo
{
  public Slip10q2student(int roll,String nm,String clas,int m1,int m2,int m3,int m4,int m5,int m6)
  {
	  r_no=roll;
	  this.clas=clas;
	  name=nm;
	  a=m1;
	  b=m2;
	  c=m3;
	  d=m4;
	  e=m5;
	  f=m6;
	  sum=a+b+c+d+e+f;
	  per=sum/6;
  }
}
