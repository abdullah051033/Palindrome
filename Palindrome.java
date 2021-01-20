package z.Palindrome;

public class Palindrome {

	private static String reverse;
	
	public static void palindromeFunction(String originalword) {
		 int length = originalword.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + originalword.charAt(i);  
	      if (originalword.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	}
}
