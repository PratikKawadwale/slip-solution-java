/* Q2) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
Create an array of n player objects .Calculate the batting average for each player using static
method avg(). Define a static sort method which sorts the array on the basis of average. Display
the player details in sorted order. */
import java.util.Scanner;
import java.util.Scanner.*;
class cricketplayer1
{
  String name;
  int noing,notout,total;
  double batavg;
  cricketplayer1(String name,int noing,int notout,int total)
  {
	  this.name=name;
	  this.noing=noing;
	  this.notout=notout;
	  this.total=total;
	  this.batavg=batavg(noing,notout,total);
  }
  static double batavg(int noing,int notout,int total)
  {
	  return total/(noing-notout);
  }
  void disp()
  {
	  System.out.println("Name="+name);
	  System.out.println("No_of_ining="+noing);
	  System.out.println("No_of_notout="+notout);
	  System.out.println("totalruns="+total);
	  System.out.println("Batavg="+batavg);
	  
  }
}
public class slip18q2 
{
   public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter no of player=");
	  int n=sc.nextInt();
	  
	  cricketplayer ob[]=new cricketplayer[n];
	  
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("Enter player name=");
		  String nm=sc.next();
		  System.out.println("Enter no_of_inning=");
		  int noing=sc.nextInt();
		  System.out.println("Enter No_of_time_notout=");
		  int notout=sc.nextInt();
		  System.out.println("Enter Total run=");
		  int total=sc.nextInt();
		  
		  ob[i]=new cricketplayer(nm,noing,notout,total);
	  }
	 
	  sort(ob,n);
	 
	  System.out.println("\n Display player information");
	  for(int i=0;i<n;i++)
	  {
		  System.out.println();
		  ob[i].disp();
	  }
   }
	  static void sort(cricketplayer[] ob,int n)
	  {
		  cricketplayer temp;
	      for(int i=0;i<n;i++)
	      {
	    	  for(int j=0;j<n-i-1;j++)
	    	  {
	    		  if(ob[j].batavg<ob[j+1].batavg)
	    		  {
	    			  temp=ob[j];
	    			  ob[j]=ob[j+1];
	    			  ob[j+1]=temp;
	    		  }
	    	  }
	      }  
   }
}