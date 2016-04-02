package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class WrapperMethods implements WrapperRules {
	RemoteWebDriver driver;
	int i=1;

	public void launchApp(String browserName, String url) {
		// TODO Auto-generated method stub
		try {
			if(browserName.equalsIgnoreCase("firefoxdriver")){
				driver=new FirefoxDriver();
			}else if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:/February/TestLeaf/drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			System.out.println("The browser is successfully launched");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("The browser is not launched");	}
		finally{
			takeSnap();
		}
	}
	
	public void launchApp(String url) {
		// TODO Auto-generated method stub
		try {
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			System.out.println("Firefox browser is successfully launched");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Firefox browser is not launched");		
			}
		finally{
				takeSnap();
		}
	}

	public void enterById(String id, String dataToEnter) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).clear();
			driver.findElementById(id).sendKeys(dataToEnter);
			System.out.println("Data is successfully entered");
		} catch (NoSuchElementException e) {
			System.out.println("There is no webelement");
			// TODO Auto-generated catch block

		}finally{
			takeSnap();
		}
	}

	public void clickByClassName(String className) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.className(className)).click();
			System.out.println("Clicked Successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("There is no webelement found");
		}finally{
			takeSnap();
		}
	}

	public void verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		try {
			if(driver.getTitle().equals(expectedTitle)) {
				System.out.println("The title matches the " + expectedTitle);

			}else {
				System.out.println("The title does not match the " + expectedTitle);
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("The Browser is closed");
		}finally{
			takeSnap();
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("Browsers Closed");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Browser is not available");		
		}
	}

	public void takeSnap() {
		// TODO Auto-generated method stub
		try {
			File src=driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:/Users/suresh kumar/Desktop/Project/snap/snap"+i+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to take screens");			
		}
		i++;
	}

	public void switchToPrimaryWindow(String parentWindowHandle) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().window(parentWindowHandle);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Window/Browwser is not available");
		}finally{
			takeSnap();
		}
	}
	
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWindows= driver.getWindowHandles();
			for (String winHandles : allWindows) {
				driver.switchTo().window(winHandles);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Window/Browwser is not available");
		}finally{
			takeSnap();
		}
	}

	public void switchToFrameByElement(String frameElement) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(frameElement);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			System.out.println("Frame is not available to switch");
		}finally{
			takeSnap();
		}
	}

	public void switchToFirstFrame() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(0);
			System.out.println("Dismissed Alert successfully");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			System.out.println("Frame is not available to switch");
		}finally{
			takeSnap();
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			Alert prompt = driver.switchTo().alert();
			prompt.accept();
			System.out.println("Accepted Alert successfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.out.println("Alert is not available");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			Alert prompt = driver.switchTo().alert();
			prompt.dismiss();
			System.out.println("Dismissed Alert successfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.out.println("Alert is not available");
		}
	}

	public void verifyCurrentUrl(String expectedURL) {
		// TODO Auto-generated method stub
		try {
			if (driver.getCurrentUrl().equals(expectedURL))
				System.out.println("URL matches with expectedURL: "+ expectedURL);
			else
				System.out.println("URL does not with expectedURL "+ expectedURL);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Browser is not available");		
		}finally{
			takeSnap();
		}	
	}
	
	public void verifyTextById(String textID,String expectedText) {
		// TODO Auto-generated method stub
		try {
			if (driver.findElementById(textID).getText().equals(expectedText))
				System.out.println("Text matches with" +expectedText);
			else
				System.out.println("Text do not match with" +expectedText);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Webelement not found" +textID);		
		}
		finally{
			takeSnap();
		}
	}
	
	public void verifyTextByXpath(String textXpath,String expectedText) {
		// TODO Auto-generated method stub
		try {
			if(driver.findElementByXPath(textXpath).getText().equals(expectedText))
				System.out.println("Text matches with " +expectedText);
			else
				System.out.println("Text do not match with" +expectedText);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Webelement not found" +textXpath);		
		}finally{
			takeSnap();
		}

	}

	public void clickByLinkText(String linkText) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(linkText).click();
			System.out.println("Link" +linkText +"Clicked successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Webelement not found:" +linkText);		
		}finally{
			takeSnap();
		}

	}
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			System.out.println(name +"Clicked successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Webelement not found:" +name);		
		}finally{
			takeSnap();
		}
	}
	public void clickByXpath(String clickableXpath) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(clickableXpath).click();
			System.out.println("Webelement Clicked successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Webelement not found" +clickableXpath);		

		}finally{
			takeSnap();
		}
	}

	public void enterByName(String name, String datatoEnter) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).sendKeys(datatoEnter);
			System.out.println("Data" +datatoEnter+ "entered successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Webelement not found" +name);		
		}finally{
			takeSnap();
		}

	}
	public void enterByXpath(String xpath,String datatoEnter) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpath).sendKeys(datatoEnter);
			System.out.println("Data" +datatoEnter+ "entered successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Webelement not found" +xpath);		
		}finally{
			takeSnap();
		}
	}

	public void selectByIndex(WebElement webelement,int i){
		try {
			Select dropdown=new Select(webelement);
			dropdown.selectByIndex(i);
			System.out.println("Dropdown value with index" +i+" is selected");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Dropdown is not available");		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Browser is not available");
		}
		finally{
			takeSnap();
		}
	}
	public void selectByValue(WebElement webelement,String value){
		try {
			Select dropdown=new Select(webelement);
			dropdown.selectByValue(value);
			System.out.println("Dropdown value with value" +value+" is selected");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Dropdown is not available");		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Browser is not available");
		}
		finally{
			takeSnap();
		}
	}

	public void selectByVisibleText(WebElement webelement,String visibleText){
		try {
			Select dropdown=new Select(webelement);
			dropdown.selectByVisibleText(visibleText);
			System.out.println("Dropdown value with Visibletext" +visibleText+" is selected");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Dropdown is not available");		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Browser is not available");
		}
		finally{
			takeSnap();
		}
	}


}


