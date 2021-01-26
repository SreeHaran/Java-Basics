/* 
Assign and Print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'. 
*/
class Student{
	private int mRollNumber;
	private String mName, mAddress, mPhoneNumber;
	public Student(String name, int rollNumber, String phoneNumber, String address){
		mName = name;
		mRollNumber = rollNumber;
		mPhoneNumber = phoneNumber;
		mAddress = address;
	}
	public void print(){
		System.out.println("The details of " + mName +" are: ");
		System.out.println("rollNumber:" + mRollNumber);
		System.out.println("phoneNumber:" + mPhoneNumber);
		System.out.println("address:" + mAddress+"\n");
	}
}
class Main{
	public static void main(String args[]){
		Student Sam = new Student("Sam", 57, "8562397414", "34, JS Street, S.N.Palayam, Coimbatore");
		Sam.print();
		Student John = new Student("John", 43, "9789397414", "56B, Java Street-2, P.N.Pudur, Coimbatore");
		John.print();
	}
}