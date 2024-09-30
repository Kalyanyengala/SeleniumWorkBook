/*1.Arrays Should Not Have Any Duplicates!
2.Arrays Should Not Be In SortedOrder!
3.Arrays Should Be In Range!   */      // ------------> Sum2-Sum1 [Gives Missing Number]

package FreqventlyAsked_Qa_Java;

public class MissingNumberIn_Array {

	public static void main(String[] args) {
		
		/*int a[]= {1,2,3,4,5,6,8};               //--------->> Output 7
		int sum1=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in array:"+ sum1);
		
		int sum2=0;
		
		for(int i=1; i<=8; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of elements in arry:"+ sum2);
		
		System.out.println("Missing element in arry:" +(sum2 -  sum1));
		*/
		
		// Example 2
		
		int array[]= {1,2,3,5,6,7,8,9};
		int Sum1 = 0;
		
		 
		for ( int z = 0; z<array.length ; z++)
		{
			Sum1 = Sum1 + array[z];
		}
		System.out.println("Sum of elements in array:"+ Sum1);
		
		int Sum2 = 0;
		
		for ( int x = 1; x<=9; x++)
		{
			Sum2 = Sum2 +x;
		}
		System.out.println("Sum of range of elements in array:"+ Sum2);
		
		System.out.println("Missing number in array is :"+ (Sum2-Sum1));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
