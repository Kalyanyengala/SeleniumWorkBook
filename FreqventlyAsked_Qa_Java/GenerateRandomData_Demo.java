package FreqventlyAsked_Qa_Java;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomData_Demo {

	public static void main(String[] args) {
	
		
		// Approach 1 using random class
		
		Random random=new Random();
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(1000));
		System.out.println(random.nextInt(10000));
		System.out.println(random.nextInt(100000));
		random.nextDouble();
		
		// Approach 2
		System.out.println(Math.random());      //  ------------>   Random Double Only
		
		// Approach 3 Using Apache common Lang Generates Both Random String And other Values .
		
	
		String alpha=RandomStringUtils.randomAlphabetic(5);
		String numeric=RandomStringUtils.randomNumeric(5);
		
		String alphanumeric= alpha+"@"+numeric;
		System.out.println(alphanumeric);
		
		System.out.println(RandomStringUtils.randomAlphabetic(5));
		System.out.println(RandomStringUtils.randomNumeric(5));
		System.out.println(RandomStringUtils.randomAlphanumeric(10));
		
		

	}

}
