package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickersDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		String expectedyear="2025";
		String expectedmonth="January";
		String expecteddate="10";
		
		
		// Wait for the iframe to be available and switch to it
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='demo-frame']")));

		WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='datepicker']")));
		date.click();

		// Send date input, consider using JavaScript if this fails
		date.sendKeys("01/01/2025");

		// Wait for the current month and year to be visible
		String currentmonth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-month']"))).getText();
		String currentyear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-year']"))).getText();

		System.out.println(currentmonth + "   " + currentyear);

		
		while (true) {
		    if (currentmonth.equals(expectedmonth) && currentyear.equals(expectedyear)) {
		        break; // Break the loop if the desired month and year are found
		    } else {
		        // Wait for the next month button to be visible and click it
		        WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")));
		        nextButton.click();
		        
		        // Update current month and year after clicking the next button
		        currentmonth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-month']"))).getText();
		        currentyear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-year']"))).getText();
		    }
		}
		
		List<WebElement> dates=(List<WebElement>) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='ui-datepicker-div']//tr//td")));
		for( WebElement CurrentDate:dates)
		{
			String Date=CurrentDate.getText();
			if(Date.equals(expecteddate))
			{
				CurrentDate.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}