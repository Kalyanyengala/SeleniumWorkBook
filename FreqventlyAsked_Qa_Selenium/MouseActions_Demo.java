package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions_Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://icertindia.in/");
        driver.manage().window().maximize();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
                	
		WebElement about=driver.findElement(By.xpath("//a[normalize-space()='About us']//i[@class='fas fa-chevron-down']"));
		WebElement gallery=driver.findElement(By.xpath("//a[normalize-space()='Gallery']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(about).build().perform();
		act.moveToElement(gallery).click().perform();
		act.moveToElement(about).moveToElement(gallery).click().build().perform();
				
		//RIGHT CLICK ACTION:
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement right=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement copy=driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
		act.contextClick(right).contextClick(copy).perform();
		driver.switchTo().alert().accept();
		
		
		//Double click()

		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement box1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='field1']")));
		WebElement box2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='field2']")));
		WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Copy Text']")));
		
		
		box1.clear();
		box1.sendKeys("Welcome");
		//box2.sendKeys("Welcome");
		
		act.doubleClick(button);
		box2.getText();
		
		//DRAG AND DROP:
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='box6']")));
		WebElement italy=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='box106']")));
		
		act.dragAndDrop(rome,italy).perform();
		WebElement washing=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='box3']")));
		WebElement united=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='box103']")));
		act.dragAndDrop(washing,united).perform();
		
        

	}

}
