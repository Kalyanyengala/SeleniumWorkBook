package FreqventlyAsked_Qa_Selenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Demo {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 WebElement dropdoun=driver.findElement(By.xpath("//select[@id='country']"));      //--------> Capture Element First
		 
		 Thread.sleep(2000);
		 dropdoun.click();
		
		 Select select=new Select(dropdoun);        // -------> Pass That Element As A Parameter
		// select.selectByVisibleText("India");           // ---------> This is One Approach
		//select.selectByValue("india");
		 //select.selectByIndex(10);
		 
		List<WebElement> options= select.getOptions ();    // --------->    Getting All Options 
		 
		 for (WebElement option:options)
		 {
			 if(option.getText().equals("India"))
			 {
				 option.click();
				 break;
			 }
			 
		 }
		 Thread.sleep(1000);
		 driver.close();
		 
		
		
		 

	}

}
