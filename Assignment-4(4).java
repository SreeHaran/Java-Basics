/*Write a program that creates a package p1. The package p1 should contain a class called calculator with suitable methods for its operations. Write another program that uses the package p1 created.*/
import java.util.Scanner;
import p1.*;

class exp4{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two Integers: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		Calculator cal = new Calculator();
		System.out.println("Addition is: "+ cal.add(a,b));
		System.out.println("Subtraction is: "+ cal.sub(a,b));
		System.out.println("Multiplication is: "+ cal.mul(a,b));
		System.out.println("Division is: "+ cal.div(a,b));
	}
}