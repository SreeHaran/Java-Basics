/*
 Java Program to print the largest and smallest element in an array 
*/
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int num = input.nextInt();
		int[] arr = new int[num];
		System.out.print("Enter the elements of the array: ");
		for(int i = 0; i<num;i++){
			arr[i] = input.nextInt();
		}
		int largest = arr[0], smallest = arr[0];
		for(int i = 0; i<num-1;i++){
			if(arr[i]<smallest){
				smallest = arr[i];
			}
			if(arr[i]>largest){
				largest = arr[i];
			}
		}
		System.out.println("The smallest element in the array is: " + smallest);
		System.out.println("The largest element in the array is: " + largest);
	}
}