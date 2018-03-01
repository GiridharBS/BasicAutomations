//WAP to select and deselect optins
package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectAndDeselectOptions {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Practise/SampleWebpages/ListBox2.html");
		WebElement lstBox = driver.findElement(By.id("SLV"));
		
		Select select = new Select(lstBox);
		List<WebElement> allOptions = select.getOptions();

		for (int i=0;i<allOptions.size();i++)
		{
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		select.deselectAll();
	}

}
