package FreqventlyAsked_Qa_Java;

public class Max_Minimum_ValuesOfArray {

	public static void main(String[] args) {
		
		
		int a[]=  {1,10,20,30,40,50,60,100};
		int maximum= a[0];
		int minimum= a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>maximum)
			{
				maximum=a[i];
			}
		}
		System.out.println("Maximum value of array: "+ maximum);
		
		for(int x=1; x<a.length; x++)
		{
			if( a[x]<minimum)
			{
				minimum=a[x];
			}
			
		}
		System.out.println("Minimum value of array is:"+ minimum);
		

	}

}
