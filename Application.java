package z.Palindrome;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		String original;
		String reverse = ""; // Objects of String class  
		
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();  
	      
	      
	      Palindrome.palindromeFunction(original);
	}

}
