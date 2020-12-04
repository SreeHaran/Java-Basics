/*Write Java program to read input from java console. (DON’T USE Scanner Class)*/
import java.io.*;
class Exp4{
	public static void main(String args[])throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		String name = new String(reader.readLine());
		System.out.println("Name is: " + name);
	}
}