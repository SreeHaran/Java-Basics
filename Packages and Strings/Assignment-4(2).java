/*Write a Java Program to find whether a string is palindrome or not.*/
import java.util.Scanner;
class exp2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String value = input.nextLine().toLowerCase();
		boolean flag = true;
		for(int i = 0, j = value.length()-1 ; i < value.length() ; i++){
			if(value.charAt(i) != value.charAt(j)){
				flag = false;
				break;
			}
			--j;
		}
		if(flag){
			System.out.println("The input string is a palindrome.");
		} else{
			System.out.println("The input string is not a palindrome.");
		}
	}
}