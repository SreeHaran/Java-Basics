/* Write a Java program to break an integer into a sequence of individual digits.  Test Data Input six non-negative digits: 123456 Expected Output : 1 2 3 4 5 6 
*/
import java.util.Scanner;

class exp10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input six non-negative digits: ");
		int num = input.nextInt();
		
		int n1 = num / 100000 % 10;
        int n2 = num / 10000 % 10;
        int n3 = num / 1000 % 10;
        int n4 = num / 100 % 10;
        int n5 = num / 10 % 10;
        int n6 = num % 10;
		System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
	}
}
