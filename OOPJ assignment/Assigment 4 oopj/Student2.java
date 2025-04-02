/* Q2. Student Marks and Average 
Create a class Student with the following members: 
 Name of the student 
  Marks in three subjects 
  A method to assign initial values 
  A method to compute the total and average marks 
  A method to display the student’s name and total marks 
Write a main() method to demonstrate the functionality of the class. */

import java.util.Scanner;
class Student{
	
    String StdName;
	int Marks1,Marks2,Marks3,Total;
	double Average;
	
	void set(String name,int m1,int m2,int m3){
	StdName=name;
	Marks1=m1;
	Marks2=m2;
	Marks3=m3;
	}
	void TotalAvg(){
	Total=Marks1+Marks2+Marks3;
	Average=Total/3.0;
	
	}
	void display(){
	 System.out.println("Student name: "+StdName);
	 System.out.println("Total marks: "+Total);
	 System.out.println("Average: "+Average);
	}
	
}
class Student2{
              public static void main(String[] args){
			  Scanner sc=new Scanner(System.in);
			  System.out.println("enter student name: ");
			  String StdName=sc.nextLine();
			  System.out.println("enter sub1 marks: ");
			  int Marks1=sc.nextInt();
			  System.out.println("enter sub2 marks: ");
			  int Marks2=sc.nextInt();
			  System.out.println("enter sub3 marks: ");
			  int Marks3=sc.nextInt();
	
			  Student s1=new Student();
			  s1.set(StdName,Marks1,Marks2,Marks3);
			  s1.TotalAvg();
			  s1.display();
			  }
}