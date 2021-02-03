/*Given two strings as input. Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.*/
import java.util.Scanner;
class Exp1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first String: ");
		String str1 = input.nextLine();
		System.out.print("Enter the second String: ");
		String str2 = input.nextLine();
		System.out.println(new StringBuilder(str1 + str2).reverse());		
	}
}