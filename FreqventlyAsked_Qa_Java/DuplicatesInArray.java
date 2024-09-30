package FreqventlyAsked_Qa_Java;

import java.util.HashSet;

public class DuplicatesInArray {

	public static void main(String[] args) {
	
		
		String arr[]= {"Java", " Python", "C", "C++", "Java"};
	
		// Approach 1
		
		/*boolean status=false;
		
		for (int i=0; i<arr.length; i++)
		{
			for(int x= i+1 ; x<arr.length; x++)
			{
				if (arr[i] == arr[x])
				{
					System.out.println("Duplicate values found:"+ arr[i]);
					status=true;
				}
			}
		}
		if(status ==false)
		{
			System.out.println("Duplicate values not found");
		} */
		
		boolean status=false;
		
		HashSet <String> set=new HashSet();
		
		for (String value:arr)
		{
			if (set.add(value) == false)
			{
				System.out.println("Duplicate values found: "+ value);
				status=true;
			}
		}
		if(status == false)
		{
			System.out.println("Duplicate values are not found");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
