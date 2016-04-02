package week1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
//		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
//		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		//Login to Opentaps
		driver.get("http://demo1.opentaps.org/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//*[@id='button']/a/img").click();
		//Create lead
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Invent Softlabs");
		driver.findElementById("createLeadForm_firstName").sendKeys("Rajasekar");
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		driver.findElementByName("submitButton").click();
		//search the lead
		driver.findElementByName("query").sendKeys("10020");
		driver.findElementByXPath("//*[@id='ext-gen574']").click();
//		driver.findElementByClassName("requiredField").getText();
//		String name = new string(test)
	}

}
