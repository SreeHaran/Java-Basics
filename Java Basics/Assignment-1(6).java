import java.util.Scanner;
class exp6{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Input weight in pounds: ");
		double weight = input.nextDouble();
		System.out.println("Input height in inches: ");
		double inches = input.nextDouble();
		
		double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
		
        System.out.println("Body Mass Index is " + BMI +"\n");
	}
}