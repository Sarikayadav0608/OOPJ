/* Q1. Room Volume Calculation Design a class named Room with three data members:
 height, width, and breadth. Include a method volume() to compute and return the
 volume of the room. Create a separate class RoomDemo that creates instances 
 of the Room class and displays the volume for each instance.*/
 
 import java.util.Scanner;
 class Room{
       double height,width,breadth,volume;
	   Room(double height,double width,double breadth)
	   {
	    this.height=height;
		this.width=width;
		this.breadth=breadth;
	   }
	   double volume(){
	   return height*width*breadth;
	   }
	  
 }
 class RoomDemo{
	 public static void main(String[] args){
		      Scanner sc = new Scanner(System.in);
			  System.out.println("Enter room number");
			  int i=sc.nextInt();
			  for(int x=1;x<=i;x++){
				  System.out.println("enter height: ");
				  double height=sc.nextDouble();
				  System.out.println("enter width: ");
				  double width=sc.nextDouble();
				  System.out.println("enter breadth: ");
				  double breadth=sc.nextDouble(); 
				 Room room=new Room(height,width,breadth); 
				 System.out.println("volume of room"+x+" is: "+room.volume());
			  }
			
			   
	 }
 }