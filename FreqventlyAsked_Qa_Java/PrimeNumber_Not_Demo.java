/*For This Mainly Considered Two Conditions 
1. If The Number Is GreaterThan 1 Then Number Is Eligible For Second Condition
2. If The Number Is  GreaterThen 1 And That Number Divided By With One Number And Itself Number  That Numbers Call iT As PrimeNumber.
Example:
	1 and 5 -----> Divides 1 And 5 ---------> PrimeNumber
	10 ---------> Divides With Multiple Numbers ------> Not PrimeNumber    */

package FreqventlyAsked_Qa_Java;

public class PrimeNumber_Not_Demo {

	public static void main(String[] args)
	{
		
		/*int number=10;
		int count=0;
		
		if(number>1)
		{
			for(int i=1; i<=number;i++)
			{
				if(number%i ==0)
				count++;				
			}
			
			if(count==2)
			{
				System.out.println("This is PrimeNumber" +count);
			}
			else
			{
				System.out.println("This Is Not PrimeNumber"+count);
			}
			
		}
		else
		{
			System.out.println("This Is Not PrimeNumber");
		}*/
		
		
		// Example 2
		
		int num=5;
		int count=0;
		
		if(num>1) 
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
					count++;			
			}
		
		
		if(count==2)
		{
			System.out.println("Primenumber:"+count);
		}
		else
		{
			System.out.println("Not a primenumber:"+count);
		}
	          }
			
		else
		{
			System.out.println("Not a primenumber");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
