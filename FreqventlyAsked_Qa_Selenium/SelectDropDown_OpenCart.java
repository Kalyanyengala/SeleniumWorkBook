package FreqventlyAsked_Qa_Selenium;   

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropDown_OpenCart {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://twoplugs.com/");		
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement selectBtn=driver.findElement(By.xpath("//select[@name='category_id']"));
		Select dropdoun=new Select(selectBtn);
		//dropdoun.selectByVisibleText("Animals & Agriculture");
		//dropdoun.selectByValue("10");
		
		List<WebElement> options=dropdoun.getOptions();
		
		for(WebElement option:options)
		{
			if(option.getText().equals("Automobile"))
			{
				option.click();	
				break;
			}
		}
		

	}

}
