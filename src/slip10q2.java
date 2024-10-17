/* Q2) Write a program to create a package name student. Define class StudentInfo with method to
display information about student such as rollno, class, and percentage. Create another class
StudentPer with method to find percentage of the student. Accept student details like
rollno, name, class and marks of 6 subject from user. */
import Slip10q2student.Slip10q2student;

import java.util.*;
public class slip10q2 
{
  public static void main(String[] args)
  {
	 String nm,clas;
	 int roll;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Roll No=");
	 roll=sc.nextInt();
	 System.out.println("Enter name=");
	  nm=sc.next();
	 System.out.println("Enter class=");
	  clas=sc.next();
	  int m1,m2,m3,m4,m5,m6;
	 System.out.println("Enter 6 sub mark=");
	 m1=sc.nextInt();
	 m2=sc.nextInt();
	 m3=sc.nextInt();
	 m4=sc.nextInt();
	 m5=sc.nextInt();
	 m6=sc.nextInt();
	Slip10q2student ob=new Slip10q2student(roll,nm,clas,m1,m2,m3,m4,m5,m6);
								 
	 ob.display();
  }
}
