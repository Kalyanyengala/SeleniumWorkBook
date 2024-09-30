package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesions_Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List<WebElement> options= driver.findElements(By.xpath("//li[@class='sa_sg ']//span"));
		System.out.println(options.size());
		
		for(WebElement option:options)
		{
			if(option.getText().contains("webdriver"))
			{
				option.click();
				break;
			}
		}
		
		
		
		
		
		
		
	}

}
