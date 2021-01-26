/* Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named ‘Rectangle’ with a method named ‘Area’ which returns the area and length and breadth passed as parameters to its constructor. */
class Rectangle{
	private int mLength, mBreadth;
	public Rectangle(int length, int breadth){
		mLength = length;
		mBreadth = breadth;
	}
	public int Area(){
		int area = mLength*mBreadth;
		return area;
	}
}

class Main{
	public static void main(String[] args){
		Rectangle rect1 = new Rectangle(4,5);
		Rectangle rect2 = new Rectangle(5,8);
		System.out.println("The area of first rectanle is: " + rect1.Area());
		System.out.println("The area of second rectanle is: " + rect2.Area());
	}
}