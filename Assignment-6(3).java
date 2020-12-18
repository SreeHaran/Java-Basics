/* Create a java program to read data from a file with exception handling routines*/
import java.io.*;
class Exp3{
	public static void main(String args[]) throws Exception{
		try{
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
		System.out.println("Content of the file are:\n" + sb);
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}