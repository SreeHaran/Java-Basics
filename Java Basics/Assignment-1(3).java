/*Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
Test Data Input an integer between 0 and 1000: 565 
Expected Output : The sum of all digits in 565 is 16 
*/

import java.util.Scanner;
class exp3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a integer between 0 and 1000: ");
		int integer = input.nextInt();
		int temp, i = 0;
		temp = integer;
		while(temp>0){
			i = i + (temp%10);
			temp /= 10;
		}
		System.out.println("The sum of all digits in "+ integer + " is " + i );
	}
}