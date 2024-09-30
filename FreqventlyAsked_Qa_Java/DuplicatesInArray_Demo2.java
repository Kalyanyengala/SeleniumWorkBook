package FreqventlyAsked_Qa_Java;

import java.util.HashSet;

public class DuplicatesInArray_Demo2 {

	public static void main(String[] args) {
		
		String arr[] = {"Java" , "Python" ,"Python" , "Groovy" , "c" , "C++" , "Java"};
		boolean status = false;
		
		for ( int i = 0; i<arr.length ; i++)
		{
			for ( int j=i+1; j<arr.length; j++)
			{
				if ( arr[i] == arr[j])
				{
					System.out.println("Duplicate Values Founded: " + arr[i]);
					status = true;
					
				}
			}
		}
		
		if ( status == false)
		{
			System.out.println("Duplicates are not found !");
		}
		
		// Approach 2
		
		HashSet hset = new HashSet ();
		
		boolean Status = false;
		
		for (String  values :arr)
		{
			if ( hset.add(values) == false)
			{
				System.out.println("Duplicate values are found : " + values);
				status = true;
			}
		}
		
		if ( status == false )
		{
			System.out.println("Duplicates are not found" );
		}
		
		

	}

}
