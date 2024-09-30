package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		// Multiple Elements Selecting By Help Of ForLoop
		
		/*for (int i=0; i<=checkbox.size(); i++)
		{
			checkbox.get(i).click();			
			
		}*/
	
		// Clicking Multiple Elements By Help Of ForEachLoop
		
		/*for (WebElement check:checkbox)
		{
			String checkboxname=check.getAttribute("id");
			
			if(checkboxname.equals("monday")   || checkboxname.equals("tuesday"))
			{
				check.click();
			}
		}*/
		
		// Selecting Last TwoCHeckBoxes
		
		int totalbox= checkbox.size();
		for(int i=totalbox-2; i<totalbox; i++)
		{
			checkbox.get(i).click();
		}
		
		// Select FirstTwo CheckBoxes
		
		for(int i=0; i<totalbox; i++)
		{
			if(i<2)
			{
				checkbox.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
