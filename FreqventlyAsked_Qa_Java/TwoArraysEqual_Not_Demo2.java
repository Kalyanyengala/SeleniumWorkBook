package FreqventlyAsked_Qa_Java;

import java.util.Arrays;

public class TwoArraysEqual_Not_Demo2 {

	public static void main(String[] args) {
		
		// Approach1
		/*int arry[]= {10, 20, 30 ,40, 50};
		int arry2[] = {10, 20, 30, 40, 50};
			
		boolean status =Arrays.equals(arry, arry2);
		if ( status == true)
		System.out.println("Arrays are Equals ");
		else
			System.out.println("Arrays are NotEquals ");
			
		
		// Approach2
		
		int Arry[]= {10, 20, 30 ,40, 90};
		int Arry2[] = {10, 20, 30, 40, 50};
		boolean Status = true;
		
		if ( Arry.length == Arry2.length)
		{
			for ( int a=0; a<Arry.length; a++ )
			{
				if ( Arry[a] != Arry2[a])
				{
					Status=false;
				}
			}
		}
		else
		{
			Status=false;
		}
		if ( Status == true)
		{
			System.out.println("Arrays are equals");
		}
		else 
		{
			System.out.println("Arrays are Not equals");
		}*/
		
		
		// Approach 1
		int Arry[]= {10, 20, 30 ,40, 90};
		int Arry2[] = {10, 20, 30, 40, 50};
		boolean status= Arrays.equals(Arry, Arry2);
		
		if ( status == true)
		{
			System.out.println("Arrays Should Be Equals");
		}
		else 
		{
			System.out.println("Arrays Are Not Equals");
		}
		
		
		// Approach 2
		
		int Ar[]= {10, 20, 30 ,40, 90};
		int Arr2[] = {10, 20, 30, 40, 50};
		boolean Status = true;
		
		if ( Ar.length == Arr2.length)
		{
			for ( int i = 0; i<=Ar.length; i++)
			{
				if ( Ar[i] != Arr2[i])
				{
					Status = false;
				}
			}
		}
		else 
		{
			Status = false;
		}
		if ( Status == true)
		{
			System.out.println("Arrays Should Be Equals");
		}
		else 
		{
			System.out.println("Arrays Are Not Equals");
		}
		
		
		
		
		
	}

}
