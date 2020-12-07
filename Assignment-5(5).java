/*Write a java program to read a file line by line and store it into a variable.*/
import java.io.*;
class Exp5{
	public static void main(String args[]) throws Exception{
		File file = new File("Test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		String line = reader.readLine();
		StringBuffer sb = new StringBuffer();
		while(line != null){
			sb.append(line +"\n");
			line = reader.readLine();
		}
		fr.close();
		System.out.println("Contents of the file are:\n" + sb);
	}
}