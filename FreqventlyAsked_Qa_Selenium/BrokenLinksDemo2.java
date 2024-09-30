package FreqventlyAsked_Qa_Selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo2 {

	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));              //-----> First Capture Links
		int BrokenLinks=0;                                                                                                        //------> MultipleLinks Available So Take Varible 
		for (WebElement link: links)                                                                                      //------> Writing Loop To Read Each And EveryLinks
		{
			String url=link.getAttribute("href");
			
			if( url == null || url.isEmpty())                                             //------> First Check Url is Empty or not .if url is empty or null it is emptyurl
			{
				System.out.println("This Links Are EmptyLinks");
			}
			 try {
			URL urllinks=new URL(url);                                                  //--------> Convert url in string to urlformate
			HttpURLConnection openconnection=(HttpURLConnection) urllinks.openConnection(); //-----> OpenConnection to hit url to servers
			openconnection.connect();
			
			if (openconnection.getResponseCode()>=400)                  //---------> Responscoe is > =400  then this links are brokenlinks 
			{
				System.out.println("This Links Are BrokenLinks:"+(openconnection.getResponseCode()+url));
				BrokenLinks++;
			}
			else
			{
				System.out.println("This Links Are ValidLinks:"+(openconnection.getResponseCode()+url));
			}
			 }
			 catch(Exception e) {}
			
		}
		
		System.out.println("This Links Are BrokenLinks:"+BrokenLinks);
		driver.quit();
		
		
	}

}
