/*
Java Program to find the frequency of each element in the array 
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
		
		System.out.print("Enter the element to which you need to find the frequency: ");
		int freq = input.nextInt();
		int count = 0;
		for(int element : arr){
			if(element == freq){
				count += 1;
			}
		}
		if(count == 0){
			System.out.println("The element not found in the array.");
			return;
		}
		System.out.println("The element " + freq + " is found " + count + " times");
	}
}