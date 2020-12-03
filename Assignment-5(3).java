/*Write a Java program to insert a word in the middle of another string.  Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
Sample Output: Python Tutorial 3.0*/
class Exp3{
	public static void main(String args[]){
		StringBuilder str = new StringBuilder("Python 3.0");
		str.insert(6," Tutorial");
		System.out.println(str);
	}
}