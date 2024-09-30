package FreqventlyAsked_Qa_Selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int brokenlinks=0;
		
		for( int i=0; i<links.size(); i++)
		{
			String url=links.get(i).getAttribute("href");
			
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is Empty:");
				continue;
			}
			
			try {
				
				URL link=new URL(url);
				HttpURLConnection openconnect=(HttpURLConnection) link.openConnection();
				openconnect.connect();
				
				if(openconnect.getResponseCode()>=400)
				{
					System.out.println("This Links Are BrokenLinks:" +(openconnect.getResponseCode())+url);
					brokenlinks++;
				}
				else 
				{
					System.out.println("This Links Are ValidLinks:" +(openconnect.getResponseCode())+url);
				}
				
			} catch (Exception e)
			{
			}
		}
		System.out.println("Brokenlinks:"+brokenlinks);
		driver.quit();
			
			
			

	}

}
