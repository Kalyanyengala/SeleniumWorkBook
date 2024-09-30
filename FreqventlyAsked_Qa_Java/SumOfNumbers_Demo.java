package FreqventlyAsked_Qa_Java;

public class SumOfNumbers_Demo {

	public static void main(String[] args) {
		// Logic modulo division[ % " This is Reminder "] it will gives last number and add that number to sum varible and  division  [ /  ] it will eliminates that number !

		
		int number=12345;        //Output : 15
		int sum=0;
		
		while(number>0)
		{
			sum=sum+number%10;
			number=number/10;
		}
		
		System.out.println("Sum of numbers is:"+sum);
	}

}
