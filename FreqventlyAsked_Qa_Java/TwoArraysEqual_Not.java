/*Approach 2 Logic :
	
	First Checking The Both Length Of Arrays ! Then Not Equal Condition Fail!
	If Both Length Becomes True Then Wright Loop! 
	Inside Loop Condition Is If A1 Not Equals To A2 Then Status Should Be False!
	Then Final Condition Status True Then Print Equal OtherWise Print False!     */

package FreqventlyAsked_Qa_Java;

import java.util.Arrays;

public class TwoArraysEqual_Not {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,};
		int b[]= {10,20,30,40};
		
		
		//Approach1
		
		
	/*	boolean status= Arrays.equals(a,b);
		if(status==true)
		{
			System.out.println("Arrays are equals");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}*/
		
		//Approach2 
		
		boolean status=true;
		
		if(a.length== b.length)
		{
			for (int i=0; i<a.length; i++)
			{
				if(a[i]  != b[i])
				{
					status=false;
				}
			}
		}
		else
		{
			status=false;
		}
		if(status == true)
		{
			System.out.println("Arrays are equals");
		}
		else
		{
			System.out.println("Arrays are not equals");
		}
		
		
		
		
		
		
		
		
	}

}
