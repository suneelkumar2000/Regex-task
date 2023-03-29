package special_character_vowel;

import java.util.Scanner;

public class Vowel {
	public static void main(String args[])
	{
	    String input;
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the word:");
	    input=sc.nextLine();
	    
		System.out.println("Resullt :"+validate(input) );
	    
	}
	public static String validate(String text) {
		   return text.replaceAll("([AEIOUaeiou])","-$1-");
	   }
}
