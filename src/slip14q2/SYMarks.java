package slip14q2;

public class SYMarks 
{
  int ct,mt,et;
  public SYMarks(int ct,int mt,int et)
  {
	  this.ct=ct;
	  this.mt=mt;
	  this.et=et;
  }
 public void display()
  {
	  System.out.println("\nSy Marks");
	  System.out.println("Computer\tMaths\tElectronics");
	  System.out.println(ct+"\t"+mt+"\t"+et);
  }
}
