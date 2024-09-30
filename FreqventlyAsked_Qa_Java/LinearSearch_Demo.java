 //LinearSearch Means it will traverse whole array and find out value is present or not!

package FreqventlyAsked_Qa_Java;

public class LinearSearch_Demo {

	public static void main(String[] args) 
	{ 
		// Example 1
		int a[]= {10,20,30,40,50,40,60,80,90,100};
		
		int searchlinear=100;
		boolean status=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(searchlinear == a[i] )
			{
				System.out.println("Linear Value :"+ i);
				status=true;
				break;
			}
		}
		if (status == false )
		{
			System.out.println("Linear Value is not found");
		}
		
		// Example 2
		
		int arr[]= {10,20,30,40,50,40,60,80,90,100};
		int searchvalue = 50;
		boolean Status = false;
		
	
		for ( int x=0 ; x<arr.length-1; x++)
		{
			if ( searchvalue == arr[x])
			{
				System.out.println("Searchvalue Is Found: " + x);
				Status = true;
				break;
			}
		}
		
		if ( status == false )
		{
		System.out.println("Searchvalue Is Not Found");
		}
		

	}

}
