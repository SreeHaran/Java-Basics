/*Write a Java program to write methods for deposit and withdrawal functions of a bank. The methods should be synchronized in such a way when a user is depositing the amount, the withdrawal should not occur.*/
import java.util.Scanner;
class Bank extends Thread{
	int mBalance;
	public Bank(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the balance: ");
		int balance = input.nextInt();
		mBalance = balance;
	}
	public void function(int money, int operation){
		if(operation == 1){
			mBalance += money;
			System.out.println(money + " has been deposited from your account");
			System.out.println("Balance in your account: " + mBalance);
		}else if(operation ==2){
			if(mBalance>money){
				mBalance -= money;
				System.out.println(money + " has been withdrawed to your account");
				System.out.println("Balance in your account: " + mBalance);
			}else{
				System.out.println("The entered money is greater the balance");
			}
		}else{
			System.out.println("Enter a valid number");
		}
	}
	synchronized public void run(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the money to be deposited/withdrawed:  ");
		int money = input.nextInt();
		System.out.print("1- Deposit 2- Withdraw:-  ");
		int operation = input.nextInt();
		function(money, operation);
	}
}
class Exp2{
	public static void main(String args[]){
		Bank b = new Bank();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}
}