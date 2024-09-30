package FreqventlyAsked_Qa_Java;

public class CountTotalNumbers_Demo {

	public static void main(String[] args) {
	  
		
		// Logic is value divided by 10 and it will eliminates last number  and increment on the same time .
		
		int number=1256;
		int count=0;
		
		while(number>0)
		{
			number=number/10;
			count++;
		}
		
		System.out.println("The number count is :"+count);
	}

}
