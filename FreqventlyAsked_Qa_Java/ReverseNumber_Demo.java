package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class ReverseNumber_Demo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a value: ");
		int number=sc.nextInt();
		int revers=0;
		
		while(number!=0)
		{
			revers= revers*10 + number%10;     // Modulo Division will gives last digit of every iteration and assign to reverse
			number= number/10;		                    // This Division will eliminates last digit and rest of numbers return iteration goes when this becomes zero! 
		}
		System.out.println("Reverse Number is :"+revers);
		
	
	//Approach 2 Using String Buffer And Builder Class.
	
	int value=125;
	StringBuffer sb=new StringBuffer(String.valueOf(value));
	StringBuffer rev=sb.reverse();
	
	System.out.println("Reverse Number Is:"+rev);
	
	//Approach3 
	
	StringBuilder sbf=new StringBuilder(String.valueOf(value));
	StringBuilder Rev=sbf.reverse();
	System.out.println("Reverse Number Using StringBuilder Class: "+Rev);
	
	//Example 2
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value:");
		int number=sc.nextInt();
		int revers=0;
		
		while(number!=0)
		{
			revers=revers*10+ number%10;
			number=number/10;
			
		}
		System.out.println("Reversed Number :"+revers);
	
	*/
	
	

	



}}
