package FreqventlyAsked_Qa_Java;

public class CountEvenOddNumbers_Demo2 {

	public static void main(String[] args) {
		
		int value = 123456789;
		int evenNumber = 0;
		int oddNumber = 0;
		
		while ( value > 0)
		{
			int reminder= value % 10;
			
			if ( reminder%2 == 0)
			{
				evenNumber++;
			}
			else
			{
				oddNumber++;
			}
			
			value = value/10;
		}
		
		System.out.println("EvenNumber is: " + evenNumber);
		System.out.println("OddNumber is: " + oddNumber);

		// Example 2

		int number = 108283930;
		int even = 0;
		int odd = 0;
		
		while ( number > 0)
		{
			int reminder = number % 10;
			
			if ( reminder % 2 == 0)
			{
				even++;
			}
			else 
			{
				odd++;
			}
			
			number = number / 10 ;	
			
		}
		System.out.println("EvenNumber is: " + even);
		System.out.println("OddNumber is: " + odd);
	
		
	}

}
