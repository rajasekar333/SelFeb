package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		driver.findElementByXPath("/html/body/button").click();
//		driver.findElementByTagName("Try it").click();		
		Alert newAlert =  driver.switchTo().alert();
		newAlert.sendKeys("Rajasekar");
		newAlert.accept();
		System.out.println(driver.findElementById("demo").getText());
		if(driver.findElementById("demo").getText().contains("Rajasekar"))
		{
			System.out.println("Given name is displayed");
		}
		driver.close();
	}

}
