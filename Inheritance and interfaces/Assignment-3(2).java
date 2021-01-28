/*
Create a class called Employee whose objects are records for an employee. This class will be a derived class of the class Person which you will have to copy into a file of your own and compile. An employee record has an employee’s name (inherited from the class Person), an annual salary represented as a single value of type double, a year the employee started work as a single value of type int and a national insurance number, which is a value of type String. Your class should have a reasonable number of constructors and accessor methods. Write a main method to fully test your class definition. 
*/
import java.util.Scanner;

class Person{
	String name;
	
	public Person(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
class Employee extends Person{
	double annualSalary;
	int startedYear;
	String insuranceNumber;
	
	public Employee(String name, double annualSalary, int startedYear, String insuranceNumber){
		super(name);
		this.annualSalary = annualSalary;
		this.startedYear = startedYear;
		this.insuranceNumber = insuranceNumber;
	}
	public double getAnnualSalary(){
		return this.annualSalary;
	}
	public int getStartedYear(){
		return this.startedYear;
	}
	public String getInsuranceNumber(){
		return this.insuranceNumber;
	}
}
class exp2{
	public static void main(String[] args){
		Employee emp = new Employee("Ram", 50000, 2019, "SH2303Y2002");
		System.out.println("Name of the Employee is:  " + emp.getName());
		System.out.println("Salary of the Employee is:  " + emp.getAnnualSalary());
		System.out.println("Year the Employee started to work is:  " + emp.getStartedYear());
		System.out.println("Insurance Number of the Employee is:  " + emp.getInsuranceNumber());
	}
}















