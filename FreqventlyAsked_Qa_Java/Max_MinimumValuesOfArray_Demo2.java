package FreqventlyAsked_Qa_Java;

public class Max_MinimumValuesOfArray_Demo2 {

	public static void main(String[] args) {
		
		int array[]= { 1,10, 20, 30, 40, 50, 60};
		int max_value= array[0];
		int min_value= array[0];
		
		for ( int i = 1; i<array.length; i++)
		{
			if ( array[i] > max_value )
			{
				max_value = array[i];
			}			
		}
		
		System.out.println("MaximumValue Of Array: "+ max_value);
		
		
		
		for ( int x= 1; x<array.length; x++)
		{
			if (array[x]<min_value  )
			{
				min_value = array[x];
			}
		}
		
		System.out.println("ManimumValue Of Array: "+ min_value);
		
		
		
		
		
		
		
		
		
	}

}
