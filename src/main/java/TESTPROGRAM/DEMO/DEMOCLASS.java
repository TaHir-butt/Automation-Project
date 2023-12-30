package TESTPROGRAM.DEMO;

import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
	
	public void color() {
        System.out.println("Yellow");
    }
}
class Car extends  Vehicle{
    public void color() {
        System.out.println("Green");
    }
}
class Bike extends Vehicle {
    public void color() {
        System.out.println("Red");
    }
}
//polymorphism program
public class DEMOCLASS {
	
	public static void main(String[] args) {
		
		Vehicle myBikecolor = new Bike();
		Vehicle myVehicle = new Car();

		myBikecolor.color();
		myVehicle.color();

		
		    /*DEMOCLASS course = new DEMOCLASS(); 
			course.text(); */		   
		        
		        
		 	/*int NUMBER = 10;
	        System.out.println("Integer value: " + NUMBER);

	   
	        double DECIMAL = 5.75;
	        System.out.println("Decimal value: " + DECIMAL);

	        
	        String TEXT = "This is a demo program!";
	        System.out.println("Text value: " + TEXT);*/
		
		/*int[] demoArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;
        while (i < demoArray.length) {
            System.out.println(demoArray[i]);
            i++;
        }*/
		
		
		/*double[] demoArray = new double[5]; // fixed size of 5

		demoArray[0] = 1.1;
		demoArray[1] = 2.2;
		demoArray[2] = 3.3;
		demoArray[3] = 4.4;
		demoArray[4] = 5.5;

		System.out.println(demoArray[2]);*/
		

		// Double ArrayList
		/*ArrayList<Double> demoArray = new ArrayList<>(); // ArrayList

		demoArray.add(1.1);
		demoArray.add(2.2);
		demoArray.add(3.3);
		demoArray.add(4.4);
		demoArray.add(5.5);

		System.out.println(demoArray.get(4)); */
		
		//DataType: That define the type of data that a variable can hold
		
		/*int number=10;
		String text="test message";
		double decimalValue=2.5;
		boolean demoFx = true;
		int[] demoArray = {1, 2, 3, 4, 5};
		demoArray[0] = 10;
		demoArray[1] = 9;
		demoArray[2] = 8;
		

		System.out.println(number);
		System.out.println(text);
		System.out.println(decimalValue);
		System.out.println(demoFx);
		System.out.println(demoArray[2]);*/
		
		//Write a program which Print table of 9 upto 10 using for loop.

		/*int number = 9;
		int upTo = 10;

		        for (int i = 1; i <= upTo; i++) {
		            int table = number * i;
		            System.out.println(number + " * " + i + " = " + table);
		        }*/
		
		//Write a program that print any string in reverse order.

		/*String inputString = "QA GROUP LAHORE"; 

        char[] demoArray = inputString.toCharArray();
        for (int i = demoArray.length - 1; i >= 0; i--) {
            System.out.print(demoArray[i]);
        }*/
		//Write a program if user gives even number it print “qa jobs in lahore” and if user give odd number it prints “automation testing course”.

		   /*Scanner input = new Scanner(System.in);

		   System.out.print("Enter a random number: ");
		   int number = input.nextInt();

		   if (number % 2 == 0) {
		            System.out.println("QA jobs in Lahore");
		   } 
		   
		   else {
		            System.out.println("Automation testing course");*/
//Create a class and its object and create a method which displays “welcome to automation testing course” using class and object.		   
		
	

	}

}
