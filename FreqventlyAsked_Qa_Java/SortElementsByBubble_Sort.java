package FreqventlyAsked_Qa_Java;

import java.util.Arrays;

public class SortElementsByBubble_Sort {

	public static void main(String[] args) {
		
		
		int array[]= {20,10,4,3,1,90,60,59,64,83,0};
		System.out.println("Before Sorting: "+ Arrays.toString(array));
		
		for(int i=0; i<=array.length-1; i++)
		{
			for( int x=0; x<array.length-1 ; x++)
			{
				if (array[x]>array[x+1])
				{
					int temp=array[x];
					array[x]=array[x+1];
					array[x+1]=temp;					
				}
			}
		}
		System.out.println("After Sorting :"+( Arrays.toString(array)));

	}

}
