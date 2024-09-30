package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickersDemo_2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

       // selectFutureDate(driver, "2025", "December", "23");
        selectPastDate(driver,   "2021", " December",   "23");

        driver.quit();
    }

    public static void selectFutureDate(WebDriver driver, String expectedYear, String expectedMonth, String expectedDate) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='demo-frame']")));
        WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='datepicker']")));
        dateInput.click();
        String currentMonth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-month']"))).getText();
        String currentYear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-year']"))).getText();

        while (true) {
            if (currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear)) {
                break; 
            } else {
                WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")));
                nextButton.click();
                currentMonth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-month']"))).getText();
                currentYear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-year']"))).getText();
            }
        }

        List<WebElement> dates = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='ui-datepicker-div']//tr//td")));
        for (WebElement currentDate : dates) {
            String dateText = currentDate.getText();
            if (dateText.equals(expectedDate)) {
                currentDate.click();
                break;
            }
        }
    }

    public static void selectPastDate(WebDriver driver, String expectedYear, String expectedMonth, String expectedDate) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='demo-frame']")));
        WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='datepicker']")));
        dateInput.click();

        while (true) {
            String currentMonth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-month']"))).getText();
            String currentYear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-year']"))).getText();

            if (currentYear.equals(expectedYear) && currentMonth.equals(expectedMonth)) {
                break; 
            }
            WebElement prevButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")));
            prevButton.click();
        }

        List<WebElement> allDates = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a")));
        for (WebElement currentDate : allDates) {
            String dateText = currentDate.getText();
            if (dateText.equals(expectedDate)) {
                currentDate.click();
                break;
            }
        }
    }
}
