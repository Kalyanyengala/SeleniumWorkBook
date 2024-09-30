package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.get("https://the-internet.herokuapp.com/basic_auth");                    //---------> PopUPs Url
		driver.get("https://redbus.in");
		
		driver.manage().window().maximize();
		
		// Alerts1
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		
		// Conform Alerts2
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept(); 
		
		//Prompt Alerts3
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Kalyan ");
		alert.accept();
		
		// PopUps Alert4
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");           //---------> PopUPs Url We Can ByPass Admin:Password Along With Url
		
		// Notification PopUPs [Accept or Block] For This We Can handle Through ChromeOptions5
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driverd=new ChromeDriver(options);          //-------> Example
		
	

	}

}
