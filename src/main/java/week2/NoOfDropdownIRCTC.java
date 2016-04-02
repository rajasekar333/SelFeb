package week2;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class NoOfDropdownIRCTC {

	public static void main(String[] args) throws IOException {
	
	FirefoxDriver driver = new FirefoxDriver();
//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.services.irctc.co.in/cgi-bin/bv60.dll/irctc/services/register.do?click=true");
	List<WebElement> select = driver.findElementsByTagName("select");
	int count = select.size();
	System.out.println("No of Dropdown in the IRCTC Form:- " +count);
	File snapshot = driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(snapshot, new File("./images1/snap1.jpeg"));
	
	}

}
