//WAP to count the number of autosuggestion on Google link
package HandlingAutoSuggest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfAutoSuggestions {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium ");
		Thread.sleep(1000);
		
		List<WebElement> allAuto = driver.findElements(By.xpath("//div[contains(text(),'selenium')]"));
		
		int autSugCount = allAuto.size();
		
		System.out.println("Number of Auto suggesstion " +autSugCount);
	}

}
