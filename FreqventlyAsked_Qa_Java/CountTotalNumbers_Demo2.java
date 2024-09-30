package FreqventlyAsked_Qa_Java;

public class CountTotalNumbers_Demo2 {

	public static void main(String[] args) {
	
		
		int number = 123456786;
		int count = 0;
		
		while( number > 0)
		{
			number = number/10;
			count ++;
		}
		System.out.println("Count Of Number: " + count);
	}

}
