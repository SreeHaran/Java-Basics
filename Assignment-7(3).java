/*Write a java program to report an exception when the balance in your bank account is less than amount you want to withdraw.*/
import java.util.Scanner;

class LessBalanceException extends Exception{
	public LessBalanceException(String str){
		System.out.println("LessBalanceException: "+ str);
	}
}

class Exp3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int balance = 1000;
		System.out.print("Enter the withdrawal amount: ");
		int withdrawal = input.nextInt();
		try{
			if(withdrawal>balance){
				throw new LessBalanceException("The balance is lesser than the withdrawal amount");
			}else{
				System.out.println(withdrawal + " has been debited from your account");
				balance -= withdrawal;
			}
		}catch(LessBalanceException e){
			System.out.println(e);
		}
	}
}