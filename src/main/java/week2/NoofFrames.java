package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofFrames {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		List<WebElement> links = driver.findElementsByTagName("iframe");
		int count = links.size();
		System.out.println("Main Frames:- "+count);
		driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[2]"));
		List<WebElement> frames2 = driver.findElementsByTagName("iframe");
		int count2= frames2.size();
		System.out.println("Nested Frames:- " +count2);
		int totalIframes = count+count2;
		System.out.println("Total no of Frames in the webpage:- "+totalIframes);
		//driver.quit();
		driver.switchTo().frame(0);
		System.out.println(driver.getTitle());
	}

}
