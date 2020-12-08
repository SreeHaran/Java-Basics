/*Write a Java program to read first 3 lines from a file and write into another file.*/
import java.io.*;
class Exp6{
	public static void main(String args[]) throws Exception{
		File file = new File("Test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		String line = reader.readLine();
		StringBuffer sb = new StringBuffer();
		int n = 3;
		while(line != null && n>0){
			sb.append(line +"\n");
			line = reader.readLine();
			n--;
		}
		fr.close();
		System.out.println("First three lines of the file are:\n" + sb);
	}
}