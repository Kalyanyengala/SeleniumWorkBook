package FreqventlyAsked_Qa_Selenium;      // Tried But WontWorked!!

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrap_DropDoun_UserDefined {

	public static void main(String[] args) {
	

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		driver.get("https://twoplugs.com/newsearchserviceneed");		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
        WebElement selectBtn=driver.findElement(By.xpath("//select[@name='category_id']"));
        Select select=new Select(selectBtn);
        //select.selectByVisibleText("Accommodation & Travel");  
        selectBootStrapDropDown(driver, "Accommodation & Travel");
        
        // List<WebElement> checkbox=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
        //List<WebElement> checkbox=driver.findElements(By.xpath("//li[@style]"));
    	//System.out.println("Number of elements found: " + checkbox.size());
    	//Integer sizeofbox=checkbox.size();
    	//System.out.println(sizeofbox);
	}

public static void selectBootStrapDropDown(WebDriver driver, String... value)
{
	//List<WebElement> checkbox=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));   //First Box Failed
	//System.out.println("Number of elements found: " + checkbox.size());
	
	 List<WebElement> checkbox=driver.findElements(By.xpath("//li[@style]"));
	 System.out.println("Number of elements found: " + checkbox.size());
	 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	if (!value [0].equalsIgnoreCase("all"))
	{
		for (WebElement item: checkbox)
		{
			String option= item.getText();
			System.out.println("Options Of DropDownBox:"+ option);
			
			for (String iteamoption :value)
			{
				if(option.equals(iteamoption))
				{			
					 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", item);
					System.out.println("Options Of DropDownBox:"+ option);
					break;
				}
			}
			
		}
	}
	else
	{
		for (WebElement item:checkbox)
		{
			 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", item);
			 System.out.println("Clicking on option: " + item.getText());
		}
	}
}}


















