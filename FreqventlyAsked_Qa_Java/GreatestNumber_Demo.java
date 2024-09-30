package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class GreatestNumber_Demo {

	public static void main(String[] args) {
	/*	Logic :
		 if a>b and a>c --->  A is Largest number
		 if b>a and b>c ----> B is Largest Number
		 if c>a and c>b ------> C is LargestNumber*/
		
		
		// Approach 1 Using  AND Oparetor.
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter First Number:");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter Second Number:");
		 int b=sc.nextInt();
		 
		 System.out.println("Enter Third Number:");
		 int c=sc.nextInt();
	
		if(a>b && a>c)
		{
			System.out.println("A is largest number:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("B is largest number:"+b);
		}
		else
		{
			System.out.println("C is largest number:"+c);
		}
		
		// Approach 2 Using TernaryOparetor.
		int x=100;
		int y=200;
		int z=300;
		
		int largest1=x>y?x:y;
		int largest2=z>largest1?z:largest1;
		
		System.out.println("Largest is:"+largest2);
		
		
		
		
		
		
		
		
		
		
	}

}
