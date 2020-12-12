/*
Create a java program to handle the I/O exceptions.
*/
import java.io.*;

class Exp2{
	public static void main(String args[]){
		try{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int number = Integer.parseInt(reader.readLine());
		System.out.println("The number is: " + number);
		}catch(IOException e){
			System.out.println(e);
		}
	}
}