package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUDM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement dropdownBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("justAnInputBox")));
        dropdownBox.click();

        selectBootStrapDropDown(driver, "choice 2");
	}


public static void selectBootStrapDropDown(WebDriver driver, String... value) {
    List<WebElement> checkbox = driver.findElements(By.xpath("//li[@class='ComboTreeItemChlid']/span[@class='comboTreeItemTitle']"));

    System.out.println("Number of elements found: " + checkbox.size());

    if (checkbox.size() == 0) {
        System.out.println("No elements found. Check the XPath or wait time.");
        return;  // Exit early if no elements are found
    }

    if (!value[0].equalsIgnoreCase("all")) {
        for (WebElement item : checkbox) {
            String option = item.getText();
            System.out.println("Option found: " + option);

            for (String iteamoption : value) {
                if (option.equals(iteamoption)) {
                    System.out.println("Clicking on option: " + option);
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", item);
                    break;
                }
            }
        }
    } else {
        for (WebElement item : checkbox) {
            System.out.println("Clicking on option: " + item.getText());
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", item);
        }
    }
}
}

