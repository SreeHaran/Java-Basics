/*1. Write a Java program to convert temperature from Fahrenheit to Celsius
degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius*/

import java.util.Scanner;
class exp1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a degree in Fahrenheit: ");
		float Fahrenheit = input.nextFloat();
		
		float Celsius;
		Celsius = (5*(Fahrenheit - 32))/9;
		System.out.println(Fahrenheit + " degree Fahrenheit is equal to to " + Celsius + " in Celsius");
	}
}