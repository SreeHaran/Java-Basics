/*Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the 
strings must be 1 and above.*/
import java.util.Scanner;
class Exp2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the First String: ");
		String str1 = input.nextLine();
		System.out.print("Enter the Second String: ");
		String str2 = input.nextLine();
		if(str1.length()>1 || str2.length()>1){
			System.out.println(str1.substring(1)+str2.substring(1));
		}else{
			System.out.println("The entered string is less than or equal to one character");
		}
	}
}