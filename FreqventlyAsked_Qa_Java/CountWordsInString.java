package FreqventlyAsked_Qa_Java;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {

		System.out.println("Enter String Vlaue:");
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		int count=0;
		
		for(int i=0; i<value.length()-1; i++)
		{
			if((value.charAt(i)== ' ') &&( value.charAt(i+1)!=' ' ))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
