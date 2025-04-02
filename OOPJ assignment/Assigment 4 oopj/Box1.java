/* Q3. Box Area and Volume 
Write a class Box with three member variables: height, width, and breadth. 
Include appropriate constructors to initialize these variables.
 Also, implement two methods: 
getVolume() to return the volume of the box 
getArea() to return the surface area of the box 
Create two instances of the Box class and display their volumes and surface areas. */

import java.util.Scanner;
class Box{
         double height,width,breadth,Volume,Area;
		 
		 Box(double height,double width ,double breadth){
		 this.height=height;
		 this.width=width;
		 this.breadth=breadth;
		 }
		 void getVolume(){
		 Volume= height*width*breadth;
		 System.out.println("Volume is: "+Volume);
		 }
		 void getArea(){
		 Area=2*(breadth*width + breadth*height + width*height);
		 System.out.println("Area is: "+Area);
		 }
		 
}
class Box1{
          public static void main(String[] args){
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter height: ");
		  double height=sc.nextDouble();
		  System.out.println("enter width: ");
		  double width=sc.nextDouble();
		  System.out.println("enter breadth: ");
		  double breadth=sc.nextDouble();
		  
		  Box b=new Box(height,width,breadth);
		  b.getVolume();
		  b.getArea();
		  }
}