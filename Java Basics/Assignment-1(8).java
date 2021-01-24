/* Write a Java program that reads a number and display the square, cube, and fourth power. 
Test Data:
Input: 2
Expected Output: Square: 4
Cube: 8
Fourth power: 16 */

import java.util.Scanner;

class exp8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		
		System.out.println("Square: "+ Math.pow(num,2));
		System.out.println("Cube: "+ Math.pow(num,3));
		System.out.println("Fouth Power: "+ Math.pow(num,4));
	}
}