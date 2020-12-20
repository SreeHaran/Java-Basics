/*Write a java program to create your own exception. Print all the candidates who are eligible to vote. The vote method should throw an exception if the age limit is less than 18.*/
import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str){
		System.out.println("InvalidAgeException: " + str);
	}
}

class Exp1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		try{
			if(age < 18){
				throw new InvalidAgeException(Integer.toString(age)+" is less than 18");
			}else{
				System.out.println("Eligible to vote");
			}
		}catch(InvalidAgeException e){
			System.out.println(e);
		}
	}
}
