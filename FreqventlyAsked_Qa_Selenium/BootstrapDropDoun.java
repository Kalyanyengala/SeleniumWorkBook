package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapDropDoun {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		
		
	     driver=new ChromeDriver();
	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']")).click();
		 driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();

		 List<WebElement> roles=driver.findElements(By.xpath("//div[@role='option'][@class='oxd-select-option']"));
		 selectRoleByDropDown(roles, "Qa Engineer");
	}
		 
		 

public  static  void    selectRoleByDropDown(List<WebElement> options ,   String value)
{
	WebDriver driver;
	driver=new ChromeDriver();
	 for(int i=0; i<options.size(); i++)
	 {
		 WebElement option=options.get(i);
		 
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.elementToBeClickable(option));
		 
		 
		 if (option.getText().equals(value))
		 {
			 option.click();
			 break;
			
		 }
	 }
	 
}}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


