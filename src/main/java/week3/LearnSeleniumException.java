package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnSeleniumException {

	static FirefoxDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
	//	
	//	lounchBrowser();
		
		
		
		try {
			verifyTitle();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		clickCRMSFA();

		closeBrowser();
	}

	public static void lounchBrowser() throws TestleafException {
		try {
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.MICROSECONDS);
			driver.manage().window().maximize();

			driver.get("http://demo1.opentaps.org");

			driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
			driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			driver.findElementByXPath("//*[@id='login']/p[3]/input").click();
		} catch (NoSuchElementException e) {
			System.out.println("Elemenet is not found : " + e.getLocalizedMessage());
		} finally {
			System.out.println("Take snapshot |  close connection | Clear files");
		}

	}

	public static void verifyTitle() throws Exception, NullPointerException {
		WebElement element = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/h222");
		
		
		String title = element.getText();
		
		
		
		System.out.println(title);
		
		
		/*try {
			WebElement element = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/h222");
			String title = element.getText();
			System.out.println(title);
			
		} catch (NoSuchElementException e) {
			System.out.println("Elemenet is not found : " + e.getLocalizedMessage());
		} finally {
			System.out.println("Verify Title");
		}*/

	}

	public static void clickCRMSFA() {
		try {
			Thread.sleep(5000);
			driver.findElementByXPath("/html/body/div[2]/div[2]/div[2]/div[1]/div/a").click();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (NoSuchElementException e) {
			System.out.println("Elemenet is not found : " + e.getLocalizedMessage());
		} finally {
			System.out.println("Take snapshot |  close connection | Clear files");
		}

	}

	public static void closeBrowser() {
		try {
			driver.quit();
//		} catch (NoSuchElementException e) {
//			System.out.println("Elemenet is not found : " + e.getLocalizedMessage());
//		}
//		catch (WebDriverException e) {
//			System.out.println("Elemenet is not found : " + e.getLocalizedMessage());
		} catch(Exception e){
			
		}
		finally {
			System.out.println("Take snapshot |  close connection | Clear files");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
