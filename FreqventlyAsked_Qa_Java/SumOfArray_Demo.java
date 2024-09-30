package FreqventlyAsked_Qa_Java;

public class SumOfArray_Demo {

	public static void main(String[] args) {
	
		//Example 1
		/*int a[]= {10,20,30,40,50};
		int sum=0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum Of Value Is: "+sum);
		
		
		//Example 2
		int A[]= {10,20,30,40,50,60};
		int summ=0;
	
		for(int value:A)
		{
			summ=summ+value;
		}
		System.out.println("Sum Of Value Is: "+summ);
		*/
		
		//Example 3
		
		int Array[]= {100 , 200 , 300 , 400, 500};
		int ArrayAdd = 0;
		
		for ( int B = 0; B<=Array.length-1 ; B++)
		{
			ArrayAdd = ArrayAdd + Array[B];
		}
		System.out.println("Sum Of Value Is: "+ArrayAdd);
		
		for (int  Arr:Array)
		{
			ArrayAdd = ArrayAdd+Arr;
		}
		System.out.println("Sum Of Value Is: "+ArrayAdd);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
