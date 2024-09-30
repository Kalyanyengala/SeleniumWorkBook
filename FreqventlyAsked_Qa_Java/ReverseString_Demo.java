package FreqventlyAsked_Qa_Java;

public class ReverseString_Demo {

	public static void main(String[] args) 
	{  
		//Approach 1
		
	
		
		String value="welcome";
		String revers="";
		int length=value.length();
		
		for(int i=length-1; i>=0; i--)
		{
			revers=revers+value.charAt(i);
		}
		System.out.println("Reversed String is:"+revers);
		
		
		String str="Hello";
		String rev="";
		int len=str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String:"+rev);
		
		//Approach 2
		String strs="World";
		String revs="";
		char a[]=strs.toCharArray();
		int lens=a.length;
		
		for (int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reversed String:"+rev);
		
		//Approach 3
		String strng="Welcome to Banglore";
		StringBuffer sbf=new StringBuffer(strng);
		System.out.println(sbf.reverse());
		
		//Approach 4
		String st="Hello Everyone";
		StringBuilder stb=new StringBuilder(st);
		System.out.println(stb.reverse());
		
		
		

		
		
		
		
		
		
		
		

	}
}
