package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class CRSAlertFrames {

	public static void main(String[] args) {
	//Launching URL using Chrome 
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("/html/body/button").click();
	
	Alert alert1 = driver.switchTo().alert();
	
			alert1.sendKeys("Testleaf");
			alert1.accept();
			
			if (driver.findElement(By.id("demo")).getText().contains("Testleaf")) {
				System.out.println("String matches");
			}else{
				System.out.println("String doesnt matches");
			}
	}

}
