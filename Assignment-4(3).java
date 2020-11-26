/*Write a Java Program to find the longest repeating sequence in a string.*/
import java.util.Scanner;
class exp3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String value = input.nextLine();
		String longest = "";
		int n = value.length();  
        for(int i = 0; i < n; i++){  
            for(int j = i+1; j < n; j++){  
                String x = longestRepeating(value.substring(i,n),value.substring(j,n)); 
                if(x.length() > longest.length()) longest=x;  
            }  
        }  
        System.out.println("Longest repeating sequence: "+longest); 
	}
	public static String longestRepeating(String s, String t){  
        int n = Math.min(s.length(),t.length());  
        for(int i = 0; i < n; i++){  
            if(s.charAt(i) != t.charAt(i)){  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  
    }  
}