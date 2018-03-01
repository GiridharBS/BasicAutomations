//WAP to print number of links present on Google website
package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCountOfNumberOfLinks {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Number of links present on Google Website is: "+allLinks.size());
		
		driver.close();
	}

}
