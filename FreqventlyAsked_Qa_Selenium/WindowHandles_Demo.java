package FreqventlyAsked_Qa_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_Demo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		System.out.println(driver.getWindowHandle());
		Set<String >windowIds=driver.getWindowHandles();
		System.out.println(windowIds);
		
		Iterator<String>WinId=windowIds.iterator();
		String Parent=WinId.next();
		System.out.println("ParentId:"+Parent);
		
		String Child=WinId.next();
		System.out.println("Child Id:"+Child);
		
		List<String > Ids=new ArrayList(windowIds);
		System.out.println(Ids.get(0));
		System.out.println(driver.getTitle());
		

				
		// Approach1 Reading From Iterator
		
		/*Iterator<String> it=windowIds.iterator();
		String Parentid=it.next();
		String Childid=it.next();		
		
		System.out.println("Parent WindowId :"+Parentid);
		System.out.println("Child WindowId:"+Childid); */
		
		//Approach2 ListInterface
		
		//List<String > windowIdList=new ArrayList(windowIds);
		/*String ParentId=windowIdList.get(0);
		String ChildId=windowIdList.get(1);
		
		System.out.println("Parent WindowIdFrom List:"+ParentId);
		System.out.println("Child WindowIdFrom List:"+ChildId);
		
		// Switching To Windows
		
		driver.switchTo().window(ParentId);
		System.out.println("Parent Id :"+ driver.getTitle());
		driver.switchTo().window(ChildId);
		System.out.println("ChildId: "+driver.getTitle());*/
		
		//ForLoop 
		
		/*for(String winid:windowIdList)
		{
			String WinId=driver.switchTo().window(winid).getTitle();
			System.out.println("WindowIds:"+WinId);
			
			if(WinId.equals("OrangeHRM"))
			{
				driver.close();
			}
		}*/

		
		
		
	

	}

}
