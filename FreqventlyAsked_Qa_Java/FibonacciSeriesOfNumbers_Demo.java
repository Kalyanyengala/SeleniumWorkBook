package FreqventlyAsked_Qa_Java;

public class FibonacciSeriesOfNumbers_Demo {

	public static void main(String[] args) {
		
		/*
		 * Fibnoci means if [0+1=1,1+1=2,2+3=5,3+5=8,5+8=13] This is Fibnocci Series
		 * is[EachNumber Sum Of Two Preciding Numbers] Logic ------> 1. Take Three
		 * Varibles n1 and n2 and sum 2. And Those assaign data n1 and n2 Then Print .
		 * 3. Start Loop With 2nd of index because alredy we assidned n1 and n2 data 4.
		 * Assign values into sum varible and finaly add n2 value to n1 and sum value to
		 * n2.
		 */

		
		// Example 1
		int  n1=0, n2=1, sum=0;
		
		System.out.print(n1+ "       "+n2 );
		
		for (int i=2; i<10; i++)
		{
			sum=n1+n2;
			System.out.print("  "+sum);
			n1=n2;
			n2=sum;
			
		}
		
		// Example 2
		
		int x1=0 , x2 = 1, Sum = 0;
		
		for( int i=2; i<=10; i++)
		{
			Sum = x1 + x2;
			System.out.println("Sum Of Values :  "+Sum);
			
			x1 =x2;
			x2 =Sum;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
