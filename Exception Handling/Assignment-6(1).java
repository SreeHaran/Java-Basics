/*Write a java program to use any three unchecked Exceptions.*/

class exp1{
	public static void main(String args[]){
		int arr1[] = {23,0,5,8};
		String name = null;
		try{
			System.out.println(arr1[0]/arr1[1]);
			System.out.println(arr1[6]);
			System.out.println(name);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(NullPointerException e){
			System.out.println(e);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}