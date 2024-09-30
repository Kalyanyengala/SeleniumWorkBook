package FreqventlyAsked_Qa_Java;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		// Approach1
		
		int array[]= {20,83,72,9383,28,10,1,82,}; 
		System.out.println("Before Sorting:"+ (Arrays.toString(array)));
		Arrays.parallelSort(array);
		System.out.println("After Sorting:"+ (Arrays.toString(array)));
		
		// Approach2
		
		int arry[]= {20,83,72,9383,28,10,1,82,}; 
		System.out.println("Before Sorting:"+ (Arrays.toString(array)));
		Arrays.sort(arry);
		System.out.println("After Sorting:"+ (Arrays.toString(array)));
		
		// Approach3 ---------> Decending Order
		
		Integer Arry[]= {20,83,72,9383,28,10,1,82,}; 
		System.out.println("Before Sorting:"+ (Arrays.toString(Arry)));
		Arrays.sort(Arry, Collections.reverseOrder());
		System.out.println("After Sorting:"+ (Arrays.toString(Arry)));
		
		
		
		
		
		
	}

}
