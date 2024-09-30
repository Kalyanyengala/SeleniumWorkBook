package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_InnerFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		 //Frame1 
		/* WebElement frame=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
		 driver.switchTo().frame(frame);		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kalyan");
		 */
		 //I Frame
		 WebElement frame1=driver.findElement(By.xpath("/html/body/center/iframe")); 
		 driver.switchTo().frame(frame1);		 
		 driver.switchTo().parentFrame();                 //---------> If you want to switch to parent frame 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();
		 
		 

	}

}
