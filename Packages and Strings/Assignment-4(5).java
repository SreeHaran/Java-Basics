/*Write a program that creates a package str with a class Mystring with suitable methods for the question numbers 1,2,3. Write another program to use the package.*/
import str.*;
import java.util.Scanner;
class exp5{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String value = input.nextLine();
		MyString myStr = new MyString();
		myStr.count(value);
		myStr.palindrome(value);
		myStr.repeating(value);
	}
}