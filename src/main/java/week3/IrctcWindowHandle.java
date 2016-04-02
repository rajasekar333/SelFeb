package week3;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;



public class IrctcWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
	
//		System.out.println(allwindows.size());
		
		System.out.println("Title of 1st Window:- "+driver.getWindowHandle());
		driver.findElementByLinkText("Contact Us").click();
		Set <String> allwindows = driver.getWindowHandles();
		for (String eachwindow : allwindows) {
			driver.switchTo().window(eachwindow);
			
			System.out.println("Title of the window:- "+driver.getTitle());
			System.out.println("Url of the Second Window:- "+driver.getCurrentUrl());
		
			}
		
		driver.quit();
	}

}
