package week4;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdowns {

	public static void main(String[] args) throws IOException {
		
		// Step 1: Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Step 2: Maximize the browser
		driver.manage().window().maximize();

		// Step 3: Set the Url
		driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");

		// Step 4: Set implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5: Store the element of interaction
		WebElement ele = driver.findElementById("job_role");
		
		
		// Select the value
		Select dropdown = new Select(ele);
		
//		dropdown.selectByIndex(2);
		
		dropdown.selectByValue("IT Manager/Executive");
		
		List<WebElement> allOptions = dropdown.getOptions();
		
		System.out.println("No of options : " + allOptions.size());
		
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.close();

		
	}

}
