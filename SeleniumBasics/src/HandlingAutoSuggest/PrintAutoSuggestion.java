//WAP to print all the autosuggestions
package HandlingAutoSuggest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestion {
	
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
		
		List<WebElement> allAutoSgst = driver.findElements(By.xpath("//div[contains(text(),'selenium')]"));
									   
		int count = allAutoSgst.size();
		
		for (int i=0;i<count;i++)
		{
			String AutoSugst = allAutoSgst.get(i).getText();
			System.out.println(AutoSugst);		
		}
	}
	

}
