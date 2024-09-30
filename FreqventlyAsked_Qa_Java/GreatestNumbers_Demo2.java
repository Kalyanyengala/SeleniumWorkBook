package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class GreatestNumbers_Demo2 {

	public static void main(String[] args) {

 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter First Number:");
		 int number1=sc.nextInt();
		 
		 System.out.println("Enter Second Number:");
		 int number2=sc.nextInt();
		 
		 System.out.println("Enter Third Number:");
		 int number3=sc.nextInt();		
		
		if ( number1 > number2 && number1 > number3)
		{
			System.out.println("Number1 Is LargestNumber :" + number1);
		}
		else if ( number2 > number1  && number2 > number3)
		{
			System.out.println("Number2 Is LargestNumber :" + number2);
		}
		else 
		{
			System.out.println("Number3 Is LargestNumber :" + number3);
		}

		// Example 2

		int numb1 = 100;
		int numb2 = 200;
		int numb3 = 300;
		
		int numb = numb1 > numb2 ? numb1 : numb2 ;
		int finalnumb = numb3 > numb ? numb3 : numb ;
		
		System.out.println("Largest Number Is :" + finalnumb);
	}

}
