package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetAllLinks {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.manage().window().setSize(0,0); // this is to resize
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		List<WebElement> links = driver.findElementsByTagName("a");
		
		int count = links.size();
		System.out.println(count);		
		
//		System.out.println("First Weblement:- " + links.get(0).getText());
//		System.out.println("Last Weblement:- " + links.get(count-1).getText());
		
		int j=0,k = 0;
		for (WebElement link : links) {
			if (link.getText().toLowerCase().contains("c")) {
				j++;
			}
			if (link.getSize().getWidth()>40) {
				k++;
			}
			System.out.println(link.getCssValue("text-decoration"));
		}
		System.out.println("The number of links having char : c -> "+j);
		System.out.println("The number of links that are greater than 40 px : -> "+k);
	}

}
