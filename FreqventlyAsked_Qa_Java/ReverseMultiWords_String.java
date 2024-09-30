package FreqventlyAsked_Qa_Java;

public class ReverseMultiWords_String {

	public static void main(String[] args)
	{
		
		String str= "Welcome To Java";
		String array[]=str.split(" ");
		String ReversString="";
		
		// Approach1
	/*	for(String arr:array)
		{
			String reversword= "";
			
			for(int i=arr.length()-1; i>=0; i--)
			{
				reversword=reversword+arr.charAt(i);
			}
			ReversString=ReversString+reversword+"  ";
		}
		System.out.println("Reversed Words:"+ReversString); */
		
		// Approach2 Builder
		
	/*	for(String ar:array)
		{
		StringBuilder sb=new StringBuilder(ar);
		sb.reverse();
		ReversString=ReversString+sb.toString()+"  ";
		}
		System.out.println(ReversString);   */
		
		//Approach 3 StringBuffer
		
		for (String arr:array)
		{
			StringBuffer sbf=new StringBuffer(arr);
			sbf.reverse();
			ReversString=ReversString+sbf.toString()+"  ";
		}
		System.out.println(ReversString); 
		
		
		
		
		
		
		
		
		
		
		
	}

}
