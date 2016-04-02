package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FirefoxDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver =new ChromeDriver();
		System.setProperty("webdriver.driver", "./drivers/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo1.opentaps.org/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String txt = driver.findElementByXPath("//*[@id='form']/h2").getText();
		System.out.println(txt);
		if (txt.contains("Welcome Demo Sales Manager"))
		{
			System.out.println(txt);
		}
		driver.findElementByClassName("decorativeSubmit").click();
		driver.close();
	}

}
