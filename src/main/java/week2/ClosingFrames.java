package week2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		/*driver.findElementByXPath("/html/body/div[2]/p/button").click();
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		driver.findElementByXPath("/html/body/div[3]/p/button").click();*/
		List<WebElement> Button = driver.findElementsByTagName("button");
//		System.out.println(Button.get(0));
		for (WebElement link : Button) {
			if(link.getText().contains("Close Me"))
			{
				link.click();
			}
		}
		
		for (int i=0; i<Button.size();i++) {
			driver.switchTo().frame(i);
			List<WebElement>Button2 = driver.findElementsByTagName("button");
			for (WebElement link2 : Button2) {
				if(link2.getText().contains("Close Me"))
				{
					link2.click();
				}
				i++;
			}
			
		}
		
	}

}
