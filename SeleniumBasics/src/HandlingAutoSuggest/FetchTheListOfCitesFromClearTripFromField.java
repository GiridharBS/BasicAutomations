package HandlingAutoSuggest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTheListOfCitesFromClearTripFromField {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("FromTag")).sendKeys("Bang");
		Thread.sleep(1000);
		
		List<WebElement> allCities = driver.findElements(By.xpath("//li[@class='list']"));
		for(int i=0;i<allCities.size();i++)
		{
			String cityName = allCities.get(i).getText();
			if(cityName.contains("Bangkok"))
			{
				System.out.println(cityName);
				allCities.get(i).click();
			}
		}
	}
}
