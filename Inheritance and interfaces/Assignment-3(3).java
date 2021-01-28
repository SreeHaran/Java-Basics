/*Create an interface Polygon with area() as one function. Create classes rectangle and circle which implements the interface. Find the area of the rectangle and circle.*/
interface Polygon{
	public int area();
}
class Rectangle implements Polygon{
	int length, breadth;
	public Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public int area(){
		return this.length*this.breadth;
	}
}
class Circle implements Polygon{
	int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public int area(){
		return (int) 3.14*radius*radius;
	}
}
class exp3{
	public static void main(String args[]){
		Polygon poly = new Rectangle(5,3);
		System.out.println("The area of the rectangle is: "+poly.area());
		poly = new Circle(7);
		System.out.println("The area of the Circle is: "+poly.area());
	}
}

