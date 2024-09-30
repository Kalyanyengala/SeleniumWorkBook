package FreqventlyAsked_Qa_Java;

public class PrimeNumbers_Demo2 {

	public static void main(String[] args) {
	
		// Example 1
		/*int number =5;
		int count = 0;
		
		if ( number > 1)
		{
			for ( int i=1; i<=number; i++)
			{
				if ( number%i == 0)
				{
					count++;
				}
			
			}
			if ( count == 2)
			{
				System.out.println("Number is PrimeNumber: "+ count);
			}
			else
			{
				System.out.println("Number is Not PrimeNumber: "+ count);
			}
		}
		else 
		{
			System.out.println("Not PrimeNumber " );
		}*/
		
		// Example 2
		
		int value = 5;
		int valcount= 0;
		
		if ( value > 1)
		{
			for ( int i=1; i<=value ; i++)
			{
				if ( value %i == 0)
				{
					valcount++;
				}
							
			}
			if ( valcount == 2)
			{
				System.out.println("Number Is PrimeNumber: " + valcount);
			}
			else
			{
				System.out.println("Number Is Not PrimeNumber :" + valcount);
			}
		}
		else
		{
			System.out.println("Not a primenumber");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
