//Q1) Write a Program to print all Prime numbers in an array of ‘n’ elements.(use command line arguments)
public class slip1q1 
{
  public static void main(String[] args) 
  {
	 int a[]=new int[20];
	 for(int i=0;i<args.length;i++)
	 {
		 a[i]=Integer.parseInt(args[i]);
	 }
	 for(int i=0;i<args.length;i++)
	 {
		 int p=0;
		 for(int j=2;j<a[i];j++)
		 {
			 if(a[i]%j==0)
			 {
				 p=1;
			 }
		 }
		 if(p==0)
		 {
			 System.out.println(a[i]);
		 }
	 }
  }
}
