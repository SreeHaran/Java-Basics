/*Write a java program to report an exception when the password set by the user does not contain a character.*/
import java.util.Scanner;

class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String str){
		System.out.println("InvalidPasswordException: "+ str);
	}
}

class Exp2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the password: ");
		String password = input.nextLine();
		try{
			if(password.length()<=0){
				throw new InvalidPasswordException("The password must contain atleast one character");
			}else{
				System.out.println("Password Accepted");
			}
		}catch(InvalidPasswordException e){
			System.out.println(e);
		}
	}
}