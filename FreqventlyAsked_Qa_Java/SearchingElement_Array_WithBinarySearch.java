/*1.Bineary search it will follow sorting. element must be in sorting manaer!
2.Apply formula to findout middle value in the array (firstnumber+lastnumber%2=middlenumber)!
3.Searchable value three conditions one key value equals to midvalue and secpnd  is greaterthen middlenumber then go right side if it is lessthen middle then go leftside!
4. and second one is keyvalue!  */

package FreqventlyAsked_Qa_Java;

import java.util.Arrays;

public class SearchingElement_Array_WithBinarySearch {

	public static void main(String[] args) {
		
		
		/*
		        Approach1
		 
		  int a[]= {10,20,30,40,50,60,70 ,80};
		 
		int keyvalue=100;
		int lower=0;
		int higher=a.length-1;
		boolean  status=false;
		
		while(lower<=higher)
		{
			int middlevalue=(lower+higher)/2;
			
			if(a[middlevalue] == keyvalue)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
			if(a[middlevalue]<keyvalue)
			{
				lower=middlevalue+1;
			}
			if(a[middlevalue]>keyvalue)
			{
				higher=middlevalue-1;
			}
		}
		
		if(status == false)
		{
			System.out.println("Element not found");
		}*/
		
		// Approach2 [Arrays Has Built In Methods By Using That Method Also FindOut BinarySearch]
		
		  int a[]= {10,20,30,40,50,60,70 ,80};
		  
		  int index=Arrays.binarySearch(a, 80);
		  System.out.print(index);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
