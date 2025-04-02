/* Q6. Electricity Bill Calculation – Java Program 
Design a Java program to calculate the electricity bill for a customer based on the number of units 
consumed. Implement a class named ElectricityBill with the following specifications: 
Class: ElectricityBill 
Instance Variables 
 customerName (String): Name of the customer 
 unitsConsumed (double): Number of electricity units consumed 
 billAmount (double): The calculated bill amount 
Constructor 
 A parameterized constructor to initialize the customerName and unitsConsumed fields. 
Method 
 void calculateBillAmount(): This method calculates the electricity bill amount based on the 
following tariff rules: 
 First 100 units: Rs. 5 per unit 
 Next 200 units (i.e., 101 to 300): Rs. 7 per unit 
 Remaining units (above 300): Rs. 10 per unit 
Main Program 
In the main() method: 
CDAC Mumbai 
1.  Create an object of the ElectricityBill class. 
2.  Set the customerName and unitsConsumed values (can be taken from user input or 
hardcoded). 
3.  Call the calculateBillAmount() method to compute the bill. 
4.  Display the customer's name, units consumed, and final bill amount. */

class ElectricityBill{
               String customerName;
			   double unitsConsumed,BillAmount;
			   
			   ElectricityBill(String customerName,double unitsConsumed)
			   {
			    this.customerName=customerName;
				this.unitsConsumed=unitsConsumed;
			   }
			   void calculateBillAmount(){
			   //Bill Amount=Units Consumed×Rate per Unit 
			   if(unitsConsumed<=100){
				        BillAmount=(unitsConsumed)*5;
			   }
			   else if(unitsConsumed>=101 && unitsConsumed<=300){
				   BillAmount=(unitsConsumed)*7;
			   }
			   else{
				   BillAmount=(unitsConsumed)*10;
			   }
			   }
			   void display(){
			       System.out.println("name of customer: "+customerName);
				   System.out.println("unit Consumed: "+unitsConsumed);
				   System.out.println("final bill amount: "+BillAmount);
			   }
			  
}
class ElectricityBillDemo{
               public static void main(String[] args){
			   ElectricityBill e=new ElectricityBill("Sarika",90);
			   e.calculateBillAmount();
			   e.display();
			   ElectricityBill e2=new ElectricityBill("Sakshi",305);
			   e2.calculateBillAmount();
			   e2.display();
			    }
}