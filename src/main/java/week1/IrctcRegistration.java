package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IrctcRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
//		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
//		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementByLinkText("Sign up").click();
//		driver.findElementByXPath("//*[@id='loginFormId']/div[1]/div[4]/div/ul/li[2]/a").click();
		//Individual Registration
		driver.findElementByName("userName").sendKeys("Test");
		driver.findElementByName("question").sendKeys("Who was your childhood hero?");
		driver.findElementByName("answer").sendKeys("Vijay");
		driver.findElementByName("firstName").sendKeys("rajasekar");
		driver.findElementByName("lastName").sendKeys("m");
		driver.findElementByName("gender").sendKeys("Male");
		driver.findElementByName("maritalStatus").sendKeys("Unmarried");
		driver.findElementByName("day").sendKeys("15");
		driver.findElementByName("month").sendKeys("Feb");
		driver.findElementByName("year").sendKeys("1990");
		driver.findElementByName("occupation").sendKeys("Professional");
		driver.findElementById("aadharCard").sendKeys("AXPOHHF123");
		driver.findElementByName("email").sendKeys("rajasekar333.rs@gmail.com");
		driver.findElementByName("mobile").sendKeys("9944789589");
		driver.findElementByName("nationality").sendKeys("India");
		//Residential Address
		driver.findElementByName("resAddress1").sendKeys("No 13 second cross st");
		driver.findElementByName("resAddress2").sendKeys("New Bus stand");
		driver.findElementByName("resAddress3").sendKeys("Ponneri");
		driver.findElementByName("resCountry").sendKeys("India");
		driver.findElementByName("resPinCode").sendKeys("601204");
		driver.findElementById("resState").sendKeys("Tamil Nadu");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByName("resCity").sendKeys("TIRUVALLUR");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByName("resPhone").sendKeys("9944789589");
		//driver.findElementById("rdresyno").sendKeys("no");
		driver.findElementByXPath("//*[@id='rdresno']").click();
		//Office Address
		driver.findElementByName("offAddress1").sendKeys("No 2 balaji avenue 2nd street");
		driver.findElementByName("offAddress2").sendKeys("Thirumallai pillai");
		driver.findElementByName("offAddress3").sendKeys("T Nager");
		driver.findElementByName("offCountry").sendKeys("India");
		driver.findElementById("offPinCode").sendKeys("600017");
		driver.findElementById("offState").sendKeys("Tamil Nadu");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementById("offCity").sendKeys("CHENNAI");
		driver.findElementByName("offPhone").sendKeys("9944789589");
		driver.findElementByName("offPhoneExt").sendKeys("+91");
		driver.findElementByName("offFax").sendKeys("4567465556");
		driver.findElementByName("shipAddressPrefer").sendKeys("1");	
		//Other Services
		driver.findElementByXPath("//*[@id='maincontentbody']/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[1]/td[2]/input[2]").click();
		driver.findElementByXPath("//*[@id='maincontentbody']/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[2]/td[2]/input[2]").click();
		driver.findElementByXPath("//*[@id='maincontentbody']/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[3]/td[2]/input[1]").click();
		driver.findElementById("submit").click();
	}

}
