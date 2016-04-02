package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NamesInNoLinks {

	public static <webElements> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElementById("lst-ib").sendKeys("Rajasekar");
		driver.findElementByName("btnK").click();
		Thread.sleep(10000);
		List<WebElement> link = driver.findElementsByTagName("a");
		int count = link.size();
		System.out.println("Number of links:- "+count);
		int i =0, j=0;
		for (WebElement links : link) {
			if (links.getText().toLowerCase().contains("rajasekar"))
			{
				i++;
			}
			else
			{
				j++;	
			}
		}

		System.out.println("No.of links contains 'Rajasekar':- " +i);
		System.out.println("No.of links do not contains 'Rajasekar':- " +j);
		driver.quit();
	}

}
