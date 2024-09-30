package FreqventlyAsked_Qa_Java;

public class Count_Even_Odd_Numbers {

	public static void main(String[] args) {
	//  Logic modulo division[ % " This is Reminder "] it will gives last number and division will gives [ /  ] it will eliminates that number !
		
		int number=12345678;        // OutPut: 4,4.
		
		int even_number=0;
		int odd_number=0;
		
		while(number>0)
		{
		     int reminder=number%10;
		     
		     if(reminder%2==0)
		     {
		    	 even_number++;
		     }
		     else 
		     {
		    	 odd_number++;
		     }
		     number=number/10;
		}
		System.out.println("Even numbers:"+even_number);
		System.out.println("Odd numbeers:"+odd_number);

		// Example 2
		int Number=12345678;
		int even=0;
		int odd=0;
		
		while(Number>0)
		{
			int reminder=Number%10;
			
			if (reminder%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			Number=Number/10;
		}
		
		System.out.println("Even numbers:"+even);
		System.out.println("Odd numbeers:"+odd);
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
