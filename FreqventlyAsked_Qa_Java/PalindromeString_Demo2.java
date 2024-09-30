package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class PalindromeString_Demo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Value:");
		String value= sc.next();
		String org_value = value;
		int length = value.length();
		String rev= "";
				
		
		for ( int i=length-1; i>=0; i--)
		{
			rev= rev+value.charAt(i);
		}
		if ( org_value.equals(rev))
		{
			System.out.println("Palindrome Value: " + org_value);
		}
		else
		{
			System.out.println("Not Palindrome Value: " + rev);
		}
		
		 sc.close(); 

	}

}
