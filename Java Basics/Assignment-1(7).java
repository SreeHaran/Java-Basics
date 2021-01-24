/* Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).  
Test Data Input distance in meters: 2500  Input hour: 5  Input minutes: 56 Input seconds: 23 
Expected Output : Your speed in meters/second is 0.11691531  Your speed in km/h is 0.42089513  Your speed in miles/h is 0.26158804 
*/
import java.util.Scanner;

class exp7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		float timeSeconds;
		float mps, kph, mph;
		
		System.out.println("Input distance in meters: ");
		int meters = input.nextInt();
		System.out.println("Input hour: ");
		int hour = input.nextInt();
		System.out.println("Input minutes: ");
		int minutes = input.nextInt();
		System.out.println("Input seconds: ");
		int seconds = input.nextInt();
		
		timeSeconds = (hour*3600)+ (minutes*60) + seconds;
		mps = meters/timeSeconds;
		kph = (meters/1000)/(timeSeconds/3600);
		mph = kph / 1.609f;
		
		System.out.println("Your speed in meters/second is "+ mps);
		System.out.println("Your speed in km/h is "+ kph);
		System.out.println("Your speed in miles/h is "+ mph);
	}
}