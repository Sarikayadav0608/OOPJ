/* Q5. BMI Calculator 
Design a Java program to implement a BMI (Body Mass Index) calculator. The program should 
consist of a class named BMICalculator with the following specifications:  
Class: BMICalculator 
Fields 
  height (double): To store the height of the person in meters. 
 weight (double): To store the weight of the person in kilograms. 
Constructors 
 A parameterized constructor to initialize the height and weight fields. 
Methods 
 Getter and Setter methods for both height and weight. 
 double calculateBMI(): This method calculates and returns the BMI using the formula: 
BMI=weight(height×height).
Main Program : Write a separate class containing the main() method to 
1.  Create an object of the BMICalculator class. 
2.  Prompt the user to enter their height and weight. 
3.  Use setter methods to assign these values to the object. 
4.  Call the calculateBMI() method to compute the BMI. 
5.  Print the calculated BMI to the console. */

import java.util.Scanner;
class BMICalculator{
            double height,weight;
			
			BMICalculator(double height,double weight)
			{
			this.height=height;
			this.weight=weight;
			}
			//getter & setter for height
			double getHeight()
			{
			return height;
			}
			void setHeight(double height)
			{
			this.height=height;
			}
			//getter & setter for weight
			double getWeight()
			{
			return weight;
			}
			void setWeight(double weight)
			{
			this.weight=weight;
			}
			
			double calculateBMI(){
			double BMI=weight/(height*height);
			System.out.printf("calculated BMI: %.2f",BMI);
			return BMI;
			}
}
class BMI{
          public static void main(String[] args){
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter height (in meters) : ");
		  double height=sc.nextDouble();
		  System.out.println("enter weight (in kilograms) : ");
		  double weight=sc.nextDouble();
		  
		  BMICalculator b=new BMICalculator(height,weight);
		  
		  
		  b.calculateBMI();
		  sc.close();
		  }  
}