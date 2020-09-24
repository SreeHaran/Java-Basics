/* Write a Java program to convert minutes into a number of years and days.  Test Data Input the number of minutes: 3456789 Expected Output : 3456789 minutes is approximately 6 years and 210 days */

import java.util.Scanner;
class exp4{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number of minutes: ");
		
		int mins = input.nextInt();
		double minsInYear = 60 * 24 * 365;
		long years = (long) (mins / minsInYear);
        int days =  (mins / 60 / 24) % 365;
		
		System.out.println("minutes is approximately " + years +" years and "+ days +" days" );
	}
}