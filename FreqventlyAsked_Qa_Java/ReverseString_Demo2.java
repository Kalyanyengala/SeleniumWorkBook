package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class ReverseString_Demo2 {

	public static void main(String[] args) {
		
		// Approach1
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value:");
		String value= sc.next();
		int length= value.length();
		String rev="";
		
		for( int i=length-1; i>=0; i--)
		{
			rev=rev+ value.charAt(i);
		}
		System.out.println("ReversedString Value is:"+ rev);
		
		//Approach2
		
		StringBuffer buffer = new StringBuffer(value);
		System.out.println("ReversedString Using StringBuffer:" +buffer.reverse());
		
		//Approach3
		
		StringBuilder builder= new StringBuilder(value);
		System.out.println("ReversedString Using StringBuilder:" +builder.reverse());
		
		// Approach4
		
		String str= " Kalyan ";
		String reverse=" ";
	    char array[]= str.toCharArray();
	    int len=array.length;
	    
	    for (int x=len-1 ; x>=0; x--)
	    {
	    	reverse=reverse+array[x];
	    }
	    System.out.println("ReversedString :" + reverse);
		
		
		
		
		
		

	}

}
