package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableWithPageNation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        
        /*Thread.sleep(1000);        
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement okButton = driver.findElement(By.xpath("//button[text()='OK']"));
        okButton.click();
        */
        
        // Sending UserName
       
        WebElement user=driver.findElement(By.xpath("//input[@id='input-username']"));
        user.click();
        user.clear();
        user.sendKeys("demo");
        
        //Sending Password
        WebElement pass=driver.findElement(By.xpath("//input[@id='input-password']"));
        pass.click();
        pass.clear();
        pass.sendKeys("demo");
        Thread.sleep(1000);
       
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));     
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='parent']")));                                    //------> Locator Failure
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='collapse-4']/li[1]/a")));
        
        String textpages=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
        System.out.println(textpages);                                           //-------> Showing 1 to 10 of 436 (44 Pages) FindOut Index ["("] and ["Pages"]
        
        int total_pages=Integer.valueOf(textpages.substring(textpages.indexOf("(")+1, textpages.indexOf("(")-1));
        System.out.println(total_pages+"TotalPages");
        
        for(int p=1; p<=total_pages; p++)
        {
        	WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//span")); //-------> Gives ActivePage For DynamicValues 
        	System.out.println("Printing ActivePage:"+ active_page.getText());
        	active_page.click();
        	
        	int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
        	System.out.println("TotalNumber Of Rows:"+rows);
        	
        	for (int r=1; r<=rows; r++)
        	{
        		// Reading Rows And Columns
        	String order=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[1]")).getText();
           	String strore=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
        	String caustomer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
        	String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
        
        	System.out.println(order+"         "+strore+"     "+caustomer+"      "+status);
        	
        	}
        	// Clicking Each And Every Page
        	String pageno=Integer.toString(p+1);
        	driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();    
        }
        
  
		
	}

}
