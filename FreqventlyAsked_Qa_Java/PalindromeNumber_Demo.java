package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class PalindromeNumber_Demo {

	public static void main(String[] args)
	{
		// Logic modulo division[ % " This is Reminder "] it will gives last number and division will gives [ /  ] it will eliminates that number !
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reversed Number:"+rev);
		
		if (org_num==rev)
		{
			System.out.println("Number is Palindrome:"+org_num);
		}
		else
		{
			System.out.println("Number is not a palindrome:"+rev);
		}
	
	}
	
		
		

}