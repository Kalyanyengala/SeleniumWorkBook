package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sorting_DropDown {

	public static void main(String[] args) throws InterruptedException
{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://twoplugs.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement selectBtn=driver.findElement(By.xpath("//select[@name='category_id']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectBtn);
		Select drpselect =new Select(selectBtn);
		List<WebElement> option= drpselect.getOptions();
		
		ArrayList originalvalue=new ArrayList();
		ArrayList tempvalue=new ArrayList();
		for (WebElement options:option)
		{
		      originalvalue.add(options.getText());
		       tempvalue.add(options.getText());
		}
		System.out.println("Original Value :"+originalvalue);
		System.out.println("temp Value :"+tempvalue);
		
		Collections.sort(tempvalue);
		
		System.out.println("Original Value :"+originalvalue);
		System.out.println("temp Value After Sorted :"+tempvalue);
		
		if(originalvalue.equals(tempvalue))
		{
			System.out.println("DropDown Sorted...");
		}
		else
		{
			System.out.println("DropDown Un Sorted...");
		}
		Thread.sleep(2000);
		driver.close();
		
		
		
	

	}

}
