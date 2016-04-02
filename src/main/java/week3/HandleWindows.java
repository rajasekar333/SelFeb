package week3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Step 2: Maximize

		driver.manage().window().maximize();

		// Step 3: Set the Url

		driver.get("http://crystalcruises.com");

		// Step 4: Set implicit wait

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("THe window handle is : " + driver.getWindowHandle());
		System.out.println("The no of opened windows : " + allWindows.size());

		driver.findElementByLinkText("GUEST CHECK-IN").click();

		/*WebDriverWait wW = new WebDriverWait(driver, 30 );//Secs
		wW.until(ExpectedConditions .numberOfWindowsToBe(2));*/
		
		allWindows = driver.getWindowHandles();

		System.out.println("The no of opened windows : " + allWindows.size());

		System.out.println("Title of 1st window : " + driver.getTitle());

		//Code to move to last window
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		driver.quit();

	}

}
