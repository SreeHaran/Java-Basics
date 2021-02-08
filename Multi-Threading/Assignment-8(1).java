/*Write a Java program to create three threads. The first thread should print the values from 1 to 10. The second thread should print values 11 to 20 and the third thread should print values from 21 to 30.*/
class PrintingThread implements Runnable{
	int mStart, mEnd;
	public PrintingThread(int start, int end){
		mStart = start;
		mEnd = end;
	}
	public void run(){
		for(int i = mStart; i <= mEnd; i++){
			System.out.print(i+" ");
		}
	}
}
class Exp1{
	public static void main(String args[]){
		Thread one = new Thread(new PrintingThread(1, 10));
		Thread two = new Thread(new PrintingThread(11, 20));
		Thread three = new Thread(new PrintingThread(21, 30));
		one.start();
		two.start();
		three.start();
	}
}