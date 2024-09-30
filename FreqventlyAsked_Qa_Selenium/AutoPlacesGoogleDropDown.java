package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPlacesGoogleDropDown {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		searchbox.clear();
		//searchbox.sendKeys("Torento");
		String text;
		
		do 
		{ 			
			Thread.sleep(2000);
			searchbox.sendKeys(Keys.ARROW_DOWN);
		    text=searchbox.getAttribute("value");
		  
		  if(text.equals("Toronto,ON,Canada"))
		  {
			  searchbox.sendKeys(Keys.ENTER);
			  break;
		  }
		  Thread.sleep(2000);
		}while(! text.isEmpty());
		
	}

}
