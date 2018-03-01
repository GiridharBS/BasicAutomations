package HandlingListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsWithoutAnyDuplicates {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Practise/SampleWebpages/ListBox2.html");
		WebElement lstBox = driver.findElement(By.id("SLV"));
		
		Select select = new Select(lstBox);
		List<WebElement> allOptions = select.getOptions();
		TreeSet<String> allText = new TreeSet<String>();
		
		for(int i=0;i<allOptions.size();i++)
		{
			allText.add(allOptions.get(i).getText());
		}
		
		for(String text: allText)
		{
			System.out.println(text);
		}
		
		driver.close();
	}

}
