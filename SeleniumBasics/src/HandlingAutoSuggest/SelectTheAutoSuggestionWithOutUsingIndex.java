//WAP to select SecondAutoSuggestion option without using index
package HandlingAutoSuggest;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTheAutoSuggestionWithOutUsingIndex {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement googleSearch = driver.findElement(By.id("lst-ib"));
		googleSearch.sendKeys("Selenium ");
		
		Thread.sleep(1000);
		
		googleSearch.sendKeys(Keys.ARROW_DOWN);
		googleSearch.sendKeys(Keys.ARROW_DOWN);
		googleSearch.sendKeys(Keys.ENTER);

	}

}
