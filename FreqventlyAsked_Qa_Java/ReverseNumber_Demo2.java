package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class ReverseNumber_Demo2 {

	public static void main(String[] args) {
		
		//Approach1
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value:");
		int number=sc.nextInt();
		int revers=0;
		
		while(number!=0)
		{
			revers=revers*10 + number%10;
			number= number/10;
		}
		System.out.println("Reversed Number Is :" +revers);
		
		//Approach2
		Scanner str=new Scanner(System.in);
		System.out.println("Enter a Value:");
		int reversNum= str.nextInt();
		StringBuffer strb=new StringBuffer(reversNum);
		System.out.println("ReversedNumber Using StringBuffer:" + strb.reverse());
		
		// Approach3
		
		Scanner scbuilder= new Scanner(System.in);
		System.out.println("Enter Value:");
		int strvalue= scbuilder.nextInt();
		StringBuilder stbuilder= new StringBuilder(strvalue);
		System.out.println("ReversedNumber Using StringBuilder:"+ stbuilder.reverse());
		
		
		
		
	}

}
