/*
Java Program to print the duplicate elements of an array 
*/
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int num = input.nextInt();
		int[] arr = new int[num];
		
		System.out.print("Enter the elements of the array: ");
		for(int i = 0; i<num;i++){
			arr[i] = input.nextInt();
		}
		
		int duplicate = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j =  i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					duplicate = arr[j];
					System.out.println(duplicate + " is a duplicate element.");
					break;
				}
			}
		}
	}
}