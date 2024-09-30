package FreqventlyAsked_Qa_Java;

public class EvenAndOddNumbers_Demo2 {

	public static void main(String[] args) {
		
		
		int Array[]= {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
		
		System.out.println("Printing EvenNumbers: ");
		for ( int i = 0; i<= Array.length-1; i++)
		{
			if ( Array[i] % 2 == 0)
			{
				System.out.println("EvenNumber: " + Array[i]);
			}
		}
		
		System.out.println("Printing OddNumbers:");
		for ( int a=0; a<= Array.length-1; a++)
		{
			if (Array[a] % 2 != 0)
			{
				System.out.println("OddNumber: " + Array[a]);
			}
				
		}
		
		// Example 2
		
		int Arr[]= {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
		System.out.println("Printing EvenNumbers: ");
		
		for ( int Ar: Arr)
		{
			if ( Ar %2 == 0)
			{
				System.out.println("EvenNumber : "+ Ar);
			}
		}
		
		System.out.println("Printing EvenNumbers: ");
		for ( int Ar: Arr)
		{
			if ( Ar %2 != 0)
			{
				System.out.println("OddNumber : "+ Ar);
			}
		}
		

	}

}
