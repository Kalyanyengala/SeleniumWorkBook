package FreqventlyAsked_Qa_Java;

public class SumOfNumbers_Demo2 {

	public static void main(String[] args) {
	
		
		int number = 18393920;
		int sum = 0;
		
		while ( number > 0)
		{
			sum = sum + number % 10 ;
			number = number / 10;
		}
		
		System.out.println("Sum Of Values Is : "+ sum);
	}

}
