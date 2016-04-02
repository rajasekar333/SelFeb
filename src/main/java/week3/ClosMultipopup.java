package week3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosMultipopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://popuptest.com/");
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		Thread.sleep(30);
//		String parentHandle = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String eachWindow : allwindows) {
			driver.switchTo().window(eachWindow);
			String st = driver.getTitle();
			//System.out.println(st);
			if(st.contains("PopupTest 12"))
			{
				System.out.println(st);
			}
			else
			{
				driver.close();
			}
			//Thread.sleep(30);
			//driver.switchTo().window(parentHandle);
			//System.out.println(driver.getTitle());
		}
	}
}

