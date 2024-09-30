package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class PalindromeNumber_Demo2 {

	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value:");
		int number = sc.nextInt();
		int original_Num = number;
		int revers = 0;
		
		while (number != 0)
		{
			revers=revers*10 + number%10; 
			number= number/10;
		}
		if ( original_Num == revers)
		{
			System.out.println("PalindromeNumber:" + original_Num);
		}
		else
		{
			System.out.println("Not A PalindromeNumber:"  + revers);
		}
		
		// Example 2
		
		Scanner  Sc= new Scanner(System.in);
		System.out.println("Enter Number:");
		int Number = Sc.nextInt();
		int org_num=number;
		int Revers = 0;
		
		while (number != 0)
		{
			Revers= Revers*10 + Number%10;
			Number = Number/10;
		}
		
		if ( org_num == revers)
		{
			System.out.println("Number is palindrome:" + org_num);
		}
		else 
		{
			System.out.println("Number Not Palindrome: " + Revers);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
