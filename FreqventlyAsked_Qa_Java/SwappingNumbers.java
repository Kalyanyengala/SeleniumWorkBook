package FreqventlyAsked_Qa_Java;

public class SwappingNumbers {

	public static void main(String[] args)
	{
		// Approach1
		
		int a=100, b=200;
		int temp=0;
		System.out.println("Values Of BeforeSwapping:" +a+"  "+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Values Of AfterSwapping:" +a+"  "+b);
		
		//Approach2
		int x=500, y=200;
		System.out.println("Values Of BeforeSwapping:" +x+"  "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Values Of AfterSwapping:"+x+"  "+y);
		
		//Approach3
		
		int c=200, d=400;
		System.out.println("Values Of BeforeSwapping:" +c+"  "+d);
		c=c*d;
		d=c/d;
		c=c/d;
		System.out.println("Values Of BeforeSwapping:" +c+"  "+d);
		
		//Approach 4
		int f=100, g=200;
		System.out.println("Values Of BeforeSwapping:" +f+"  "+g);
		g= f+g -(f=g);
		System.out.println("Values Of AfterSwapping:" +f+"  "+g);
		
		
		
		/*int a=100;
		int b=200;
		
		// Approach1 with help of third variable
		
	   int c=a;
		a=b;
		b=c;
		System.out.println("Sawpping Number A Becomes :"+a);
		System.out.println("Swapping Number B Becomes: "+b);
		
		//Approach 2 without help of third varible.
		
		a=a+b;    //100+200=300
		b=a-b;    // 300-200=100
		a=a-b;    // 300-100=200
		
		System.out.println("Sawpping Number A Becomes :"+a);
		System.out.println("Swapping Number B Becomes: "+b);
		
		//Approach 3 without third varible Here values are not in zero then only this will works.
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("Sawpping Number A Becomes :"+a);
		System.out.println("Swapping Number B Becomes: "+b);
		
		//Approach4 with help of ^.
		
		a=a^b;    // Bitwise Oparetors.
		b= a^b;
		a= a^b;
		System.out.println("Sawpping Number A Becomes :"+a);
		System.out.println("Swapping Number B Becomes: "+b);
		
		// Approach 5 
		
		int x=100;
		int y=200;
		
		y=x+y-(x=y);
		System.out.println("Sawpping Number X Becomes :"+x);
		System.out.println("Swapping Number Y Becomes: "+y); */
		

	}

}
