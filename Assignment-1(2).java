/* Write a Java program that reads a number in inches, converts it to meters. 
 
Note: One inch is 0.0254 meter. 
 
Test Data 
 
Input a value for inch: 1000 Expected Output: 1000.0 inch is 25.4 meters 
*/

import java.util.Scanner;
class exp2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input value for inch: ");
		float inch = input.nextFloat();
		float meter;
		meter = inch*0.0254f;
		System.out.println(inch + " inch is " + meter+" meters");
	}
}