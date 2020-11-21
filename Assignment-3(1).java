/* We want to calculate the total marks of each student of a class in Physics, Chemistry and Mathematics and the average marks of the class. The number of students in the class are entered by the user. Create a class named Marks with data members for roll number, name and marks. Create three other classes inheriting the Marks class, namely Physics, Chemistry and Mathematics, which are used to define marks in individual subject of each student. Roll number of each student will be generated automatically. */
import java.util.Scanner;

class Marks{
	public int rollNo, marks, avgmarks;
	public String name;
}
class Physics extends Marks{
	
}
class Chemistry extends Marks{
	
}
class Mathematics extends Marks{
	
}
class exp1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int noOfStudents = input.nextInt();
		Physics[] phy = new Physics[noOfStudents];
		Chemistry[] chem = new Chemistry[noOfStudents];
		Mathematics[] math = new Mathematics[noOfStudents];
		for(int i = 0; i<noOfStudents; i++){
			phy[i] = new Physics();
			chem[i] = new Chemistry();
			math[i] = new Mathematics();
			phy[i].rollNo = chem[i].rollNo = math[i].rollNo = i+1;
		}
		
		int totalPhyMarks = 0;
		int[] phyMarks= new int[noOfStudents];
		System.out.println("Enter the physics marks of all the students:");
		for(int elements: phyMarks){
			elements = input.nextInt();
			totalPhyMarks +=elements;
		}
		int totalChemMarks = 0;
		int[] chemMarks= new int[noOfStudents];
		System.out.println("Enter the Chemistry marks of all the students:");
		for(int elements: chemMarks){
			elements = input.nextInt();
			totalChemMarks +=elements;
		}
		
		int totalMathMarks = 0;
		int[] mathMarks= new int[noOfStudents];
		System.out.println("Enter the Mathematics marks of all the students:");
		for(int elements: mathMarks){
			elements = input.nextInt();
			totalMathMarks +=elements;
		}
		
		System.out.println("Total marks of each students in Physics class is: "+ totalPhyMarks);
		System.out.println("Total marks of each students in Chemistry class is: "+ totalChemMarks);
		System.out.println("Total marks of each students in Mathematics class is: "+ totalMathMarks);
		System.out.println("Average marks of all the classes is: "+ (totalPhyMarks + totalChemMarks + totalMathMarks)/3);
	}
}