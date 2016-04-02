package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLinksOpentab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://demo1.opentaps.org/opentaps/control/main");
	List<WebElement> links = driver.findElementsByTagName("a");
	int count = links.size();
	System.out.println(count);
	int j=0, k=0;
	int l=0 ,m =0; 

	for (WebElement link : links) {
//		System.out.println(link.getText().contains("c"));
//		System.out.println(link.getText().toLowerCase().contains("c"));
		if(link.getText().toLowerCase().contains("c"))
			j++;
			else
			k++;
		
		if(link.getSize().getWidth() > 40)
			l++;
		else
			m++;
	}
	
	System.out.println("Number of links contains C:-" +j);
	System.out.println("Number of links do not contains C:-"+ k);
	System.out.println("Number of links width >40:-" +l);
	System.out.println("Number of links width <40:-" +m);
	}

}
