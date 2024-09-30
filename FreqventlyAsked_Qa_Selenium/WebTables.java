package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {            //------------> It Mainly Depends On Proper XPath Only!
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        
        Thread.sleep(2000);
        int rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
        int colums=driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr[1]/th")).size();
        String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[2]")).getText();
             
        System.out.println("Table Rows:"+rows);
        System.out.println("Table Columns:"+colums);
        System.out.println("Table Columns Value :"+value); 
        
       for (int r=2; r<=rows; r++)
        {
        	for (int c=1; c<=colums; c++)
        	{
        		 String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
        		 System.out.println("Data Of The Table: "+"     "+ (data));        				 
        	}
        }
         
        for (int i=2; i<=rows; i++)
        {
        	for(int c=1; c<=colums; c++)
        	{
        		String subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[3]")).getText();
        		
        		if (subject.equals("Javascript"))
            	{
            		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]")).getText();
            		String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[2]")).getText();
            		
            		System.out.println(subject+"     "  +price + "   "+ author);
            	}
        	}
        	
        }
        

	}

}
