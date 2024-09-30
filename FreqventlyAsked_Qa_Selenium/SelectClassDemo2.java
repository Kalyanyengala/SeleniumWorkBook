package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo2  extends SelectClass_Demo{

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		String world="India";
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 WebElement dropdoun=driver.findElement(By.xpath("//select[@id='country']"));      //--------> Capture Element First
		 
		 Thread.sleep(2000);
		 dropdoun.click();
		Select options=new Select(dropdoun);
		List<WebElement> option= options.getOptions();
		
		for(int i=0; i<option.size(); i++)
		{ 
		    WebElement opt=option.get(i);
			if(opt.getText().equals(world))
			{
				opt.click();
				break;
			}				
				
		}
		
		/*for (WebElement opt:option)
		{
			System.out.println(opt.getText());
		}*/
		
		
	}

}
