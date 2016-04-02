package week2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Step 2: Maximize

		driver.manage().window().maximize();

		// Step 3: Set the Url

		driver.get("http://jqueryui.com/button/");

		// Step 4: Set implicit wait

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println(driver.findElement(By.xpath("/html/body/button/span")).getText());

		driver.switchTo().defaultContent();
//		driver.switchTo().frame("iframeResult");
		
//		Take a snapshot which is in temp memory
		File snapshot = driver.getScreenshotAs(OutputType.FILE);
		
//		copy the snapshot from temp memory to project path
		FileUtils.copyFile(snapshot, new File("./images/snap.jpeg"));

//		driver.close();

		
	}

}
