/* Java Program to sort the elements of an array in ascending and descending order
*/
class Sorting{
	public Sorting(){}
	public void ascending(int[] a){
		int i, j, x;
		for(i=0;i<a.length;i++){
			for(j=0;j<(a.length-1);++j){
				if(a[j]>a[j+1]){
					x = a[j];
					a[j]=a[j+1];
					a[j+1]=x;
				}
			}
		}
		System.out.println("The array in ascending order:");
		print(a);
	}
	public void descending(int[] a){
		int i, j, x;
		for(i=0;i<a.length;i++){
			for(j=0;j<(a.length-1);++j){
				if(a[j]<a[j+1]){
					x = a[j];
					a[j]=a[j+1];
					a[j+1]=x;
				}
			}
		}
		System.out.println("The descending order:");
		print(a);
	}
	private void print(int[] a){
		int i;
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}
}
class exp1{
	public static void main(String args[]){
		int[] arr = {23,3,2002,5,32} ;
		Sorting sort = new Sorting();
		sort.ascending(arr);
		sort.descending(arr);
		
	}
}