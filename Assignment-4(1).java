/*Write a Java Program to count the total number of vowels and consonants in a string.*/
import java.util.Scanner;
class Exp1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String value = input.nextLine().toLowerCase();
		int vowel =0 , consonants = 0;
		for(int i = 0; i < value.length(); i++){
			char c = value.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				++vowel;
			}else if(c>='a'&&c<='z'){
				++consonants;
			}
		}
		System.out.println("Number of vowels in the input String: "+vowel);
		System.out.println("Number of consonants in the input String: "+consonants);
	}
}