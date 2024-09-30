package FreqventlyAsked_Qa_Java;

import java.util.Arrays;

public class BinarySearch_Demo {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		int searchElement = 5;
		int highvalue = a.length-1;
		int lowvalue = 0;
		boolean status = false;
		
		while ( lowvalue <= highvalue)
		{
			int middlevalue = (lowvalue+highvalue)/2;
			
			if (a[middlevalue] == searchElement)
			{
				System.out.println("SearchElement Found: " + middlevalue);
				status = true;
				break;
			}
			if ( a[middlevalue]< searchElement)
			{
				lowvalue =middlevalue + 1;
			}
			
			if ( a[middlevalue] > searchElement)
			{
				highvalue = middlevalue -1;
			}
		}
		
		if ( status == false)
		{
			System.out.println("SearcheElement Not Found");
		}
		
		// Approach 2
		
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.binarySearch(arr, 6));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
