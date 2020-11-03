/*
7. Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new matrix object. The Matrix class has the following information: 1 - number of rows of matrix 2 - number of columns of matrix 3 - elements of matrix in the form of 2D array The matrix class has the methods for each of the following: 1 - get the number of rows 2 – get the number of columns 3 – set the elements of the matrix at given position(i, j) 4 – adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed. 5 – multiplying the two matrice
*/
import java.util.Scanner;
class Matrix{
	private int mRows, mColumns;
	private int[][] arr = new int[10][10];
	
	public Matrix(int rows, int columns){
		mRows = rows;
		mColumns = columns;
	}
	
	public int getRows(){
		return mRows;
	}
	
	public int getColumns(){
		return mColumns;
	}
	
	public void setElements(int i, int j, int element){
		arr[i][j] = element;
	}
	
	public void add(Matrix m1){
		if(this.mRows != m1.mRows && this.mColumns != m1.mColumns){
			System.out.println("Matrices cannot be added");
			return;
		}
		Matrix m2 = new Matrix(this.mRows,this.mColumns);
		for(int i = 0; i<this.mRows;i++){
			for(int j = 0; j< this.mColumns;j++){
				m2.arr[i][j] = this.arr[i][j] + m1.arr[i][j];
			}
		}
		System.out.println("The added matrix results in: ");
		m2.display();
	}
	
	public void multiply(Matrix m1){
		if(this.mColumns != m1.mRows){
			System.out.println("Matrices cannot be multiplied");
			return;
		}
		Matrix m2 = new Matrix(this.mRows,this.mColumns);
		for(int i = 0; i<this.mRows;i++){
			for(int j = 0; j< this.mColumns;j++){
				for(int k = 0; k<this.mColumns;k++){
					m2.arr[i][j]+= this.arr[i][k] + m1.arr[k][j];
				}
			}
		}
		
		System.out.println("The multiplied matrix results in: ");
		m2.display();
	}
	
	public void display(){
		for(int i = 0; i < mRows; i++){
			for(int j = 0; j< mColumns; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dimensions of matrix: ");
		int row = input.nextInt();
		int col = input.nextInt();
		
		Matrix matrix1 = new Matrix(row,col);
		System.out.println("Enter the elements of matrix: ");
		for(int i = 0; i<row;i++){
			for(int j = 0; j < col; j++){
				int element = input.nextInt();
				matrix1.setElements(i,j,element);
			}
		}
		System.out.println("");
		
		System.out.println("The number of rows is:  " + matrix1.getRows());
		System.out.println("The number of columns is: " + matrix1.getColumns());
		System.out.println("");
		
		matrix1.add(matrix1);
		System.out.println("");
		
		matrix1.multiply(matrix1);
		System.out.println("");
		
	}
}