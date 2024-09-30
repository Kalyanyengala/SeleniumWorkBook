package FreqventlyAsked_Qa_Java;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsByBubble_Sort_Demo2 {

	public static void main(String[] args) {
		
		int Array[] = {10, 30, 40, 60, 70, 50, 80,1, 2, 100};
		System.out.println("Before Sorting Of Array : "+ Arrays.toString(Array));
		
		for ( int i=0; i<Array.length-1 ; i++)
		{
			for (int j=0; j<Array.length-1; j++)
			{
				if (Array[j] > Array[j+1])
				{
					int temp = Array[j];
					Array[j] = Array[j+1];
					Array[j+1] = temp;
				}
			}
		}
		
		System.out.println("AfterSorting Of Array : "+ Arrays.toString(Array));
		
		// Approach 2
		
		int array[] = {10, 30, 40, 60, 70, 50, 80,1, 2, 100};
		System.out.println("Before Sorting Of Array : "+ Arrays.toString(array));
		Arrays.parallelSort(array);
		System.out.println("After Sorting Of Array : "+ Arrays.toString(array));
		
		// Approach 3
		

		int arr[] = {10, 30, 40, 60, 70, 50, 80,1, 2, 100};
		System.out.println("Before Sorting Of Array : "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting Of Array : "+ Arrays.toString(arr));
		
		// Approach 4 Accending to Decending Order !
		
		Integer a[] = {10, 30, 40, 60, 70, 50, 80,1, 2, 100};
		System.out.println("Before Sorting Of Array : "+ Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After Sorting Of Array : "+ Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
