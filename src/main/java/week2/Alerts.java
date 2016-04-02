package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		//		// Step 1: Launch firefox
		//
		//		FirefoxDriver driver = new FirefoxDriver();

		// Step 1: Launch chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Step 2: Maximize

		driver.manage().window().maximize();

		// Step 3: Set the Url

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");

		// Step 4: Set implicit wait

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step 5: Find the element of user name

		// Step 6: Enter user name

		driver.findElementById("loginbutton").click();
		
		/*Thread.sleep(3000);
		
		Alert newAlert = driver.switchTo().alert();
		System.out.println(newAlert.getText());
		newAlert.accept();*/
		
		driver.findElement(By.id("usernameId")).sendKeys("Test");
		// Step 11: Close the browser

//		driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
