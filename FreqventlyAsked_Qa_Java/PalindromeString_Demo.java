package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class PalindromeString_Demo {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		String value=sc.next();
		String org_value=value;
		String rev="";
		int length= value.length();
		
		for(int i=length-1; i>=0; i--)
		{
			rev=rev+value.charAt(i);
		}
		
		if(org_value.equals(rev))
		{
			System.out.println("This is Palindrome String"+rev);
		}
		else
		{
			System.out.println("This is not palindrome string:"+rev);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
